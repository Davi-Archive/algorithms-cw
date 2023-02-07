package com.dio;

import java.util.Scanner;

public class Quitanda {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();

        double valorCalculado = calcularMorango(morangos) + calcularMaca(macas);
        double novoValor = 0.0;
        int pesoTotal = morangos + macas;

        if (valorCalculado > 25.00 || pesoTotal > 8) {
            novoValor = valorCalculado - (valorCalculado * 0.1);
        } else {
            novoValor = valorCalculado;
        }

        System.out.println(novoValor);
    }

    private static Double calcularMorango(int kilosMorangos) {
        if (kilosMorangos <= 5) {
            return kilosMorangos * 2.50;
        } else {
            return kilosMorangos * 2.20;
        }
    }

    private static Double calcularMaca(int kilosMacas) {
        if (kilosMacas <= 5) {
            return kilosMacas * 1.80;
        } else {
            return kilosMacas * 1.50;
        }
    }


}
