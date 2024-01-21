package seminar1.seminarDj.task1;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        String str = "Hello";
//        str.toUpperCase().concat(" World").trim().replace(" World","Yes");
        StringBuilder strB = new StringBuilder(str);
        strB.reverse();
        System.out.println(strB);
//
        StringBuilder strBr = new StringBuilder("Hello ");
        strB.append(" World").replace(0,1, "Yes").reverse();
        System.out.println(strB);

    }
}
