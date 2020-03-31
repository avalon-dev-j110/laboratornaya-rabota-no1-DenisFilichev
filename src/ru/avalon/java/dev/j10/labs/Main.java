package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.*;

public class Main {
      
    /*
     * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
     */
    public static void main(String[] args) {
        
        String lastName = "Smith";//Фамилия
        String firstName = "John";//Имя
        String middleName = null;//Отчество
        String secondName = "Edvard";//Второе имя
        String fullName;
        Person human;
        
        if (secondName == null)
        {
            if (middleName != null)
            {   // Создание обекта, имеющего имя, фамилию и отчество
                human = new Person(lastName, firstName, middleName);
                System.out.println(human.getFullName());
                System.out.println(human.getAddress());
            }
            else
                {   // Создание объекта, имеющего только имя и фамилию
                    fullName = lastName + " " + firstName;
                    human = new Person(fullName);
                    System.out.println(human.getFullName());
                    System.out.println(human.getAddress()); 
                }
        }
        else   
            {   // Создание объекта, имеющего фамилию, первое имя и второе имя
                char e = secondName.charAt(0); // берем первую букву второго имени
                firstName = firstName + " " + e + "."; // присоединяем букву второго имени к первому имени
                human = new Person(lastName, firstName);
                System.out.println(human.getFullName());
                System.out.println(human.getAddress());
            }
    }
}
