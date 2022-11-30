package org.example;
import java.util.Random;

/**
 * Класс генерирующий уникальные идентификаторы для наименваний структуры данных Division определенной длины
 */
public class IDGenerator {
             private int[] IDs;
             /**
              * Генерация числа из промежутка
              * @param min минимальное значение
              * @param max максимальное значение
              * @return случайное число из промежутка
              */
             private int generate(int min, int max) {
                                  Random random = new Random();
                                  return random.nextInt(max - min) + min;
             }

             /**
              * Конструктор класс создает уникальный идентификатор на основе случайно сгенерированного числа
              * @param length длина индетификатора
              */
             IDGenerator(int length) {
                          if (length < 3) return;
                          int N = 1;
                          for (int i = 0; i < length-3; i++)
                               N*=10;
                          IDs = new int[26];
                          for (int i = 0; i < 10; i++)
                               IDs[i] = i+100*generate(N, 3*N);
                          for (int i = 10; i < 26; i++)
                               IDs[i] = i+100*generate(5*N, 7*N);
             }
             /**
              * Геттер
              * @param i код наименования
              * @return идентификатор наименования
              */
              int get_ID(int i) { return IDs[i]; }
}
