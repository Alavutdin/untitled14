package seminar1.seminarDj.task1.string;

import java.util.Random;

/*Создайте массив из 15 случайных целых чисел из отрезка [0;9].
Выведите массив на экран. Подсчитайте сколько в массиве
 чётных элементов и выведете это количество на экран на отдельной строке
 */
public class Task2 {
    public static void main(String[] args) {
        int [] number = new int [15];
        Random random = new Random();
        int sum =0;

        for (int i = 0; i < number.length; i++) {
            number[i]= random.nextInt(9-0+1)+0;
            if (number[i]%2==0){
                sum++;
            }

            System.out.print(number[i]+" ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
