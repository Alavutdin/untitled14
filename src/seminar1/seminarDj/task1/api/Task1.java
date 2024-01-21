package seminar1.seminarDj.task1.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder day = new StringBuilder("01");
        StringBuilder monht = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1989");
        StringBuilder []date = new StringBuilder []{day, monht, year};
        List<StringBuilder> sb=Arrays.asList(date);
        System.out.println(sb);
        date[1]=new StringBuilder("09");
        System.out.println(sb);
    }
}
