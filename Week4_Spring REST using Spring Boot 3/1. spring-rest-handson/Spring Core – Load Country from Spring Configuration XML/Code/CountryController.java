package com.example.springrest2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springrest2.model.Country;

@RestController
public class CountryController {

    @GetMapping("/country")
    public Country getCountry() {
        return new Country("India", "New Delhi");
    }
}
