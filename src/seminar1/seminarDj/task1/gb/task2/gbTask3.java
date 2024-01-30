package seminar1.seminarDj.task1.gb.task2;

public class gbTask3 {
    public static void main(String[] args) {
        int [] arr = {2,8,1,0,7};
        System.out.println(findMax(arr));

    }
    public static int findMax(int [] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
            max=arr[i];
            }
        }
        return max;
    }
}
