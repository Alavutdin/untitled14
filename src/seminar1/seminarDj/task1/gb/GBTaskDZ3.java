package seminar1.seminarDj.task1.gb;
//Написать функцию, возвращающую истину, если в переданном массиве есть два
//соседних элемента, с нулевым значением.
public class GBTaskDZ3 {
    public static void main(String[] args) {
        int array []={5,7,8,1,9};
        System.out.println(isArray(array));


    }
    public static boolean isArray(int [] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j]==array[i]){
                    return true;
                }
            }
        }
        return false;
    }
}
