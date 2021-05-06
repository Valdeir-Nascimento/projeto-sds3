package com.devsuperior.dsvendas.repository;

import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    @Query("select new com.devsuperior.dsvendas.dto.SaleSumDTO(obj.seller, sum(obj.amount)) " +
            "from Sale obj group by obj.seller ")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("select new com.devsuperior.dsvendas.dto.SaleSuccessDTO(obj.seller, sum(obj.visited), sum(obj.deals)) " +
            "from Sale obj group by obj.seller")
    List<SaleSuccessDTO> sucessGroupedBySeller();
}
