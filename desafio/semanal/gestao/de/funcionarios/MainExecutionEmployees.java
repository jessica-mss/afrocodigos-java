package desafio.semanal.gestao.de.funcionarios;

public class MainExecutionEmployees {

    public static void main(String[] args) {
        RegularEmployee regularEmployee = new RegularEmployee("Ana", 21, 5000, 220, 780);
        regularEmployee.showEmployee();

        Manager manager = new Manager("Ana", 21, 5000);
        manager.showEmployee();

        Director director = new Director("Ana", 21, 5000, 2);
        director.showEmployee();
    }
}
