package desafio.semanal.gestao.de.funcionarios;

public class Employee {

    private String name;
    private int age;
    private double salary;


    public double compensationCalculator() {
        return this.salary;
    }

    public void showEmployee() {
        System.out.println("=====================================================");
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
        System.out.println("Salário: R$" + this.salary);
        System.out.println("Compensação total: " + this.compensationCalculator());
        System.out.println("=====================================================");
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public Employee() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
