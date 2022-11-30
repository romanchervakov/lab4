package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс для считывания информации о людях в список объектов класса Person
 * @author romanchervakov
 */
public class ReadPerson {
             private final List<Person> personList;
             private static IDGenerator gen = null;
             public List<Person> getList() { return personList; }
             /**
              * Метод инициализирующий объект класса Person из массива данных считанного из CSV файла
              * @param Data массив данных
              * @return объект класса Person
              */
             static Person makePerson(String[] Data) {
                               Person person = new Person();
                               person.set_id(Integer.parseInt(Data[0]));
                               person.set_name(Data[1]);
                               person.set_gender(Data[2]);
                               person.set_BirtDate(Data[3]);
                               char div_name = Data[4].charAt(0);
                               person.set_division(gen.get_ID(div_name - 'A'), div_name);
                               person.set_Salary(Integer.parseInt(Data[5]));
                               return person;
             }
             /**
              * Конструктор класса построчно считывает данные из CSV файла, и рабивая их по разделителю добавляет в массив
              * @param path путь к файлу
              * @param separator разделитель
              */
             ReadPerson(String path, String separator) {
                        personList = new ArrayList<>();
                        gen = new IDGenerator(7);
                        try {
                             BufferedReader reader = new BufferedReader(new FileReader(path));
                             String[] nextLine;
                             String line;
                             reader.readLine();
                             while ((line = reader.readLine()) != null) {
                                    nextLine = line.split(separator);
                                    personList.add(makePerson(nextLine));
                             }
                        }
                        catch (Exception e) {
                               System.out.println(e);
                        }
             }
}
