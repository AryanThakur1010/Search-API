package com.Makersharks.SearchPage.repository;

import com.Makersharks.SearchPage.entity.Supplier;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier,Long> {
    List<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(String location, String natureOfBusiness, String manufacturingProcess);
}
