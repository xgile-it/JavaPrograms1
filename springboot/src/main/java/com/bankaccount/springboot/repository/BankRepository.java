package com.bankaccount.springboot.repository;

import com.bankaccount.springboot.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface BankRepository extends JpaRepository<Bank, Long> {
    }
