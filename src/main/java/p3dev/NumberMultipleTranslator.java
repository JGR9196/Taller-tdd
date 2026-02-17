package p3dev;

public class NumberMultipleTranslator {

    public String translate(int number) {
        if (number == 0) return new OtherCasesTranslator().translate(number);

        StringBuilder sb = new StringBuilder();

        if (number % 3 == 0) sb.append(new MultipleOfThreeTranslator().translate(number));
        if (number % 5 == 0) sb.append(new MultipleOfFiveTranslator().translate(number));
        if (number % 7 == 0) sb.append(new MultipleOfSevenTranslator().translate(number));
        if (number % 11 == 0) sb.append(new MultipleOfElevenTranslator().translate(number));

        if (sb.length() > 0) return sb.toString();

        return new OtherCasesTranslator().translate(number);
    }
}