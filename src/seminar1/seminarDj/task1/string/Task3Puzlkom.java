package seminar1.seminarDj.task1.string;

import java.util.Random;

public class Task3Puzlkom {
    public static void main(String[] args) {
        Random random = new Random();
        int [] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(9 - 0) + 0;
            System.out.print(num[i] + " ");

        }
        System.out.println();
        for (int i = 1; i > num.length-1; i--) {
            for (int j = 0; j < i; j++) {
                if (num[j]>num[i]){
                    int temp = num[j];
                    num[j]=num[i];
                    num[i]=temp;
                }
            }


        }
        for (int i : num) {
            System.out.print(i+" ");
        }


    }
}
