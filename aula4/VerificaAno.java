package aula4;

import java.util.Scanner;

public class VerificaAno {
    public static void main(String[] args) {
        Scanner inputDoTeclado = new Scanner(System.in);

        System.out.printf("Digite o ano de referência: ");
        int ano = inputDoTeclado.nextInt();

//        String verificaAno = (ano > 365) ? "Ano Bissexto" : "Não é um ano bissexto";
//        System.out.println(verificaAno);

        String verificaAno = (isBissexto(ano)) ? "Ano Bissexto" : "Não é um ano bissexto";
        System.out.println(verificaAno);
    }

    public static boolean isBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}
