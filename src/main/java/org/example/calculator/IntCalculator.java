package org.example.calculator;

public class IntCalculator {

    public int add(int int1, int int2, int... args){
        int result = int1+int2;
        for (int arg : args) {
            result+=arg;
        }

        return result;
    }


    public int mul(int int1, int int2, int... args){
        int result = int1*int2;
        for (int arg : args) {
            result*=arg;
        }

        return result;
    }

}
