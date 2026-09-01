package Atividade05;

import java.util.Scanner;

public class VerificacaoDeDiasDaSemana {
    public static void main(String[] args) {


        int numero;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        numero = sc.nextInt();
        switch (numero) {
            case 1 -> System.out.println("Segunda ");
            case 2 -> System.out.println("Terça ");
            case 3 -> System.out.println("Quarta ");
            case 4 -> System.out.println("Quinta ");
            case 5 -> System.out.println("Sexta ");
            case 6 -> System.out.println("Sabado ");
            case 7 -> System.out.println("Domingo ");

        }

        }
    }
