package ca.georgiancollege.comp1011m2022test1;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Private Instance Members
public class Student {
    private int student;
    private String firstName;
    private String lastName;

    private String telephone;
    private String address;
    private String province;
    private int avgGrade;
    private String major;


    // Constructor with validator conditions
    public Student(int student, String firstName, String lastName, String telephone, String address, String province, int avgGrade, String major) {

        if(student >= 200034000){
            setStudent(student);
        }else {
            throw new IllegalArgumentException("Student number should be greater than 200034000!!!");
        }

        if(firstName != ""){

            setFirstName(firstName);
        }else {
            throw new IllegalArgumentException("First and Last name can not be smaller than one character!!!");
        }

        if(lastName!= ""){
            setLastName(lastName);
        }else {

        }

        String telephoneRegex = "^(?:\\(\\d{3}\\)|\\d{3})[- ]?\\d{3}[- ]?\\d{4}$\n";
        Pattern text = Pattern.compile(telephoneRegex);
        Matcher check = text.matcher(telephone);
        Boolean result = check.matches();
        if(result){
            throw new IllegalArgumentException("Telephone number not valid !!!");
        }else {
            setTelephone(telephone);
        }


        if (address.length() > 6){

            setAddress(address);
        }else {
            throw new IllegalArgumentException("Address cannot be smaller than 6 characters!!!");

        }

        if (state().contains(province) ){

            setProvince(province);
        }else {
            throw new IllegalArgumentException("Province is not valid!!!");

        }

        if(avgGrade >= 0 && avgGrade<=100){

            setAvgGrade(avgGrade);
        }else{
            throw new IllegalArgumentException("Average Grade should be between 0 and 100 !!!");

        }
        if(major.length() > 5){

            setMajor(major);
        }else
        {
            throw new IllegalArgumentException("Major should be greater than 5 characters !!!");
        }
    }


    // Getters and Setters with Validation conditions
    public int getStudent()
    {
        return student;
    }

    public void setStudent(int student)
    {
        if(student >= 200034000)
        {
            this.student = student;
        }else
        {
            throw new IllegalArgumentException("Student number should be greater than 200034000!!!");
        }

    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        if(firstName != "")
        {

            this.firstName = firstName;
        }else
        {
            throw new IllegalArgumentException("First and Last name can not be smaller than one character!!!");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName!= ""){
            this.lastName = lastName;
        }else {
            throw new IllegalArgumentException("First and Last name can not be smaller than one character!!!");
        }
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address.length() > 6){

            this.address = address;
        }else {
            throw new IllegalArgumentException("Address cannot be smaller than 6 characters!!!");

        }
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        if (state().contains(province) ){

            this.province = province;
        }else {
            throw new IllegalArgumentException("Province is not valid!!!");

        }

    }

    public int getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(int avgGrade) {
        if(avgGrade >= 0 && avgGrade<=100){

            this.avgGrade = avgGrade;
        }else{
            throw new IllegalArgumentException("Average Grade should be between 0 and 100 !!!");

        }
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        if(major.length() > 5){

            this.major = major;
        }else {
            throw new IllegalArgumentException("Major should be greater than 5 characters !!!");

        }

    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        String telephoneRegex = "^(?:\\(\\d{3}\\)|\\d{3})[- ]?\\d{3}[- ]?\\d{4}$\n";
        Pattern text = Pattern.compile(telephoneRegex);
        Matcher check = text.matcher(telephone);
        Boolean result = check.matches();
        if(result){
            throw new IllegalArgumentException("Telephone number not valid !!!");
        }else {
            this.telephone = telephone;
        }
    }

    public ArrayList<String> state(){
        ArrayList<String> provinceList = new ArrayList<String>();
        provinceList.add("AB");
        provinceList.add("BC");
        provinceList.add("MB");
        provinceList.add("NB");
        provinceList.add("NL");
        provinceList.add("NS");
        provinceList.add("NT");
        provinceList.add("NU");
        provinceList.add("ON");
        provinceList.add("PE");
        provinceList.add("QC");
        provinceList.add("SK");
        provinceList.add("YT");

        return provinceList;
    }

}
