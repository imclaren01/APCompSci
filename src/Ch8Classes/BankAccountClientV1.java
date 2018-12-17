package Ch8Classes;

public class BankAccountClientV1 {
    public static void main(String[] args){
        BankAccountV1 iain = new BankAccountV1("Iain McLaren", 1234678910, "21 Forest Park Ave", 110801);
        iain.deposit(998987698.87);
        System.out.println(iain);
        iain.withdraw(999999);
        System.out.println("New Balance: " + iain.getBalance());


    }

}
