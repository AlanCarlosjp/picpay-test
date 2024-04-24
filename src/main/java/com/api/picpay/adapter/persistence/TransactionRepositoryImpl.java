package com.api.picpay.adapter.persistence;


import com.api.picpay.adapter.persistence.jpa.TransactionRepositoryJpa;
import com.api.picpay.application.repository.TransactionRepository;
import com.api.picpay.model.entity.Transaction;
import org.springframework.stereotype.Repository;

import java.util.Objects;


@Repository
public class TransactionRepositoryImpl implements TransactionRepository {

    private final TransactionRepositoryJpa repositoryJpa;

    public TransactionRepositoryImpl(TransactionRepositoryJpa repositoryJpa) {
        this.repositoryJpa = Objects.requireNonNull(repositoryJpa);
    }

    @Override
    public void save(Transaction transaction) {

    }
}
