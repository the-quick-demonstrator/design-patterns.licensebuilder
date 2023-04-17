package com.github.curriculeon;

import java.util.Date;

public class LicenseBuilder {
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

    public LicenseBuilder() {
    }

    public LicenseBuilder(
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
        this(new LicenseBuilder()
                .setBirthDate(birthDate)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setLicenseNumber(licenseNumber)
                .setDriverClass(driverClass)
                .setAddressLine1(addressLine1)
                .setAddressLine2(addressLine2)
                .setCity(city)
                .setState(state)
                .setZipcode(zipcode));
    }

    public LicenseBuilder(LicenseBuilder licenseBuilderToBeCloned) {
        this.firstName = licenseBuilderToBeCloned.firstName;
        this.lastName = licenseBuilderToBeCloned.lastName;
        this.birthDate = licenseBuilderToBeCloned.birthDate;
        this.licenseNumber = licenseBuilderToBeCloned.licenseNumber;
        this.driverClass = licenseBuilderToBeCloned.driverClass;
        this.addressLine1 = licenseBuilderToBeCloned.addressLine1;
        this.addressLine2 = licenseBuilderToBeCloned.addressLine2;
        this.city = licenseBuilderToBeCloned.city;
        this.state = licenseBuilderToBeCloned.state;
        this.zipcode = licenseBuilderToBeCloned.zipcode;
    }

    public LicenseBuilder setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public LicenseBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public LicenseBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public LicenseBuilder setLicenseNumber(Long licenseNumber) {
        this.licenseNumber = licenseNumber;
        return this;
    }

    public LicenseBuilder setDriverClass(Character driverClass) {
        this.driverClass = driverClass;
        return this;
    }

    public LicenseBuilder setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    public LicenseBuilder setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    public LicenseBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public LicenseBuilder setState(String state) {
        this.state = state;
        return this;
    }

    public LicenseBuilder setZipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    public License createLicense() {
        return new License(
                birthDate,
                firstName,
                lastName,
                licenseNumber,
                driverClass,
                addressLine1,
                addressLine2,
                city,
                state,
                zipcode);
    }
}