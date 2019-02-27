package Ch9Inheritence;

public class MyLawFirmV2 {
    public static void main(String[] args) {
        EmployeeV2[] myEmployees = {new LawyerV2("Gaby", 10),
                new SecretaryV2("Andrew", 15),
                new MarketerV2("Charlie", 2),
                new LegalSecretaryV2("Jackson", 232),
                new LawyerV2("Iain")};
        printInfo(myEmployees);

    }

    public static void printInfo(EmployeeV2[] staff) {
               //var == also known as ITERATOR
        //Datatype    //var  :  //container
        for(EmployeeV2 people : staff){
            System.out.println("name: " + people.getName());
            System.out.println("experience: "+ people.getExperience());
            System.out.println("salary: " + people.getSalary());
            System.out.println("vacation days: " + people.getVacationDays());
            System.out.println("vacation form color: " + people.getVacationForm());
            System.out.println();
        }

        for (int i = 0; i < staff.length; i++) {
            System.out.println("name: " + staff[i].getName());
            System.out.println("experience: "+ staff[i].getExperience());
            System.out.println("salary: " + staff[i].getSalary());
            System.out.println("vacation days: " + staff[i].getVacationDays());
            System.out.println("vacation form color: " + staff[i].getVacationForm());
            System.out.println();
        }

    }
}