package Ch8Classes.AllClassesAPCSHW;

//Stress tests each class in possible use cases
public class IainMcLarenClient {
    public static void main(String[] args) {
        //IainMcLarenStudent
        IainMcLarenStudent stud = new IainMcLarenStudent("Iain McLaren", 110801, 'M', "21 Forest Park Ave", 11);
        System.out.println(stud);
        System.out.println(stud.getGrade() + stud.getGender() + stud.getAddress());
        //IainMcLarenBicycle
        IainMcLarenBicycle bike = new IainMcLarenBicycle(650.00, true, "New", 17, "Blue and Black");
        IainMcLarenBicycle bike2 = new IainMcLarenBicycle(650.00, true, "New", 17, "Blue and Black", 24);
        System.out.println(bike);
        System.out.println(bike.getAgeRange() + bike.getCondition());
        System.out.println(bike2);
        System.out.println(bike2.getGears());
        //IainMcLarenInBackpack
        IainMcLarenInBackpack bck = new IainMcLarenInBackpack(6, 3, 2, true, "Red", "North Face", true, false );
        System.out.println(bck);
        System.out.println("" + bck.getBinders() + "\n" + bck.isLunch());
        bck.setLunch(false);
        System.out.println(bck.isLunch());
        //IainMcLarenApple
        IainMcLarenApple yum = new IainMcLarenApple("Red", "Granny Smith", 2.2, 2.99, true, "050622018", true);
        System.out.println(yum);
        System.out.println(yum.getType() + yum.getBestByDate() + yum.isOrganic());
        //IainMcLarenFacebook
        IainMcLarenFacebook fb = new IainMcLarenFacebook("Iain McLaren", 11082001, 'M', "21 Forest Park Ave", "iainandandrew@totallyreal.gov", "12345678910", "passwordPASSWORD123123", "Mamaroneck High", "J Chillin");
        IainMcLarenFacebook fb2 = new IainMcLarenFacebook("Andrew Danziger", "andrewandiain@totallyreal.edu", "ppaasswwoorrdd112233");
        System.out.println(fb);
        System.out.println(fb2);
        fb.setOccupation("Living");
        System.out.println(fb.getOccupation());
        //Bank Account
        IainMcLarenBankAccount iain = new IainMcLarenBankAccount("Iain McLaren", 1234678910, "21 Forest Park Ave", 110801);
        iain.deposit(998987698.87);
        System.out.println(iain);
        iain.withdraw(999999);
        System.out.println("New Balance: " + iain.getBalance());
    }
}
