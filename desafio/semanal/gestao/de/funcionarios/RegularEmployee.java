package desafio.semanal.gestao.de.funcionarios;

public class RegularEmployee extends Employee {

    private int workSchedule;
    private double overTimeTotalCompensation;

    @Override
    public double compensationCalculator() {
        double defaultWorkSchedule = 200;
        double partialCompensation = (this.getSalary() / defaultWorkSchedule) * this.workSchedule;
        return partialCompensation + overTimeTotalCompensation;
    }


    public RegularEmployee(String name, int age, double salary, int workSchedule, double overTime) {
        super(name, age, salary);
        this.workSchedule = workSchedule;
        this.overTimeTotalCompensation = overTime;
    }

    public RegularEmployee(int workSchedule, double overTime) {
        this.workSchedule = workSchedule;
        this.overTimeTotalCompensation = overTime;
    }

    public RegularEmployee() {}

    public int getWorkSchedule() {
        return workSchedule;
    }

    public void setWorkSchedule(int workSchedule) {
        this.workSchedule = workSchedule;
    }

    public double getOverTimeTotalCompensation() {
        return overTimeTotalCompensation;
    }

    public void setOverTimeTotalCompensation(double overTimeTotalCompensation) {
        this.overTimeTotalCompensation = overTimeTotalCompensation;
    }
}
