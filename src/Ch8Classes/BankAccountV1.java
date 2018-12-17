//Simulate simple checking acc
package Ch8Classes;
public class BankAccountV1 {
    //State fields
    private double balance;
    private String name;
    private int accountNum;
    private int ssn;
    private int pin;
    private String address;
    private int dob;
    //Constructors
    public BankAccountV1(String name, int ssn, String address, int dob){
        this.name = name;
        this.ssn = ssn;
        this.address = address;
        this.dob = dob;
    }
    public BankAccountV1(String name, int ssn, String address, int dob, double balance, int pin){
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

    public String getAddress() {
        return address;
    }

    public int getDob() {
        return dob;
    }
    //Setters

    public void setAddress(String address) {
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
