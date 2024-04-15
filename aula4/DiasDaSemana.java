package aula4;

import java.util.Scanner;

public class DiasDaSemana {

    public static void main(String[] args) {
        Scanner inputDoTeclado = new Scanner(System.in);

        System.out.println("Digite o numero correspondente ao dia de semana: ");
        int numeroDoDia = inputDoTeclado.nextInt();
        diaDaSemana(numeroDoDia);
    }

        public static void diaDaSemana(int quantidadeDias) {
            String dia = null;
            switch (quantidadeDias) {
                case 1:
                    dia = "Domingo";
                    break;
                case 2:
                    dia = "Segunda-feira";
                    break;
                case 3:
                    dia = "Terça-feira";
                    break;
                case 4:
                    dia = "Quarta-feira";
                    break;
                case 5:
                    dia = "Quinta-feira";
                    break;
                case 6:
                    dia = "Sexta-feira";
                    break;
                case 7:
                    dia = "Sábado";
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + quantidadeDias);
            }
            System.out.println(dia);
        }
}
