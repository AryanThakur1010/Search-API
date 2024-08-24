package com.Makersharks.SearchPage.service;

import com.Makersharks.SearchPage.entity.Supplier;
import com.Makersharks.SearchPage.repository.SupplierRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.*;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {
    private SupplierRepository supplierRepository;
    public SupplierService(SupplierRepository supplierRepository){
        this.supplierRepository=supplierRepository;
    }
    public List<Supplier> searchSuppliers(String location, String natureOfBusiness, String manufacturingProcess, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(location, natureOfBusiness, manufacturingProcess);
    }

}
