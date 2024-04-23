package com.api.picpay.adapter.outbound.controller;

import com.api.picpay.application.service.TransactionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping()
public class TransactionController {

    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = Objects.requireNonNull(service);
    }
}
