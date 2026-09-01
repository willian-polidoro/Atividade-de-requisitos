package Atividade03;

import java.util.Scanner;

public class AtividadeParOuImpar {

    public static void main(String[] args) {

        int numero = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número Inteiro");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número " + numero+ " é par");
        } else {
            System.out.println("Número " + numero+ " é impar");
        }
    }


    }









