package p3dev;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MultipleOfSevenAndElevenTranslatorTests {

    static Stream<TestCase> provider() {
        return Stream.of(
            new TestCase(7, "Jazz"),
            new TestCase(11, "Mozz"),
            new TestCase(21, "FizzJazz"), // 3 and 7
            new TestCase(33, "FizzMozz"), // 3 and 11
            new TestCase(77, "JazzMozz"), // 7 and 11
            new TestCase(385, "BuzzJazzMozz") // 5,7,11
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void should_return_expected_combination(TestCase tc) {
        NumberMultipleTranslator translator = new NumberMultipleTranslator();
        String result = translator.translate(tc.number);
        assertEquals(tc.expected, result);
    }

    static class TestCase {
        int number;
        String expected;

        TestCase(int number, String expected) {
            this.number = number;
            this.expected = expected;
        }

        @Override
        public String toString() { return number + " -> " + expected; }
    }
}
