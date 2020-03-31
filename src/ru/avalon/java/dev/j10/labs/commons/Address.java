package ru.avalon.java.dev.j10.labs.commons;

public class Address {
    private String city;
    private String street;
    private String house;
    public Address (String city, String street, String house){
        this.city = city;
        this.street = street;
        this.house = house;
    }
    
    public String getAddress (){
        return city + ", " + street + ", " + house;
    }
}