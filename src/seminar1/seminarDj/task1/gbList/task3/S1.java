package seminar1.seminarDj.task1.gbList.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class S1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(20));

        }
        System.out.print(list+" ");
        System.out.println();
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.print(list+" ");

    }
}
