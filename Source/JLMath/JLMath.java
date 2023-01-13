/*
 * Copyright (c) 2023 - present Java Laboratory
 * by Arsam S. Kasmaie
 */

package com.javalaboratory.JLMath;

@SuppressWarnings("all")
public class JLMath {
    // This method adds two numbers together
    public static double add(double firstNumber, double secondNumber) {
        return (firstNumber + secondNumber);
    } // end method add

    // This method subtracts two numbers
    public static double subtract(double firstNumber, double secondNumber) {
        return (firstNumber - secondNumber);
    } // end method subtract

    // This method multiplies two numbers together
    public static double multiply(double firstNumber, double secondNumber) {
        return (firstNumber * secondNumber);
    } // end method multiply

    // This method divides two numbers
    public static double divide(double firstNumber, double secondNumber) {
        return (firstNumber / secondNumber);
    } // end method divide

    // This method exponentiates two numbers
    public static double power(double firstNumber, double secondNumber) {
        double result = 1;
        for (int counter = 1; counter <= secondNumber; counter++) {
            result *= firstNumber;
        }
        return result;
    } // end method power
    
    // This method compares two numbers
    public static double compare(double firstNumber, double secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        }
        else { return secondNumber; }
    } // end method compaire
    
    // This method adds a sequence of numbers together
    public static double range(double number) {
        if (number > 0) {
            return number + range(number - 1);
        }
        else { return 0; }
    } // end method range
} // end class JLMath
