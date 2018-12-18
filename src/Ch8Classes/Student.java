//Class simulates student portal
package Ch8Classes;

import java.math.BigInteger;

public class Student {
    //state fields
    private String name;
    private int grade;
    private int studID;
    private double gpa;
    private int dob;
    private String[] schedule;
    private String address;
    private String counselor;
    private char gender;
    private int attendance;
    //constructors
    public Student(String name, int dob, char gender, String address, int grade){
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.grade = grade;
    }
    public Student(String name, int dob, char gender, String address, int grade, double gpa){
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.grade = grade;
        this.gpa = gpa;
    }
    //getters
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getStudID() {
        return studID;
    }

    public double getGpa() {
        return gpa;
    }

    public int getDob() {
        return dob;
    }

    public String[] getSchedule() {
        return schedule;
    }

    public String getAddress() {
        return address;
    }

    public String getCounselor() {
        return counselor;
    }

    public char getGender() {
        return gender;
    }

    public int getAttendance() {
        return attendance;
    }
    //No setters
}
