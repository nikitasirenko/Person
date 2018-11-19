package com.Sirenko;

import java.util.Random;

import static com.Sirenko.Person.createRandomPerson;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person(Name.ANTON, Surname.GNATENKO);
        System.out.println("person1: " + person1);

        Person person2 = new Person(Name.KIRILL, Surname.IVANENKO);
        System.out.println("person2 " + person2);

        Person person3 = new Person(Name.ARTEM, Surname.SHEVCHENKO);
        System.out.println("person3: " + person3);


        for (int i = 1; i <= 100; i++ ) {
            System.out.println("Person N" + i + ": " + createRandomPerson());
        }



        }
    }
