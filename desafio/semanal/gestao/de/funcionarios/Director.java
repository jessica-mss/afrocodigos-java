package desafio.semanal.gestao.de.funcionarios;

public class Director extends Employee {

    private double salaryAccelerator = 2;
    private int performanceTeam;
    private double performanceTeamCompensation;

    @Override
    public double compensationCalculator() {
        return this.getSalary() * salaryAccelerator + this.performanceTeamCompensation;
    }

    public Director(String name, int age, double salary, int performanceTeamCompensation) {
        super(name, age, salary);
        this.performanceTeamCompensation = performanceTeamCompensation;
    }

    public Director(int performanceTeamCompensation) {
        this.performanceTeamCompensation = performanceTeamCompensation;
    }

    public Director() {}

    public int getPerformanceTeam() {
        return performanceTeam;
    }

    public void setPerformanceTeam(int performanceTeam) {
        this.performanceTeam = performanceTeam;
    }

    public double getPerformanceTeamCompensation() {
        return performanceTeamCompensation;
    }

    public void setPerformanceTeamCompensation() {
        if (this.performanceTeam == 1) {
            this.performanceTeamCompensation = 2500;
        } else if (this.performanceTeam == 2) {
            this.performanceTeamCompensation = 5000;
        } else {
            this.performanceTeamCompensation = 7500;
        }
    }
}
