package com.bankaccount.springboot.service;

import java.io.IOException;
import java.util.List;
import com.bankaccount.springboot.entity.Bank;
import com.bankaccount.springboot.helper.ExcelHelper;
import com.bankaccount.springboot.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

    @Service
    public class ExcelService {

        @Autowired
        BankRepository repository;

        public void save(MultipartFile file) {
            try {
                List<Bank> banks = ExcelHelper.excelToBanks(file.getInputStream());
                repository.saveAll(banks);
            } catch (IOException e) {
                throw new RuntimeException("fail to store excel data: " + e.getMessage());
            }
        }

        public List<Bank> getAllBanks() {
            return repository.findAll();
        }
    }

