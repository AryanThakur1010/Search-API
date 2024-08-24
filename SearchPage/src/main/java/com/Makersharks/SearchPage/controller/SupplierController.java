package com.Makersharks.SearchPage.controller;

import com.Makersharks.SearchPage.dto.SearchRequest;
import com.Makersharks.SearchPage.entity.Supplier;
import com.Makersharks.SearchPage.service.SupplierService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.domain.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Validated
@RestController
@RequestMapping("/api")
@Tag(name="Search API")
public class SupplierController {
    private SupplierService supplierService;
    public SupplierController(SupplierService supplierService){
        this.supplierService=supplierService;
    }
    @Operation(
            summary = "Search api for searching manufacturers based on buyer's customised requirements ",
            description = "Retrieve a list of X number of manufacturer(s) in a given location, with a specific nature of business, and the capability to perform a specific manufacturing process."

    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 200 OK "
    )

    @PostMapping(value = "/supplier/query", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Supplier>> searchSuppliers(@RequestParam @NotBlank String location,
                                                          @RequestParam @NotBlank String natureOfBusiness,
                                                          @RequestParam @NotBlank String manufacturingProcess,
                                                          @RequestParam(defaultValue = "0") int page,
                                                          @RequestParam(defaultValue = "10") int size){
        List<Supplier> suppliers = supplierService.searchSuppliers(location, natureOfBusiness, manufacturingProcess, page, size);
        return ResponseEntity.ok(suppliers);
    }


}
