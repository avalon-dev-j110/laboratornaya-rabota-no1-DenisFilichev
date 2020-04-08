package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.*;

public class Main {
    public static void main(String[] args) {

        Person ivanov = new Person("Иванов", "Иван", "Иванович", null, "17.02.1999");
        ivanov.setPassportOfPerson("4105 564857", "17.02.2017", "УМВД №17");
        ivanov.setAddress("Санкт-Петербург", "ул.Обручевых", 1);
        System.out.println(ivanov);
        System.out.println(ivanov.getPassportOfPerson());
        System.out.println(ivanov.getAddress());
        
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println();
        
        Person muller = new Person("Muller", "Karl", null, null, "28.10.1982");
        muller.setPassportOfPerson("4103", "26.04.2004", "Germany");
        muller.setAddress("München", "Marienplatz", 8);
        System.out.println(muller);
        System.out.println(muller.getPassportOfPerson());
        System.out.println(muller.getAddress());
        
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println();
        
        Person smith = new Person("Smith", "John", null, "Smith", "02.02.2000");
        smith.setPassportOfPerson("54789512", "02.02.2018", "USA");
        smith.setAddress("NY", "Westminster Avenue", 775);
        System.out.println(smith);
        System.out.println(smith.getPassportOfPerson());
        System.out.println(smith.getAddress());
        
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Пример изменения полей классов");
        System.out.println();
        
        smith.setSecondName("Pol");
        smith.setDateOfissue("01.01.1999");
        smith.setHouse(56);
        System.out.println(smith);
        System.out.println(smith.getPassportOfPerson());
        System.out.println(smith.getAddress());
    }
}