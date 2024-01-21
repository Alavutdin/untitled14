package seminar1.seminarDj.task1.string;

public class Task4 {
    public static void main(String[] args) {
        int array1 []={5,9,0,1,4,5,2};
        boolean isBool=false;

        while (!isBool) {
            isBool=true;
            for (int i = 1; i < array1.length; i++) {
                if (array1[i] < array1[i - 1]) {
                    int temp = array1[i];
                    array1[i] = array1[i - 1];
                    array1[i - 1] = temp;
                    isBool=false;
                }
            }
        }
        for (int i : array1) {
            System.out.print(i+" ");
        }
        System.out.println();

        int [] array = {5,9,0,1,4,5,2};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
