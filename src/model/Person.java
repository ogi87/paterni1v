/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Domenski model koji predstavlja osobu sa podacima unetim kroz formu.
 * 
 * @author student2
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private LocalDate birthDate;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, String gender, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String dateStr = birthDate != null ? birthDate.format(dtf) : "Nije unet";
        return "Ime: " + firstName + "\n" +
               "Prezime: " + lastName + "\n" +
               "Godine: " + age + "\n" +
               "Pol: " + gender + "\n" +
               "Datum rođenja: " + dateStr;
    }
}
