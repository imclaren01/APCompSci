package Ch9Inheritence;

public class LawyerV2 extends EmployeeV2{
    public LawyerV2(String name){
        super(name);
    }
    public LawyerV2(String name, int experience){
        super(name, experience);
    }
    public int getVacationDays() {
        return 15;  //3 weeks' paid vacation
    }

    public String getVacationForm() {
        return "pink";    //use the yellow form
    }

    public void sue() {
        System.out.println("I'll see you in court!");
    }
}