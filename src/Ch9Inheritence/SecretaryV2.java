package Ch9Inheritence;

public class SecretaryV2 extends EmployeeV2{
    public SecretaryV2(String name) {
        super(name);
    }
    public SecretaryV2(String name, int experience){
        super(name, experience);
    }
    public void getDictation(String text) {
        System.out.println("I can file all day..." + text);
    }
}