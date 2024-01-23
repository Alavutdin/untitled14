package seminar1.seminarDj.task1.gbList.task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class S4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        long t1=System.nanoTime(); 
        while (scanner.hasNext()) {
            String in = scanner.nextLine();
            System.out.println(in);
            list.add(in);
        }
        long t2=System.nanoTime();
        System.out.println(list);
        System.out.println(t2-t1);

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i01 = Integer.parseInt(o1.split(" ")[2]);
                int i02 = Integer.parseInt(o2.split(" ")[2]);
                return i01-i02;
            }
        });
        long t3=System.nanoTime();
        System.out.println(t3-t1);
        System.out.println(list);



    }
}
