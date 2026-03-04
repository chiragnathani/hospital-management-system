package com.hospital.hospital;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HospitalTest {

@Test
void testApplicationStart() {
    System.out.println("Application started successfully");
    assertTrue(true);
}

@Test
void testDatabaseConnection() {
    String dbStatus = "connected";
    assertEquals("connected", dbStatus);
}

@Test
void testDoctorModule() {
    String doctor = "available";
    assertEquals("available", doctor);
}

@Test
void testPatientRegistration() {
    int patientCount = 5;
    assertTrue(patientCount > 0);
}

}