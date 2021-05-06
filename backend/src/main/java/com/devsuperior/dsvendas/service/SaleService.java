package com.devsuperior.dsvendas.service;

import com.devsuperior.dsvendas.converter.SaleDTOConverter;
import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.model.Sale;
import com.devsuperior.dsvendas.repository.SaleRepository;
import com.devsuperior.dsvendas.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;
    @Autowired
    private SaleDTOConverter saleDTOConverter;
    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> resposta = saleRepository.findAll(pageable);
        return resposta.map(x -> saleDTOConverter.toDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller() {
        return saleRepository.amountGroupedBySeller();
    }
    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> sucessGroupedBySeller() {
        return saleRepository.sucessGroupedBySeller();
    }

}
