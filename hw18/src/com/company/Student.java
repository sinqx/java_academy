//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

public class Student extends Person {
    String studingPlace;
    String compName;

    public Student(String name, String surname,  int age, String hobby, String gender, String studingPlace, String compName) {
        super(name, surname,  age, hobby, gender);
        this.studingPlace = studingPlace;
        this.compName = compName;
    }

    public Student(String name, String surname, int age, String gender, String studingPlace, String compName) {
        super(name, surname,  age, gender);
        this.studingPlace = studingPlace;
        this.compName = compName;
    }

    @Override
    public String toString() {
        return "Имя " + this.name + ", место обучения: " + this.studingPlace;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Возраст введён неправильно");
        }

    }
}
