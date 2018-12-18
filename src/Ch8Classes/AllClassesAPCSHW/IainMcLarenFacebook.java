package Ch8Classes.AllClassesAPCSHW;



public class IainMcLarenFacebook {

    //STATE FIELDS:

    private String name;

    private int dob;

    private char gender;

    private String address;

    private String email;

    private String phoneNumber;

    private String password;

    private String education;

    private int friends;

    private String occupation;

    private String status;



    //GETTERS:

    public String getName() {

        return name;

    }

    public int getDob() {

        return dob;

    }

    public char getGender() {

        return gender;

    }

    public String getAddress() {

        return address;

    }

    public String getEmail() {

        return email;

    }

    public String getPhoneNumber() {

        return phoneNumber;

    }

    public String getEducation() {

        return education;

    }

    public int getFriends() {

        return friends;

    }

    public String getOccupation() {

        return occupation;

    }

    public String getStatus() {

        return status;

    }



    //SETTERS:

    public void setAddress(String address) {

        this.address = address;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public void setEducation(String education) {

        this.education = education;

    }

    public void setOccupation(String occupation) {

        this.occupation = occupation;

    }

    public void setStatus(String status) {

        this.status = status;

    }



    //CONSTRUCTORS:

    public IainMcLarenFacebook(String name, int dob, char gender, String address, String email, String phoneNumber,

                               String password, String occupation, String status) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.occupation = occupation;
        this.status = status;
    }

    public IainMcLarenFacebook(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }



    //BEHAVIORS:

    public String changeStatus(String status) {

        return status;

    }

    public String toString() {

        return "Name: " + name  + "\nBirthday: " + dob + "\nGender: " + gender + "\nOccupation: " + occupation;

    }







}