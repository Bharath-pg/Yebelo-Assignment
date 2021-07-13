package com.example.demo.controller;

import com.example.demo.entity.FetchNumber;
import com.example.demo.service.FetchNumberService;
import com.example.demo.service.FetchNumberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FetchNumberController {

    @Autowired
    private FetchNumberService fetchNumberService;

    @PostMapping("/save")
    public FetchNumber saveCategoryCode(@RequestBody FetchNumber fetchNumber) {
        return fetchNumberService.saveCategoryCode(fetchNumber);
    }

    @GetMapping("/fetchAll")
    public List<FetchNumber> fetchValue() {
        return fetchNumberService.fetchValue();
    }

    @GetMapping("/fetchvalue/{code}")
    public FetchNumber fetchValueByCategoryCode(@PathVariable("code") String categoryCode) {
        return fetchNumberService.fetchValueByCategoryCode(categoryCode);
    }

}
