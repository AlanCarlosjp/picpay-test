package com.api.picpay.model.entity;

import com.api.picpay.model.entity.base.DefaultUser;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "tb_store")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Store extends DefaultUser {

    @Column(unique = true)
    private String cnpj;


}
