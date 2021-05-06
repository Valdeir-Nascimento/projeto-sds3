package com.devsuperior.dsvendas.converter;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.model.Sale;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SaleDTOConverter {

    @Autowired
    private ModelMapper modelMapper;

    public SaleDTO toDTO(Sale sale) {
        return modelMapper.map(sale, SaleDTO.class);
    }

    public List<SaleDTO> toListDTO(List<Sale> Sales) {
        return Sales
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

}
