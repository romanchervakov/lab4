package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReadPersonTest {
      Person expectedPerson = new Person();
      @BeforeEach
      void setUp() {
                 expectedPerson.set_id(28363);
                 expectedPerson.set_name("Abdul, Abdel");
                 expectedPerson.set_gender("Male");
                 expectedPerson.set_BirtDate("14.01.1964");
                 expectedPerson.set_division(0, 'G');
                 expectedPerson.set_Salary(7900);
      }
      @Test
      void makePersonTest() {
                          try {
                               BufferedReader reader = new BufferedReader(new FileReader("test.csv"));
                               String[] nextLine;
                               String line;
                               reader.readLine();
                               line = reader.readLine();
                               nextLine = line.split(";");
                               assertEquals(expectedPerson.get_id(), ReadPerson.makePerson(nextLine).get_id());
                               assertEquals(expectedPerson.get_name(), ReadPerson.makePerson(nextLine).get_name());
                               assertEquals(expectedPerson.get_gender(), ReadPerson.makePerson(nextLine).get_gender());
                               assertEquals(expectedPerson.get_BirtDate(), ReadPerson.makePerson(nextLine).get_BirtDate());
                               assertEquals(expectedPerson.get_division_name(), ReadPerson.makePerson(nextLine).get_division_name());
                               assertEquals(expectedPerson.get_Salary(), ReadPerson.makePerson(nextLine).get_Salary());
                          }
                          catch (Exception e) {
                                 System.out.println(e);
                          }
      }
      @Test
      void getList() {
                   ReadPerson readPerson = new ReadPerson("test.csv", ";");
                   List<Person> personList = new LinkedList<>(readPerson.getList());
                   assertEquals(expectedPerson.get_id(), personList.get(0).get_id());
                   assertEquals(expectedPerson.get_name(), personList.get(0).get_name());
                   assertEquals(expectedPerson.get_gender(), personList.get(0).get_gender());
                   assertEquals(expectedPerson.get_BirtDate(), personList.get(0).get_BirtDate());
                   assertEquals(expectedPerson.get_division_name(), personList.get(0).get_division_name());
                   assertEquals(expectedPerson.get_Salary(), personList.get(0).get_Salary());
      }
}