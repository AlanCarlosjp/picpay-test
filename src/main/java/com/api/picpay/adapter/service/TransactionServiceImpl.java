package com.api.picpay.adapter.service;

import com.api.picpay.application.repository.TransactionRepository;
import com.api.picpay.application.service.TransactionService;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository repositoryJpa;

    public TransactionServiceImpl(TransactionRepository repositoryJpa) {
        this.repositoryJpa = Objects.requireNonNull(repositoryJpa);
    }


}
