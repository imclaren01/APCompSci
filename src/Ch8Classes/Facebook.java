package Ch8Classes;



public class Facebook {

    //STATE FIELDS:

    private String name;

    private int dob;

    private char gender;

    private String address;

    private String email;

    private int phoneNumber;

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

    public int getPhoneNumber() {

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

    public Facebook(String name, int dob, char gender, String address, String email, int phoneNumber,

                    String password, String occupation, String status) {

    }



    //BEHAVIORS:

    public String changeStatus(String status) {

        return status;

    }

    public String toString() {

        return "Name: " + name  + "\nBirthday: " + dob + "\nGender: " + gender + "\nOccupation: " + occupation;

    }







}