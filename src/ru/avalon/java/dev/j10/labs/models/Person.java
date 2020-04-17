package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.*;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName = null;
    private String secondName = null;
    private String bithday;
    private Passport passportOfPerson;
    private Address address;
    
    public Person(String lastName, String firstName, String middleName, String secondName, String bithday) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.secondName = secondName;
        this.bithday = bithday;
    }
    
    public void setPassportOfPerson(String passportID, String dateOfissue, String government) {
        Passport passportOfPerson = new Passport(passportID, dateOfissue, government);
        this.passportOfPerson = passportOfPerson;
    }
    
    public void setAddress(String city, String street, int house) {
        Address address = new Address(city, street, house);
        this.address = address;
    }
    
    public Passport getPassportOfPerson (){
        return passportOfPerson;
    }
    
    public String getAddress (){
        return address.toString();
    }
    
    public String getFullName(){
        if (secondName == null)
        {
            if (middleName != null)
            {   // Создание обекта, имеющего имя, фамилию и отчество
                return "Person: " + lastName + " " + firstName + " " + middleName;
            }
            else
                {   // Создание объекта, имеющего только имя и фамилию
                    return "Person: " + lastName + " " + firstName;
                }
        }
        else   
            {   // Создание объекта, имеющего фамилию, первое имя и второе имя
                char e = secondName.charAt(0); // берем первую букву второго имени
                String shortsecondName = e + "."; // присоединяем букву второго имени к первому имени
                return "Person: " + lastName + " " + firstName + " " + shortsecondName;
            }
    }

    @Override
    public String toString() {
        return getFullName() + ", д.р. " + bithday;
    }
    
     // Ниже приведенные сетеры переменных добавлены для большей эластичности программы.

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setBithday(String bithday) {
        this.bithday = bithday;
    }
    
    public void setPassportID(String passportID) {
        passportOfPerson.setPassportID(passportID);
    }
    
    public void setDateOfissue(String dateOfissue) {
        passportOfPerson.setDateOfissue(dateOfissue);
    }
    
    public void setGovernment(String government) {
        passportOfPerson.setPassportID(government);
    }
    
    public void setCity(String city) {
        address.setCity(city);
    }
    
    public void setStreet(String street) {
        address.setStreet(street);
    }
    
    public void setHouse(int house) {
        address.setHouse(house);
    }
}