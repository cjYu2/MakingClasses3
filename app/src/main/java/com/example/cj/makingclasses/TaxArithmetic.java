package com.example.cj.makingclasses;

/**
 * Created by CJ on 11/30/2017.
 */

public class TaxArithmetic extends Arithmetic {

    public double calculateTax(double purchaseAmount, double taxRate) {
        return purchaseAmount * (taxRate/100);
    }

    public double calculateTax(double taxRate) {
        int purchaseAmount = mOperand1 + mOperand2;
        return purchaseAmount * (taxRate/100);
    }
}
