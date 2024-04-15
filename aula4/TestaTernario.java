package aula4;

import java.util.Scanner;

public class TestaTernario {
    public static void main(String[] args) {
        Scanner inputDoTeclado = new Scanner(System.in);

        System.out.println("Digite o 1º numero: ");
        float numeroUm = inputDoTeclado.nextFloat();

        System.out.println("Digite o 2º numero: ");
        float numeroDois = inputDoTeclado.nextFloat();

        String s = (numeroUm > numeroDois) ? "Primeiro numero é maior" : "Segundo número é maior";
        System.out.println(s);
    }
}
