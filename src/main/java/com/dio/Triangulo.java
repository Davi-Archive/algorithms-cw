package com.dio;

import java.io.IOException;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double maior;
        double soma;
        boolean triangulo;

        verificarTipo(A, B, C);


    }

    private static void verificarTipo(double A, double B, double C) {
        if (A + B > C && B + C > A && C + A > B) {
            System.out.println("Perimetro = " +(A + B + C));
        } else {
            System.out.println("Area = " +(((A + B) * C) / 2));
        }
    }
}
