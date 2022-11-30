package org.example;
import java.util.LinkedList;
import java.util.List;

public class Main {
             public static void main(String[] args) {
                                     ReadPerson reader = new ReadPerson("foreign_names.csv", ";");
                                     List<Person> Data = new LinkedList<>(reader.getList());
                                     for (Person i: Data) {
                                          System.out.print(i.get_id());
                                          System.out.print(i.get_name());
                                          System.out.print(i.get_gender());
                                          System.out.print(i.get_BirtDate());
                                          System.out.print(i.get_division_id());
                                          System.out.print(i.get_division_name());
                                          System.out.print(i.get_Salary());
                                          System.out.println();
                                     }
             }
}