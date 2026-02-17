package p3dev;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MultipleOfThreeTranslatorTest {

    static Stream<Integer> multipleOfThreeProvider() {
        return Stream.of(3, 6, 789234, -123456);
    }

    @ParameterizedTest
    @MethodSource("multipleOfThreeProvider")
    void should_return_fizz_when_multiple_of_three(int number) {
        //Arrange
        NumberMultipleTranslator translator = new NumberMultipleTranslator();

        //Act
        String result = translator.translate(number);

        //Assert
        assertEquals("Fizz", result);
    }
}
