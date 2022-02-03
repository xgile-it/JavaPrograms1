package com.bankaccount.springboot.helper;

import com.bankaccount.springboot.entity.Bank;
import org.apache.poi.ss.usermodel.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

    public class ExcelHelper {
        public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
        static String[] HEADERS = { "Id", "Date", "Remark", "Amount","TransactionType" };
        static String SHEET = "banks";

        public static boolean hasExcelFormat(MultipartFile file) {

            return TYPE.equals(file.getContentType());
        }

        public static List<Bank> excelToBanks(InputStream is) {
            try {
                Workbook workbook = new XSSFWorkbook(is);

                Sheet sheet = workbook.getSheet(SHEET);
                Iterator<Row> rows = sheet.iterator();

                List<Bank> banks = new ArrayList<Bank>();

                int rowNumber = 0;
                while (rows.hasNext()) {
                    Row currentRow = rows.next();

                    // skip header
                    if (rowNumber == 0) {
                        rowNumber++;
                        continue;
                    }

                    Iterator<Cell> cellsInRow = currentRow.iterator();

                    Bank bank = new Bank();

                    int cellIdx = 0;
                    while (cellsInRow.hasNext()) {
                        Cell currentCell = cellsInRow.next();

                        switch (cellIdx) {
                            case 0:
                                bank.setId((long) currentCell.getNumericCellValue());
                                break;

                            case 1:
                                bank.setDate(Date.valueOf(currentCell.getStringCellValue()));
                                break;

                            case 2:
                                bank.setRemark(currentCell.getStringCellValue());
                                break;

                            case 3:
                                bank.setAmount((long) currentCell.getNumericCellValue());
                                break;

                            case 4:
                                bank.setTransactionType(currentCell.getStringCellValue());
                                break;

                            default:
                                break;
                        }

                        cellIdx++;
                    }

                   banks.add(bank);
                }

                workbook.close();

                return banks;
            } catch (IOException e) {
                throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
            }
        }
    }
