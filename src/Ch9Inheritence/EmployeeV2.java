package Ch9Inheritence;

public class EmployeeV2 {
    private String name;
    private int experience;

    public int getExperience() {
        return experience;
    }

    public EmployeeV2(String name){
        this.name = name;
    }
    public EmployeeV2(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public int getHours() {
        return 40;  //works 40 hours/week
    }

    public double getSalary() {
        return 40000.0;     //$40,000/year
    }

    public EmployeeV2(int experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getVacationDays() {
        return 10;  //2 weeks' paid vacation
    }

    public String getVacationForm() {
        return "yellow";    //use the yellow form
    }
}