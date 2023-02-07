package com.codewars;

public class FindOutlier {
    static int find(int[] integers) {
        int isOddArray = 0;
        int isEvenArray = 0;
        int oddNumber = -1;
        int evenNumber = -1;

        for (int number : integers) {
            if (number % 2 == 0) {
                evenNumber = number;
                isEvenArray++;
            } else {
                oddNumber = number;
                isOddArray++;
            }
        }
        if (isOddArray > isEvenArray) return evenNumber;
        else return oddNumber;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[]{2, 4, 0, 100, 4, 11, 2602, 36}));
    }
}
