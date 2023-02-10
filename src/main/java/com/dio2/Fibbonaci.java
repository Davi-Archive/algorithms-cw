package com.dio2;

import java.io.IOException;
import java.util.Scanner;

public class Fibbonaci {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int num1 = 1, num2 = 0;

        for(int i = 1; i <= N+1; i++){
            if(i < 3&& i > 1){
                System.out.print(num2+" ");
                System.out.print(num1+" ");
            }
            if(i>3){
                num1 = num1 + num2;
                num2 = num1 - num2;
                System.out.print(num1+" ");
            }
        }
    }
}
