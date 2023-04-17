package com.github.curriculeon;

import java.util.Date;

public class MainApplication {
    public static void main(String[] args) {
        License license = new LicenseBuilder()
                .setBirthDate(new Date())
                .setFirstName("Leon")
                .setLastName("Hunter")
                .setLicenseNumber(12372891L)
                .setDriverClass('C')
                .setAddressLine1(null)
                .setAddressLine2(null)
                .setCity(null)
                .setState(null)
                .setZipcode(null)
                .createLicense();

    }
}
