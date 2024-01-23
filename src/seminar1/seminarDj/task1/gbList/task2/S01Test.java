package seminar1.seminarDj.task1.gbList.task2;

import java.util.Arrays;

public class S01Test {
    public static void main(String[] args) {
        int [] arr={5,7,8,0,1};
        System.out.println(Arrays.toString(arr));
        int a = 2;
        int n = a%=arr.length;
        System.out.println(n);
        int shift=arr.length+n;
        System.out.println(shift);
        shift%=arr.length;
        System.out.println(shift);



    }
}
