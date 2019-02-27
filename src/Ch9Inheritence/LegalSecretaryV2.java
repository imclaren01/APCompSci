package Ch9Inheritence;

public class LegalSecretaryV2 extends SecretaryV2{
    public LegalSecretaryV2(String name){
        super(name);
    }
    public LegalSecretaryV2(String name, int experience){
        super(name, experience);
    }
    public double getSalary() {
        return 45000.0;     //$45,000/year
    }
    public void getDictation(String text) {
        System.out.println("Different than secretary. " +
                "I can file all day..." + text);
    }
}