abstract public class Employee {

    private String name;
    private double baseSalary;
    private int employeeID;
    private static int ID = 0;

    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
        ID++;
        employeeID = ID;
    }

    //methods
    public double getBaseSalary(){

        return this.baseSalary;
    }

    public String getName(){

        return this.name;
    }

    public int getEmployeeID(){

        return this.employeeID;
    }

    /*public Employee getManager(){


    }*/

    public boolean equals(Employee other){

        return this.employeeID == other.employeeID;
    }

    @Override
    public String toString() {

        return getEmployeeID() + " " + getName();
    }

    public abstract String employeeStatus();
}
