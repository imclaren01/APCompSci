package Ch9Inheritence;

public class MarketerV2 extends EmployeeV2{
    public MarketerV2(String name){
        super(name);
    }
    public MarketerV2(String name,int experience){
        super(name, experience);
    }
    public double getSalary() {
        return 50000.0;     //$50,000/year
    }

    public void advertise() {
        System.out.println("I'll convince you to hire my law firm!");
    }
}