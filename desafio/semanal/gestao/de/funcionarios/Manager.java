package desafio.semanal.gestao.de.funcionarios;

public class Manager extends Employee {
    private double salaryAccelerator = 1.5;

    @Override
    public double compensationCalculator() {
        return this.getSalary() * salaryAccelerator;
    }

    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    public Manager() {}

    public double getSalaryAccelerator() {
        return salaryAccelerator;
    }
}
