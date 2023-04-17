package com.github.curriculeon;

import java.util.Date;

public class LicenseFactory {
    private LicenseBuilder licenseBuilder;

    public LicenseFactory(LicenseBuilder licenseBuilder) {
        this.licenseBuilder = licenseBuilder;
    }

    public LicenseBuilder getLicenseBuilder() {
        return new LicenseBuilder(licenseBuilder);
    }

    public License createLicense(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        return getLicenseBuilder()
                .setAddressLine1(addressLine1)
                .setAddressLine2(addressLine2)
                .setCity(city)
                .setState(state)
                .setZipcode(zipcode)
                .createLicense();
    }
    public License createLicense(String firstName, String lastName, Date birthdate, Long licenseNumber) {
        return getLicenseBuilder()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setBirthDate(birthdate)
                .setLicenseNumber(licenseNumber)
                .createLicense();
    }
}
