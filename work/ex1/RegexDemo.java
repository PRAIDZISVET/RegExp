package by.itacademy.work.ex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        //test();
        //test2();
        String value = "Русскийалфавит";
        System.out.println(Pattern.matches("[а-яА-ЯёЁ]+", value));
    }

    private static void test2() {
        String numbers = "12d3234";
        Pattern pattern = Pattern.compile("^\\d+$");
        Matcher matcher = pattern.matcher(numbers);
        System.out.println(matcher.matches());
    }

    private static void test() {
        String value = "as123df as1233dfsdf asd456gf s5sdfg sd67567fg";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(value);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
