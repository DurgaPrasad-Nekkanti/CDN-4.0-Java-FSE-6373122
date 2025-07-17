package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{number}")
    public Map<String, Object> getLoanDetails(@PathVariable String number) {
        return Map.of(
            "number", number,
            "type", "Bus",
            "loan", 9022005,
            "emi", 100802,
            "tenure", 90
        );
    }
}
