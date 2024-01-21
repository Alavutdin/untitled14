package seminar1.seminarDj.task1.gb;
//Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами
// переданного не пустого массива.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GBTaskDZ2 {
    public static void main(String[] args) {
        int [] array = {2,5,7,10,1};
        System.out.println(sumNumber(array));



    }public static int sumNumber(int [] array){
        int max =array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max=array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min=array[i];
            }
        }
        return max-min;
    }


}
