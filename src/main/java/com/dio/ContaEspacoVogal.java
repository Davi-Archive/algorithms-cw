package com.dio;

import java.util.Scanner;

public class ContaEspacoVogal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strSplit = str.toLowerCase().split(" ");
        String[] arrVogais = {"a", "e", "i", "o", "u"};
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;


        for (String item : strSplit) {
            quantVogais += checarPalavraMelhorComplexidadeDeTempo(item, arrVogais);
        }
        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }

    private static int checarPalavraMelhorComplexidadeDeTempo(String item, String[] arrVogais) {
        String[] itemArr = item.split("");

        int[] itemHash = hashMethod(itemArr);
        int[] vogalsHash = hashMethod(arrVogais);

        return compareCountingVogals(itemHash, vogalsHash);
    }

    private static int compareCountingVogals(int[] itemHash, int[] vogalsHash) {
        int vogals = 0;
        for (int i = 0; i < itemHash.length; i++) {
            if (itemHash[i] > 0 && vogalsHash[i] > 0) {
                vogals += itemHash[i];
            }
        }
        return vogals;
    }

    private static int[] hashMethod(String[] array) {
        int[] charsHash = new int[26];
        char[] givenString = new char[array.length];

        for (int i = 0; i < array.length; i++) {
            givenString[i] = array[i].charAt(0);
        }

        for (int j = 0; j < givenString.length; j++) {
            int charNumber = givenString[j] - 97;
            charsHash[charNumber]++;
        }
        return charsHash;
    }
}
