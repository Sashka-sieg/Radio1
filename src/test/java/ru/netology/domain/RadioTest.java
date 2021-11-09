package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;
import static org.junit.jupiter.api.Assertions.assertEquals;

 public class RadioTest {
@Test
    public void shouldIncreaseStation() {
    Radio cond = new Radio();
    cond.currentStation = 8;
    int expected = 9;
    cond.increaseStation();
    int actual = cond.currentStation;
    assertEquals (expected,actual);

}
     @Test
     public void shouldNotIncreaseStation() {
         Radio cond = new Radio();
         cond.currentStation = 11;
         int expected = 11;
         cond.increaseStation();
         int actual = cond.currentStation;
         assertEquals(expected, actual);
     }

     @Test
     public void shouldreduceStation() {
         Radio cond = new Radio();
         cond.currentStation = 8;
         int expected = 7;
         cond.reduceStation();
         int actual = cond.currentStation;
         assertEquals(expected, actual);
}
 }