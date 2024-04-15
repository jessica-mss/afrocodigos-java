package aula3;

public class Aluno {
    String nome;
    String raca;
    int idade;

    public Aluno(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public void imprimirDadosAlunos() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Nome do raça: " + raca);
        System.out.println("Nome do idade: " + idade);

    }
}
