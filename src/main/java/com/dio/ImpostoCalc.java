package com.dio;

import java.io.IOException;
import java.util.Scanner;

public class ImpostoCalc {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        //double renda = leitor.nextDouble();
        double renda = 4520.00;
        double imposto;

        if (renda > 2000) {
            imposto = calcularImposto(renda);
            System.out.println("R$ " + imposto);
        } else {
            System.out.println("Isento");
        }


    }

    private static double calcularImposto(double renda) {
        double impostoCobrados = 0;
        if (renda < 3000) {
            impostoCobrados += (renda - 2000) * 0.08;
        }
        if (renda < 4500) {
            impostoCobrados += (renda - 3000) * 0.18;
        }
        if (renda > 4500) {
            impostoCobrados += (renda - 4500) * 0.28;
        }
        return impostoCobrados;
    }

}
