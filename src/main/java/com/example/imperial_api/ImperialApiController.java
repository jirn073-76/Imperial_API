package com.example.imperial_api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImperialApiController {
    private ImperialConverter conv = new ImperialConverter();

    @RequestMapping("/gramsToOunce")
    public double gramsToOunce(@RequestParam double amount){
        return conv.gramsToOunce(amount);
    }

    @RequestMapping("/ouncesToGram")
    public double ounceToGram(@RequestParam double amount){
        return conv.ounceToGram(amount);
    }
}
