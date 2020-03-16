package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
class Passport {
    
    private String passportID;
    private String name;
    private String secondName;
    private String bithday;
    private String dateOfissue;
    private String government;
    private String fullData;

   
    public Passport(String name){
        this.passportID = "4105 564857";
        this.name = name;
        this.bithday = "17.02.1999";
        this.dateOfissue = "17.02.2017";
        this.government = "УМВД №17";
        this.fullData = "passport: " + passportID + " Name: " + name + " bithday: " + bithday + " dateOfissue: " + dateOfissue + " government: " + government;
    }
    
    public Passport(String fistName, String lastName){
        this.passportID = "54789512";
        this.secondName = secondName;
        this.bithday = "02.02.2000";
        this.dateOfissue = "02.02.2018";
        this.government = "USA";
    }
    
    public String getDataOfPassport (){
        return fullData;
    }

    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
}
