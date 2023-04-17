package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class LicenseFactoryTest {
    @Test
    public void test() {
        String expectedFirstName = "Leon";
        String expectedLastName = "Hunter";
        Date expectedBirthDate = new Date();
        Long expectedDriversLicenseNumber = ThreadLocalRandom.current().nextLong();
        LicenseBuilder licenseBuilder = new LicenseBuilder()
                .setLastName(expectedLastName)
                .setFirstName(expectedFirstName)
                .setBirthDate(expectedBirthDate)
                .setLicenseNumber(expectedDriversLicenseNumber);
        LicenseFactory licenseFactory = new LicenseFactory(licenseBuilder);
        License license1 = licenseFactory.createLicense("555 Marbles Lane", "", "Gotham", "New York", "58722");
        License license2 = licenseFactory.createLicense("Leon", "Hunter", null, null);
        license1 = licenseFactory.createLicense("555 Marbles Lane", "", "Gotham", "New York", "58722");

        Assert.assertEquals(expectedFirstName, license1.getFirstName());
        Assert.assertEquals(expectedLastName, license1.getLastName());
        Assert.assertEquals(expectedBirthDate, license1.getBirthDate());
        Assert.assertEquals(expectedDriversLicenseNumber, license1.getLicenseNumber());
    }
}
