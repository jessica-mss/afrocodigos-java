package aula1;

public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario funcionariaJessica = new Funcionario();
        funcionariaJessica.nome = "Jessica";
        funcionariaJessica.cargo = "Desenvolvedora";
        funcionariaJessica.salario = 15.725;

        System.out.println("A funcionária " + funcionariaJessica.nome
                + " Atua na função de " + funcionariaJessica.cargo
                + " e tem remuneração de R$ "
                + funcionariaJessica.salario);

    }
}
