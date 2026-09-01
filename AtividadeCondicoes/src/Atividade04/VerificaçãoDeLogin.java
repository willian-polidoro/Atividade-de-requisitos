package Atividade04;

import java.util.Scanner;

public class VerificaçãoDeLogin {
    public static void main(String[] args) {

        String nomeCorreto = "Willian";
        String senhaCorreto = "1234";

        String nome;
        String senha;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();
        System.out.println("Informe sua senha: ");
        senha = sc.next();

        if (nome.equals(nomeCorreto) && senha.equals(senhaCorreto)) {
            System.out.println("Login efetuado com sucesso");
        }else{
            System.out.println("Erro ao tentar login");
        }




    }
}
