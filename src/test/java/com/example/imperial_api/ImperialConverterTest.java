package com.example.imperial_api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImperialConverterTest {

    ImperialConverter conv = new ImperialConverter();

    @Test
    void gramsToOunce() {
        // Arrange
        double expected = 0;

        // Act
        double actual = conv.gramsToOunce(0);

        // Assert
        assertEquals(expected, actual); // delta would be needed for other tests, since we're dealing with floating ponts!
    }

    @Test
    void ouncesToGrams() {
        // Arrange
        double expected = 1;

        // Act
        double actual = conv.ounceToGram(0.03527396583786957);

        // Assert
        assertEquals(expected, actual, 0.005f); // delta for floating point assertion
    }
}