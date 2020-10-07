package com.company;

import java.time.LocalDate;

public class Patient {
    private int id;
    private String firstName, lastName, phoneNum, streetAddress, city, province;
    private LocalDate birthday;

    public Patient(String firstName, String lastName, String phoneNum, String streetAddress, String city, String province, LocalDate birthday) {
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNum(phoneNum);
        setStreetAddress(streetAddress);
        setCity(city);
        setProvince(province);
        setBirthday(birthday);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id>0)
        this.id = id;
        else throw new IllegalArgumentException("id must be greater than 0");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.matches("[A-Z][a-zA-Z\\-\\s]*"))
        this.firstName = firstName;
        else throw new IllegalArgumentException("First Name must start with uppercase");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.matches("[A-Z][a-zA-Z\\-\\s]*"))
            this.lastName = lastName;
        else throw new IllegalArgumentException("Last Name must start with uppercase");

    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        if(phoneNum.matches("\\(?[2-9]\\d{2}\\)[2-9]"))
        this.phoneNum = phoneNum;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}