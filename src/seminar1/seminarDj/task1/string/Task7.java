package seminar1.seminarDj.task1.string;

import java.io.File;

public class Task7 {
    public static void main(String[] args) {
        String str = "Hello world to string";
        String [] array=str.split(" ");
        for (int i = 0; i < str.length(); i++) {
            array[i].toUpperCase();
        }
        for (String s : array) {
            System.out.println(s);
        }
    }


}
