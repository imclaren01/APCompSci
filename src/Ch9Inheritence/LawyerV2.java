package Ch9Inheritence;

public class LawyerV2 extends EmployeeV2{
    public int getVacationDays(){
        return 15; //2 weeks paid vacation
    }
    public String getVacationForm(){
        return "pink"; //use the yellow form
    }
    public void sue(){
        System.out.println("Get sued");
    }
}
