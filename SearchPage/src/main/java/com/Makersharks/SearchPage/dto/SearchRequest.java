package com.Makersharks.SearchPage.dto;

import com.Makersharks.SearchPage.entity.Supplier;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SearchRequest {
    private String location;
    private String natureOfBusiness;
    private String manufacturingProcess;
    private int page;
    private int size;
}
