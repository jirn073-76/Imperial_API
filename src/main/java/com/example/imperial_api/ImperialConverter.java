package com.example.imperial_api;

public class ImperialConverter {
    public double gramsToOunce(double amount) {
        return amount / 28.34952;
    }

    public double ounceToGram(double amount) {
        return amount * 28.34952;
    }
}
