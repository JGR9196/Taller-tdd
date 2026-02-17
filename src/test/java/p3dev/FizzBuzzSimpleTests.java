package p3dev;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzSimpleTests {

    @Test
    void testNumberOne_ShouldReturnOne() {
        NumberMultipleTranslator t = new NumberMultipleTranslator();
        assertEquals("1", t.translate(1));
    }

    @Test
    void testNumberTwo_ShouldReturnTwo() {
        NumberMultipleTranslator t = new NumberMultipleTranslator();
        assertEquals("2", t.translate(2));
    }

    @Test
    void testNumberThree_ShouldReturnFizz() {
        NumberMultipleTranslator t = new NumberMultipleTranslator();
        assertEquals("Fizz", t.translate(3));
    }

    @Test
    void testNumberFive_ShouldReturnBuzz() {
        NumberMultipleTranslator t = new NumberMultipleTranslator();
        assertEquals("Buzz", t.translate(5));
    }

    @Test
    void testNumberSix_ShouldReturnFizz() {
        NumberMultipleTranslator t = new NumberMultipleTranslator();
        assertEquals("Fizz", t.translate(6));
    }

    @Test
    void testNumberTen_ShouldReturnBuzz() {
        NumberMultipleTranslator t = new NumberMultipleTranslator();
        assertEquals("Buzz", t.translate(10));
    }

    @Test
    void testNumberFifteen_ShouldReturnFizzBuzz() {
        NumberMultipleTranslator t = new NumberMultipleTranslator();
        assertEquals("FizzBuzz", t.translate(15));
    }

    @Test
    void testNumberThirty_ShouldReturnFizzBuzz() {
        NumberMultipleTranslator t = new NumberMultipleTranslator();
        assertEquals("FizzBuzz", t.translate(30));
    }
}
