package com.api.picpay.adapter.persistence.jpa;

import com.api.picpay.model.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TransactionRepositoryJpa extends JpaRepository<Transaction, UUID> {
}
