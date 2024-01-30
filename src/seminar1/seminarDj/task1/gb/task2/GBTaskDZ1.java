package seminar1.seminarDj.task1.gb.task2;
//1. Написать метод, возвращающий количество чётных элементов массива.
public class GBTaskDZ1 {
    public static void main(String[] args) {
        int [] array = {8,4,1,0};
        System.out.println(sumNumber(array));

    }
    public static int sumNumber(int [] array){
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                res++;
            }
        }
        return res;
    }


}
