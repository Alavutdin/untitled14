package seminar1.seminarDj.task1.gbList.task2;

import java.util.Arrays;

public class S01 {
    public static void main(String[] args) {
        int arr []={2,8,1,9,7};
        System.out.println(Arrays.toString(arr));
        shifter(arr,2);
        System.out.println(Arrays.toString(arr));

    }
    private static void shifter(int[]a, int n){
        n%=a.length;
        int shift=a.length+n;
        shift%=a.length;

        for (int i = 0; i < shift; i++) {
            int temp=a[a.length-1];
            System.arraycopy(a,0,a,1,a.length-1);
            a[0]=temp;
        }
    }
}
