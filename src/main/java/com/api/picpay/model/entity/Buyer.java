package com.api.picpay.model.entity;

import com.api.picpay.model.entity.base.DefaultUser;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "tb_buyer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Buyer extends DefaultUser {

    @Column(unique = true)
    private String cpf;
}
