package Ch8Classes;

import Ch8Classes.AllClassesAPCSHW.IainMcLarenBankAccount;

public class BankAccountClientV1 {
    public static void main(String[] args){
        IainMcLarenBankAccount iain = new IainMcLarenBankAccount("Iain McLaren", 1234678910, "21 Forest Park Ave", 110801);
        iain.deposit(998987698.87);
        System.out.println(iain);
        iain.withdraw(999999);
        System.out.println("New Balance: " + iain.getBalance());


    }

}
