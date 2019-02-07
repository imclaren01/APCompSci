package Ch9Inheritence;

public class LawyerV1 {
    public int getHours(){
        return 40; //Works 40 hours
    }
    public double getSalary(){
        return 40000; //Get paid $40,000/year
    }
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
