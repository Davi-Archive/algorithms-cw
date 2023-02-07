package com.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PangramChecker {

    public static boolean check(String sentence) {
        var splitted = Arrays.stream(sentence.split(" "))
                .map(String::toLowerCase)
                .toList();
        System.out.println(splitted);
        int[] arr = new int[26];
        for (String str : splitted) {
            str.chars().forEach(x -> {
                int charSize = x - 97;
                if (charSize >= 0 && charSize <= 26) {
                    arr[charSize] = 1;
                }
            });
        };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(check("abcd5efgh,ijk,lmnopqr56stuvw3xyz"));
    }
}
