package com.irek.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();
//    @BeforeTestClass
//    public void setup(){
//        this.calculator = ;
//    }

    @Nested
    @DisplayName("Simple calculations")
    class SimpleCalculations{
        @Test
        @DisplayName("Test addition")
        void addition() {
            assertEquals(5, calculator.addition(2,3));
        }

        @Test
        @DisplayName("Test subtraction")
        void subtraction() {
            assertEquals(5, calculator.subtraction(8,3));
        }
    }

    @Nested
    @DisplayName("Advanced calculations")
    class AdvancedCalculations{
        @Test
        @DisplayName("Test multiplication")
        void multiplication() {
            assertEquals(24, calculator.multiplication(6,4));
        }

        @Test
        @DisplayName("Test division")
        void division() {
//            calculator.division(8,0);

            Assertions.assertThrows(
                ArithmeticException.class, () -> {
                    calculator.division(8,0);
                }
            );

            Assertions.assertEquals(4, calculator.division(8,2));
        }
    }
}