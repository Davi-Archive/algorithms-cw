package com.codewars;

class TriangleTester {
    public static boolean isTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        } else if (a + b > c && b + c > a && a + c > b) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(
        isTriangle(1,2,2)
        );
    }
}