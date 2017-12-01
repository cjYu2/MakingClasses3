package com.example.cj.makingclasses;

/**
 * Created by CJ on 11/30/2017.
 */
public class Arithmetic {

    public int mOperand1;
    public int mOperand2;

    public Arithmetic(){
        mOperand1 = 2;
        mOperand2 = 3;
    }

    public Arithmetic(int operand1, int operand2) {
        mOperand2 = operand2;
        mOperand1 = operand1;
    }

    public String toString() {
        return "Arithmetic Instance:  mOperand1 = " + mOperand1 + "; mOperand2 = " + mOperand2 + ".";
    }

    public int add() {
        return mOperand1 + mOperand2;
    }

    public int subtract() {
        return mOperand1 - mOperand2;
    }

    public int multiply() {
        return mOperand1 * mOperand2;
    }

    public int divide() {
        return mOperand1 / mOperand2;
    }

    public static int add(int operand1, int operand2){
        return operand1 + operand2;
    }

    public static int subtract(int operand1, int operand2){
        return operand1 - operand2;
    }
    public static int multiply(int operand1, int operand2){
        return operand1 * operand2;
    }

    public static int divide(int operand1, int operand2){
        return operand1 / operand2;
    }

}



