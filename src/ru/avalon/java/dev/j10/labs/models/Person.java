package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.*;
/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {
    private String lastName;
    private String firstName;
    private String middleName;
    private Passport passportOfPerson;
    private String fullAddress;
    private Address address;
    
      
    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        passportOfPerson = new Passport(firstName, lastName, middleName);
        address = new Address("Санкт-Петербург", "ул.Обручевых", "д.1");
    }
    
    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        passportOfPerson = new Passport(firstName, lastName);
        address = new Address("NY", "Westminster Avenue", "775");
    }
    
    public Person(String lastName) {
        this.lastName = lastName;
        passportOfPerson = new Passport(lastName);
        address = new Address("80331 München", "Marienplatz", "8");
    }
    

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        return passportOfPerson.getDataOfPassport();
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        fullAddress = address.getAddress();
        return fullAddress;
    }
}