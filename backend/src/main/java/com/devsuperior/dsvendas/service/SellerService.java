package com.devsuperior.dsvendas.service;

import com.devsuperior.dsvendas.converter.SellerDTOConverter;
import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;
    @Autowired
    private SellerDTOConverter sellerDTOConverter;

    public List<SellerDTO> findAll() {
       return sellerDTOConverter.toListDTO(sellerRepository.findAll());
    }

}
