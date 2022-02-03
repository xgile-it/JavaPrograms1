package com.bankaccount.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

    @Entity
    @Table(name = "banks")
    public class Bank {

    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "date")
    private Date date;

    @Column(name = "description")
    private String remark;

    @Column(name = "amount")
    private long amount;

    @Column(name = "transaction_type")
    private String transactionType;

    public Bank() {
    }

    public Bank(long id, Date date, String remark, long amount, String transactionType) {
        this.id = id;
        this.date = date;
        this.remark = remark;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
}

