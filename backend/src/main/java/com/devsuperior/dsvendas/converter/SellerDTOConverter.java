package com.devsuperior.dsvendas.converter;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.model.Seller;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SellerDTOConverter {

    @Autowired
    private ModelMapper modelMapper;

    public SellerDTO toDTO(Seller seller) {
        return modelMapper.map(seller, SellerDTO.class);
    }

    public List<SellerDTO> toListDTO(List<Seller> sellers) {
        return sellers
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

}
