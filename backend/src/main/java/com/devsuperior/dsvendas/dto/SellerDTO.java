package com.devsuperior.dsvendas.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class SellerDTO implements Serializable {

    private Long id;
    private String name;

}
