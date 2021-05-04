package com.paye.model;

public class PayeModel {

    public  double salary;
    public int year;
    public int age;
    public double medicalAid;

    public PayeModel() {
    }

    public PayeModel(double salary, int year, int age, double medicalAid) {
        this.salary = salary;
        this.year = year;
        this.age = age;
        this.medicalAid = medicalAid;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMedicalAid() {
        return medicalAid;
    }

    public void setMedicalAid(double medicalAid) {
        this.medicalAid = medicalAid;
    }
}
