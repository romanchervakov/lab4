package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IDGeneratorTest {
      IDGenerator generator;
      @BeforeEach
      void setGenerator() {
                        generator =  new IDGenerator(5);
      }
      @Test
      void idLengthTest() {
                        for (int i = 0; i < 26; i++)
                             assertEquals(5, String.valueOf(generator.get_ID(i)).length());
      }
      @Test
      void UniqueIDTest() {
                        for (int i = 0; i < 26; i++)
                             for (int j = 0; j < 26; j++)
                                  if (i != j) assertNotEquals(generator.get_ID(i), generator.get_ID(j));

      }

}