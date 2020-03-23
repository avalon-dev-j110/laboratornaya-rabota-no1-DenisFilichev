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
        String fullData = fullName + ", " + bithday + ", паспорт: " + passportID + ", дата выдачи " + dateOfissue + ", орган выдачи: " + government;
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
