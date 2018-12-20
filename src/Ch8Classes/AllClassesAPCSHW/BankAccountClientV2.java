package Ch8Classes.AllClassesAPCSHW;

import Ch8Classes.AllClassesAPCSHW.IainMcLarenBankAccount;

public class BankAccountClientV2 {
    public static void main(String[] args){
        Address iainAddress = new Address(21, "Forest Park Ave", "Larchmont", "NY", 10538);
        IainMcLarenBankAccount iain = new IainMcLarenBankAccount("Iain McLaren", 1234678910, new Address(21, "Forest Park Ave", "Larchmont", "NY", 10538), new DateOfBirth(8, 11, 2001));
        iain.deposit(998987698.87);
        System.out.println(iain);
        iain.withdraw(999999);
        System.out.println("New Balance: " + iain.getBalance());


    }

}
