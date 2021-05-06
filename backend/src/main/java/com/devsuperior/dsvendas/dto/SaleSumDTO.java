package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.model.Seller;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SaleSumDTO {
    private String sellerName;
    private Double sum;

    public SaleSumDTO(Seller seller, Double sum) {
        this.sellerName = seller.getName();
        this.sum = sum;
    }
}
