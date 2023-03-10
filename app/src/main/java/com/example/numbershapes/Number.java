package com.example.numbershapes;

public class Number {
    int number;

    public boolean isSquare() {
        double squareRoot = Math.sqrt(number);
        if (squareRoot == Math.floor(squareRoot)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isTriangular() {
        int x = 1;
        int triangularNumber = 1;
        while (triangularNumber < number) {
            x++;
            triangularNumber = triangularNumber + x;
        }
        if (triangularNumber == number) {
            return true;
        } else {
            return false;
        }
    }
}
