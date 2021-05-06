package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.model.Seller;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SaleSuccessDTO {
    private String sellerName;
    private Long visited;
    private Long deals;

    public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
        sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }
}
