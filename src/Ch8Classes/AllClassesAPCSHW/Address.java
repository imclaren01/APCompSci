package Ch8Classes.AllClassesAPCSHW;

public class Address {
    //State fields
    private int houseNum;
    private String aptnum;
    private String street;
    private String city;
    private String state;
    private int zipcode;
    //Constructors

    public Address(int houseNum, String street, String city, String state, int zipcode) {
        this.houseNum = houseNum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public Address(int houseNum, String aptnum, String street, String city, String state, int zipcode) {
        this.houseNum = houseNum;
        this.aptnum = aptnum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }
    //Getters

    public int getHouseNum() {
        return houseNum;
    }

    public String getAptnum() {
        return aptnum;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipcode() {
        return zipcode;
    }
    //Setters

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public void setAptnum(String aptnum) {
        this.aptnum = aptnum;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
    //ToString
    public String toString() {
        return "The address is: " +
                "\nHouse number: " + houseNum +
                "\nApartment Number: '" + aptnum + '\'' +
                "\nStreet: '" + street + '\'' +
                "\nCity: '" + city + '\'' +
                "\nState: '" + state + '\'' +
                "\nZipcode: " + zipcode;
    }
}
