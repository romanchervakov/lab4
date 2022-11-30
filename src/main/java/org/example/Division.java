package org.example;

/**
 * Структура данных Division
 */
public class Division {
             private int id;
             private char name;
             /**
              * Сеттер для поля id
              * @param id содержимое поля
              */
             public void set_id(int id) { this.id = id; }
             /**
              * Сеттер для поля name
              * @param name содержимое поля
              */
             public void set_name(char name) { this.name = name; }
             /**
              * Геттер для поля id
              * @return содержимое поля
              */
             public int get_id() { return id; }
             /**
              * Геттер для поля name
              * @return содержимое поля
              */
             public char get_name() { return name; }
}
