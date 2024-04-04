package aula2;

import java.util.Scanner;

public class TestaAluno {
    public static void main(String[] args) {
        Scanner inputDoTeclado = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nomeDoAluno = inputDoTeclado.nextLine();

        System.out.println("Digite o raça do aluno: ");
        String racaDoAluno = inputDoTeclado.nextLine();

        System.out.println("Digite a idade do aluno: ");
        int  idadeDoAluno = inputDoTeclado.nextInt();

        Aluno aluno = new Aluno(nomeDoAluno, racaDoAluno, idadeDoAluno);
        aluno.imprimirDadosAlunos();

    }
}
