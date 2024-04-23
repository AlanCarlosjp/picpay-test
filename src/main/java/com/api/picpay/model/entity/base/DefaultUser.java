package com.api.picpay.model.entity.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class DefaultUser extends BaseEntity<UUID> {

    private String name;

    private Double balance;
    @Column(unique = true)
    private String email;

    private String password;

}
