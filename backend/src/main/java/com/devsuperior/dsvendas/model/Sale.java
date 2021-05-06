package com.devsuperior.dsvendas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity
@Table(name = "tb_sales")
public class Sale {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;


}
