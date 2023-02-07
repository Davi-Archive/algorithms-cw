package com.dio;

import java.io.IOException;
import java.util.Scanner;

public class ImpostoCalc {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto;

        if (renda > 2000) {
            imposto = calcularImposto(renda);
            System.out.printf("R$ %.2f",imposto);
        } else {
            System.out.println("Isento");
        }


    }

    private static double calcularImposto(double renda) {
        double impostoCobrados = 0.00f;
        if (renda > 2000) {
            impostoCobrados = eigthPercent(renda);
        }
        if (renda > 3000) {
            impostoCobrados += eighteenPercent(renda);
        }
        if (renda > 4500) {
            impostoCobrados += twentyEigth(renda);
        }
        return impostoCobrados;
    }

    private static double twentyEigth(double renda) {
        return (renda - 4500) * 0.28;
    }

    private static double eighteenPercent(double renda) {
        double currentRenda = renda > 4500 ? 4500 : renda;
        return (currentRenda - 3000) * 0.18;
    }

    private static double eigthPercent(double renda) {
        double currentRenda = renda > 3000 ? 3000 : renda;
        return (currentRenda - 2000) * 0.08;
    }

}
