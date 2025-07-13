package com.example.countryservice;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CountryController {

    List<Country> countries = new ArrayList<>();

    public CountryController() {
        countries.add(new Country("IN", "India"));
        countries.add(new Country("US", "United States"));
        countries.add(new Country("JP", "Japan"));
    }

    @GetMapping("/countries/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        return countries.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
}
