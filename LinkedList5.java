package com.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LinkedList5{
    public static void main(String[] args) {
        Hospital hospital = new Hospital("General Hospital", "123 Main St");

        Doctor alice = new Doctor("Alice", "Internal Medicine");
        Doctor bob = new Doctor("Bob", "Surgery");
        hospital.addDoctor(alice);
        hospital.addDoctor(bob);

        Patient patient1 = new Patient("Charlie", new Date(), alice);
        Patient patient2 = new Patient("Dave", new Date(), bob);
        Patient patient3 = new Patient("Eve", new Date(), alice);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);

        MedicalRecord record1 = new MedicalRecord(patient1);
        record1.addDiagnosis("Flu");
        record1.addMedication("Tylenol");
        hospital.addMedicalRecord(record1);

        MedicalRecord record2 = new MedicalRecord(patient2);
        record2.addDiagnosis("Broken arm");
        record2.addMedication("Painkillers");
        record2.addMedication("Cast");
        hospital.addMedicalRecord(record2);

        MedicalRecord record3 = new MedicalRecord(patient3);
        record3.addDiagnosis("Food poisoning");
        record3.addMedication("Antidote");
        hospital.addMedicalRecord(record3);
    }
}

class Hospital {
    String name;
    String address;
    List<Doctor> doctors;
    List<Patient> patients;
    List<MedicalRecord> medicalRecords;

    public Hospital(String name, String address) {
        this.name = name;
        this.address = address;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
        this.medicalRecords = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addMedicalRecord(MedicalRecord record) {
        medicalRecords.add(record);
    }
}

class Doctor {
    String name;
    String specialty;

    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }
}

class Patient {
    String name;
    Date dateOfBirth;
    Doctor doctor;

    public Patient(String name, Date dateOfBirth, Doctor doctor) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.doctor = doctor;
    }
}

class MedicalRecord {
    Patient patient;
    List<String> diagnoses;
    List<String> medications;

    public MedicalRecord(Patient patient) {
        this.patient = patient;
        this.diagnoses = new ArrayList<String>();
        this.medications = new ArrayList<String>();
    }

    public void addDiagnosis(String diagnosis) {
        diagnoses.add(diagnosis);
    }

    public void addMedication(String medication) {
        medications.add(medication);
    }
}

