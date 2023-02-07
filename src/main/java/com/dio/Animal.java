package com.dio;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Animal {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String AN1, AN2, AN3;

        AN1 = sc.nextLine();
        AN2 = sc.nextLine();
        AN3 = sc.nextLine();

        System.out.println(checkAnimal(AN1, AN2, AN3));
    }

    private static String checkAnimal(String exosqueleto, String tipo, String comida) {
        if (Objects.equals(exosqueleto, "vertebrado")) return vertebrado(tipo, comida);
        else return invertebrado(tipo, comida);
    }

    private static String invertebrado(String tipo, String comida) {
        if (tipo.equals("inseto")) return insetoTipoComida(comida);
        else return anelidioTipoComida(comida);
    }

    private static String vertebrado(String tipo, String comida) {
        if (tipo.equals("ave")) return aveTipoComida(comida);
        else return mamiferoTipoComida(comida);
    }

    private static String anelidioTipoComida(String comida) {
        if (comida.equals("hematofago")) return "sanguessuga";
        else return "onivoro";
    }

    private static String insetoTipoComida(String comida) {
        if (comida.equals("hematofago")) return "pulga";
        else return "largata";
    }


    private static String mamiferoTipoComida(String comida) {
        if (comida.equals("onivoro")) return "homem";
        else return "vaca";
    }

    private static String aveTipoComida(String comida) {
        if (comida.equals("carnivoro")) return "aguia";
        else return "pomba";
    }
}
