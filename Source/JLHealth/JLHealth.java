/*
 * Copyright (c) 2023 - present Java Laboratory
 * by Arsam S. Kasmaie
 */

package com.javalaboratory;

@SuppressWarnings("all")
public class JLHealth {
    // This method measures body mass index
    public static double BMI(double weight, double stature) {
        double result = weight / JLMath.power(stature, 2);
        return result;
    } // end method BMI
} // end class JLHealth
