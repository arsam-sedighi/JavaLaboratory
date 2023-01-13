/*
 * Copyright (c) 2023 - present Java Laboratory
 * by Arsam S. Kasmaie
 */

package com.javalaboratory.JLMath;

@SuppressWarnings("all")
public class JLMath {
    public static double add(double firstNumber, double secondNumber) {
        return (firstNumber + secondNumber);
    } // end method add

    public static double subtract(double firstNumber, double secondNumber) {
        return (firstNumber - secondNumber);
    } // end method subtract

    public static double multiply(double firstNumber, double secondNumber) {
        return (firstNumber * secondNumber);
    } // end method multiply

    public static double allcate(double firstNumber, double secondNumber) {
        return (firstNumber / secondNumber);
    } // end method allcate

    public static double power(double firstNumber, double secondNumber) {
        double result = 1;
        for (int counter = 1; counter <= secondNumber; counter++) {
            result *= firstNumber;
        }
        return result;
    } // end method power
    
    public static double compare(double firstNumber, double secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        }
        else { return secondNumber; }
    } // end method compaire
    
    public static double range(double number) {
        if (number > 0) {
            return number + range(number - 1);
        }
        else { return 0; }
    } // end method range

} // end class JLMath
