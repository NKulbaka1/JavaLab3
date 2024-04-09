package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private String name;
    private String surname;

    private String patronymic;

    private LocalDate birthDate;

    public Person(String name, String surname, String patronymic, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
    }

    public void showInfo(){
        System.out.println("ФИО: " + surname + ' ' + name.substring(0, 1) + ". " + patronymic.substring(0, 1) + '.');
        String sex = null;
        if (patronymic.endsWith("ич")){
            sex = "Мужской";
        }
        else {
            sex = "Женский";
        }
        System.out.println("Пол: " + sex);
        Period age = Period.between(birthDate, LocalDate.now());
        System.out.println("Возраст: " + age.getYears());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

}
