public class Director extends Manager {
 private double budget;
 private double salary;

    public Director(String name, String niNumber, double salary, String deptName, double budget){
        super(name, niNumber, salary, deptName);
        this.salary = salary;
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double bonusPay() {
        double bonus = (salary * 0.02);
        return bonus;
    }
}
