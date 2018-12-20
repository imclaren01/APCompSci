//Simulate simple checking acc
package Ch8Classes.AllClassesAPCSHW;
public class IainMcLarenBankAccount {
    //State fields
    private double balance;
    private String name;
    private int accountNum;
    private int ssn;
    private int pin;
    private Address address;
    private DateOfBirth dob;
    //Constructors
    public IainMcLarenBankAccount(String name, int ssn, Address address, DateOfBirth dob){
        this.name = name;
        this.ssn = ssn;
        this.address = address;
        this.dob = dob;
    }
    public IainMcLarenBankAccount(String name, int ssn, Address address, DateOfBirth dob, double balance, int pin){
        this.name = name;
        this.ssn = ssn;
        this.address = address;
        this.dob = dob;
        this.balance = balance;
        this.pin = pin;
    }
    //GETTERS

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public Address getAddress() {
        return address;
    }

    public DateOfBirth getDob() {
        return dob;
    }
    //Setters

    public void setAddress(Address address) {
        this.address = address;
    }
    //Mutators
    public void  withdraw(double amnt){
        balance -= amnt;
    }
    public void deposit(double cash){
        balance += cash;
    }
    //public deposit(String check){

    //}
    public String toString(){
        return ("Name: " + name + "\nBalance: " + balance);
    }
}
