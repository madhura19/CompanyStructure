public class TechnicalEmployee extends Employee{

    private int checkIns;

    public TechnicalEmployee(String name){
        super(name, 75000);
        this.checkIns = 0;
    }

    public String employeeStatus(){

        return getEmployeeID() + " " + getName() + " has " + getCheckIns() + " sucessful checkins";
    }

    public void setCheckIns(){
        this.checkIns++;
    }

    public int getCheckIns(){

        return this.checkIns;
    }
}
