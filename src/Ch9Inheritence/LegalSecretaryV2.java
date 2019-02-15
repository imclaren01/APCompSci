package Ch9Inheritence;

public class LegalSecretaryV2 extends SecretaryV2{
    public double getSalary(){
        return 45000; //Get paid $40,000/year
    }
    public void prepLegalDocs(){
        System.out.println("PREPPED");
    }
}
