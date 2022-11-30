package org.example;

/**
 * Структура данных Person
 */
public class Person {
             private int id;
             private String name;
             private String gender;
             private String BirtDate;
             private Division division;
             Person() { division = new Division(); }
             private int Salary;
             /**
              * Сеттер для поля id
              * @param id содержимое поля
              */
             public void set_id(int id) { this.id = id; }
             /**
              * Сеттер для поля name
              * @param name содержимое поля
              */
             public void set_name(String name) { this.name = name; }
             /**
              * Сеттер для поля gender
              * @param gender содержимое поля
              */
             public void set_gender(String gender) { this.gender = gender; }
             /**
              * Сеттер для поля BirtDate
              * @param BirtDate содержимое поля
              */
             public void set_BirtDate(String BirtDate) { this.BirtDate = BirtDate; }
             /**
              * Сеттер для поля division
              * @param id содержимое подполя
              * @param name содержимое подполя
              */
             public void set_division(int id, char name) {
                                      division.set_id(id);
                                      division.set_name(name);
             }
             /**
              * Сеттер для подполя division id
              * @param id содержимое подполя
              */
             public void set_division_id(int id) {
                                         division.set_id(id);

             }
             /**
              * Сеттер для поля Salary
              * @param Salary содержимое поля
              */
             public void set_Salary(int Salary) { this.Salary = Salary; }
             /**
              * Геттер для поля id
              * @return содержимое поля
              */
             public int get_id() { return id; }
             /**
              * Геттер для поля name
              * @return содержимое поля
              */
             public String get_name() { return name; }
             /**
              * Геттер для поля gender
              * @return содержимое поля
              */
             public String get_gender() { return gender; }
             /**
              * Геттер для поля BirtDate
              * @return содержимое поля
              */
             public String get_BirtDate() { return BirtDate; }
             /**
              * Геттер для подполя id в поле division
              * @return содержимое поля
              */
             public int get_division_id() { return division.get_id(); }
             /**
              * Геттер для подполя name в поле division
              * @return содержимое поля
              */
             public char get_division_name() { return division.get_name(); }
             /**
              * Геттер для поля Salary
              * @return содержимое поля
              */
             public int get_Salary() { return Salary; }
}
