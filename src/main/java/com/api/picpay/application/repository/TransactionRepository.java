package com.api.picpay.application.repository;

import com.api.picpay.model.entity.Transaction;

public interface TransactionRepository {


    void save(Transaction transaction);



    record TransactionDto(){

    }
}
