package seminar1.seminarDj.task1.gb;
// Требуется написать метод, принимающий на вход размеры двумерного массива и выводящий массив
// в виде инкременированной цепочки чисел, идущих по спирали.
public class GBTaskDZ4 {
    public static void main(String[] args) {
        int [][] array = new int[4][4];
        array(array);


    }public static void array(int array[][]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    System.out.print(i+j);
                }catch (ArrayIndexOutOfBoundsException e){

                }

            }
            System.out.println();
        }
    }



}
