package Ch9Inheritence;

public class SecretaryV1 {
    public int getHours(){
        return 40; //Works 40 hours
    }
    public double getSalary(){
        return 40000; //Get paid $40,000/year
    }
    public int getVacationDays(){
        return 10; //2 weeks paid vacation
    }
    public String getVacationForm(){
        return "yellow"; //use the yellow form
    }
    public void takeDictation(){
        System.out.println("Dictation taken");
    }
}
