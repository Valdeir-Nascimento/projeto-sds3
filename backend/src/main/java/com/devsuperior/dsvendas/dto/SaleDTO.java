package com.devsuperior.dsvendas.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class SaleDTO {
    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    private SellerDTO seller;
}
