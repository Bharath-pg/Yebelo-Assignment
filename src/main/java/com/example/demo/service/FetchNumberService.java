package com.example.demo.service;

import com.example.demo.entity.FetchNumber;

import java.util.List;

public interface FetchNumberService {
    public FetchNumber saveCategoryCode(FetchNumber fetchNumber);

    public List<FetchNumber> fetchValue();

    public FetchNumber fetchValueByCategoryCode(String categoryCode);
    
}
