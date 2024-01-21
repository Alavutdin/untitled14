package seminar1.seminarDj.task1.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Logger_Ex005 {
    public static void main(String[] args) {
        String separator= File.separator;
        String path = "с:"+separator+"7.txt"; // путь

        File file=new File(path); // создание файла
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.hasNextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
