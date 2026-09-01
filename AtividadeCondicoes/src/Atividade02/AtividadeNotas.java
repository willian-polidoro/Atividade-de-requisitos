package Atividade02;

import java.util.Scanner;

public class AtividadeNotas {
    public static void main(String[] args) {

        double nota = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua nota: ");
        nota = sc.nextDouble();
        if(nota >=0 && nota <=10){
            //Aqui vai a lógica das notas

            if(nota>=9){
                System.out.println("Nota excelentee");
            }else if(nota>=7){
                System.out.println("Nota Boa");
            }else if(nota>=5){
                System.out.println("Satisfatória");
            }else{
                System.out.println("Nota ruim");
            }

        }else{
            System.err.println("Nota inválida");
        }
    }


}
