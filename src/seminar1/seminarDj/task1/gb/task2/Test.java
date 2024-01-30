package seminar1.seminarDj.task1.gb.task2;

import java.util.Arrays;
// Сортировка массива
public class Test {
    public static void main(String[] args) {
        int [] array = {8,4,5,7,1,0,5};
        printArray(ArrayGet(array));


    }public static int [] ArrayGet(int [] array){
        boolean isArray = false;
        while (!isArray){
            isArray=true;
            for (int i = 0; i < array.length; i++) {
                if(array[i]>array[i++]){
                    int temp = array[i];
                    array[i]=array[i++];
                    array[i++]=temp;
                    isArray=false;
                }
            }

        }
        return array;
    }
    public static void printArray(int [] array){
        for (int i : array) {
            System.out.print(i+" ");
        }
    }
}
