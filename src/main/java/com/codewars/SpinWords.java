package com.codewars;

import java.util.*;
import java.util.stream.Collectors;

public class SpinWords {

    public static String spinWords(String sentence) {
        var splitted = sentence.split(" ");
        StringBuilder finalWord = new StringBuilder();
        for (String word : splitted) {
            StringBuilder unreversedWord = new StringBuilder();

            if (word.length() > 5) {
                List<String> list = new ArrayList<>(List.of(word.split("")));
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == '[') {
                        finalWord.append(word.charAt(i));
                    } else {
                        list = list.stream()
                                .filter(x -> !Objects.equals(x, "["))
                                // .filter(x -> !Objects.equals(x, "]"))
                                .collect(Collectors.toList());
                    }
                }
                StringBuilder savedBoi = new StringBuilder();
                for (String character : list) {
                    savedBoi = unreversedWord.append(character);
                }
                savedBoi.reverse();
                String s ="";
                if(savedBoi.charAt(0)==']'){
                    savedBoi = new StringBuilder(savedBoi.substring(1) + ']');
                }
                finalWord.append(savedBoi);
                finalWord.append(" ");
            } else {
                finalWord.append(word).append(" ");
            }
        }
        return finalWord.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(spinWords("Just kidding [there is still] one more"));
    }
}