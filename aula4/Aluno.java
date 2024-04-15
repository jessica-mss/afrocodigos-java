package aula4;

public class Aluno {
    String nome;
    String raca;
    int idade;
    float mediaAnual;

    public Aluno(String nome, String raca, int idade, float mediaAnual) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public void imprimirDadosAlunos() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Nome do raça: " + raca);
        System.out.println("Nome do idade: " + idade);
        System.out.println("Nome do idade: " + mediaAnual);

    }

    public boolean alunoAprovado(float mediaAnual) {
        if (mediaAnual >= 6.0) {
            System.out.println("Aluno aprovado");
            return true;
        } else if (mediaAnual <= 5.9 && mediaAnual >= 4.0) {
            System.out.println("Aluno em recuperação");
            return true;
        } else {
            System.out.println("Aluno reprovado");
            return false;
        }
    }
}
