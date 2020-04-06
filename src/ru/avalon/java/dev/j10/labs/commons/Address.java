package ru.avalon.java.dev.j10.labs.commons;

public class Address {
    private String city;
    private String street;
    private int house;
    
    public Address (String city, String street, int house){
        this.city = city;
        this.street = street;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Address: " + city + ", " + street + ", д. " + house;
    }
    
    
    // Ниже приведенные сетеры переменных добавлены для большей эластичности программы.
    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(int house) {
        this.house = house;
    }
    
}