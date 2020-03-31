package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.*;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;
    private Passport passportOfPerson;
    private String fullAddress;
    private Address address;
    
    // Конструктор для создания объекта, имеющего фамилию, имя и отчество
    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        passportOfPerson = new Passport(firstName, lastName, middleName);
        address = new Address("Санкт-Петербург", "ул.Обручевых", "д.1");
    }
    
    // Конструктор для создания объекта, имеющего фамилию, первое имя и второе имя
    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        passportOfPerson = new Passport(firstName, lastName);
        address = new Address("NY", "Westminster Avenue", "775");
    }
    
    // Конструктор для создания объекта, имеющего только фамилию и имя
    public Person(String lastName) {
        this.lastName = lastName;
        passportOfPerson = new Passport(lastName);
        address = new Address("80331 München", "Marienplatz", "8");
    }

    public String getFullName() {
        return passportOfPerson.getDataOfPassport();
    }

    public String getAddress() {
        fullAddress = address.getAddress();
        return fullAddress;
    }
}