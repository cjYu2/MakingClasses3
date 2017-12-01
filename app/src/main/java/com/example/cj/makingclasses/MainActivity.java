package com.example.cj.makingclasses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Arithmetic testArithmetic = new Arithmetic();

        TaxArithmetic testTaxArithmetic = new TaxArithmetic();

        testTaxArithmetic.calculateTax(10.75, 8.5);

        testTaxArithmetic.add(4, 2);
        testTaxArithmetic.subtract(5, 4);
        testTaxArithmetic.multiply(6, 7);
        testTaxArithmetic.divide(4, 2);

        System.out.println(testArithmetic);
        System.out.println(testTaxArithmetic);
    }
}
