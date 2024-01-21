package seminar1.seminarDj.task1;

import java.util.Random;

/*Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
Определите какой элемент является в этом массиве
максимальным.*/
public class ArraysTest {
    public static void main(String[] args) {
        Random random = new Random();
        int [] number = new int [12];
        int max = number[0];

        for (int i = 0; i < number.length; i++) {

            number[i]= random.nextInt(15-(-15)+1)+(-15);

            System.out.print(number[i]+" ,");
            if (number[i]>max){
                max=number[i];
            }

        }
        System.out.println();
        System.out.println(max);


    }
}
