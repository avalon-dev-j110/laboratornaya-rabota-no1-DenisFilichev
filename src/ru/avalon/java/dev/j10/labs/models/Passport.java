package ru.avalon.java.dev.j10.labs.models;

class Passport {
    private String fullName;
    private String bithday;
    private String passportID;
    private String dateOfissue;
    private String government;

   // Создание объекта для персоны имеющей фамилию, имя и отчество
    public Passport(String firstName, String lastName, String middleName){
        fullName = lastName + " " + firstName + " " + middleName;
        this.bithday = "17.02.1999";
        this.passportID = "4105 564857";
        this.dateOfissue = "17.02.2017";
        this.government = "УМВД №17";
    }
    
    // Создание объекта для персоны имеющей фамилию, первое имя и второе имя
    public Passport(String lastName, String firstName){
        
        fullName = lastName + " " + firstName;
        this.bithday = "02.02.2000";
        this.passportID = "54789512";
        this.dateOfissue = "02.02.2018";
        this.government = "USA";
    }
    
    // Создание объекта для персоны имеющей только фамилию и имя
    public Passport(String lastName){
        fullName = lastName;
        this.bithday = "28.10.1982";
        this.passportID = "4103";
        this.dateOfissue = "26.04.2004";
        this.government = "Germany";
    }
    
    // Передача полных данных: Ф.И.О. персоны + данные паспорта
    public String getDataOfPassport (){
        return fullName + ", " + bithday + ", паспорт: " + passportID + ", дата выдачи " + dateOfissue + ", орган выдачи: " + government;
    }
}
