package com.Sirenko;

import java.util.Random;

public class Person {

    private Name name;

    private Surname surname;

    private int age;

    private int weight;

    private int height;

    public Person(Name name, Surname surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setSurname(Surname surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Name getName() {
        return name;
    }

    public Surname getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", surname=" + surname +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
    public static String createRandomPerson () {
        String[] names = {"ANTON", "ARTEM", "IVAN", "FEDOR", "KIRILL", "DENIS"};
        Random random = new Random();
        String name = names[random.nextInt(names.length)];

        String[] surnames = {"SIDORENKO", "IVANENKO", "SHEVCHENKO", "GNATENKO", "PETRENKO", "VARENKO"};
        String surname = surnames[random.nextInt(surnames.length)];

        return name + " " + surname;

    }
}
