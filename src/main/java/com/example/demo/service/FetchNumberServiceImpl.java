package com.example.demo.service;

import com.example.demo.entity.FetchNumber;
import com.example.demo.repository.FetchNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FetchNumberServiceImpl implements FetchNumberService{

    @Autowired
    private FetchNumberRepository fetchNumberRepository;

    @Override
    public FetchNumber saveCategoryCode(FetchNumber fetchNumber) {
        return fetchNumberRepository.save(fetchNumber);
    }
}
