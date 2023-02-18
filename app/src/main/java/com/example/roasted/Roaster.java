package com.example.roasted;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Roaster  {
    private String phoneNum;
    private String Email;
    private String companyName;
    private String password;
    private String comAddress;
    private String regNumber;

    public Roaster(String phoneNum, String email, String companyName, String password, String comAddress, String regNumber) {
        this.phoneNum = phoneNum;
        this.Email = email;
        this.companyName = companyName;
        this.password = password;
        this.comAddress = comAddress;
        this.regNumber = regNumber;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String email) {
        Email = regNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getComAddress() {
        return comAddress;
    }

    public void setComAddress(String comAddress) {
        this.comAddress = comAddress;
    }


    @Override
    public String toString() {
        return "Roaster{" +
                "phoneNum='" + phoneNum + '\'' +
                ", Email='" + Email + '\'' +
                ", companyName='" + companyName + '\'' +
                ", password='" + password + '\'' +
                ", comAddress='" + comAddress + '\'' +
                ", regNumber='" + regNumber + '\'' +
                '}';
    }
}

