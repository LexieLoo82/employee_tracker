public abstract class Employee {
    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double percentageIncrease){
        if (percentageIncrease >= 0) {
        double percent = percentageIncrease/100;
         salary = (salary*percent) + salary;}
         return salary;
    }

    public double bonusPay(){
        double bonus = salary * 0.01;
        return bonus;
    }

    public void setName(String name) {
        if (name != null){
        this.name = name;}
    }
}
