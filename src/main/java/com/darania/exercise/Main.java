package com.darania.exercise;
/*- Create gender enum
- Create a class Person with Name and Gender
- Take the following imperative code and turn into declarative using Streams.*/

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

       // Person person = new Person();

        List<Person.Person1> people = List.of(
                new Person.Person1("Smith", Gender.FEMALE),
                new Person.Person1("Anna", Gender.FEMALE),
                new Person.Person1("Alex", Gender.MALE),
                new Person.Person1("Oliver", Gender.MALE)
        );

        //declarative programming method using streams:

        List<Person.Person1> females = people.stream()
                .filter(person1 -> person1.gender.equals(Gender.FEMALE))
                .collect(Collectors.toList());

        females.forEach(System.out::println);


        //imperative programming method:

       /* List<Person> female = new ArrayList<>();

        people.forEach(person -> {
            var isGender = person.gender.equals(Gender.FEMALE);
            if (isGender) {
                female.add(person);
            }
        });
        */

    }
}
