package com.github.curriculeon;

import java.util.Date;

public class License {
    private Date birthDate;
    private String firstName;
    private String lastName;
    private Long licenseNumber;
    private Character driverClass;

    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipcode;

    public License(
            Date birthDate,
            String firstName,
            String lastName,
            Long licenseNumber,
            Character driverClass,
            String addressLine1,
            String addressLine2,
            String city,
            String state,
            String zipcode) {
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.licenseNumber = licenseNumber;
        this.driverClass = driverClass;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(Long licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Character getDriverClass() {
        return driverClass;
    }

    public void setDriverClass(Character driverClass) {
        this.driverClass = driverClass;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
