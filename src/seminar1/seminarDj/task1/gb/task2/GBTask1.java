package seminar1.seminarDj.task1.gb.task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GBTask1 {
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int findMinRecursive(int min, int index, int [] arr) {
        if (index < arr.length) {
            if (arr[index] < min) {
                return findMinRecursive(arr[index], index + 1, arr);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 4, -2, 5, -1};
        int max = findMax(arr);
        int min = findMin(arr);
        printMinMax(max, min);

        min  = Arrays.stream(arr).min().getAsInt();
        max = Arrays.stream(arr).max().getAsInt();
        printMinMax(max, min);

        Arrays.sort(arr);
        min = arr[0];
        max = arr[arr.length - 1];
        printMinMax(max, min);

        min = Collections.min(Arrays.stream(arr).boxed().toList());
        max = Collections.max(Arrays.stream(arr).boxed().toList());
        printMinMax(min, max);
        System.out.println(findMinRecursive(arr[0], 0, arr));


        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.addAll(Arrays.stream(arr).boxed().toList());
        System.out.println(queue);
        max = queue.poll();
        while (queue.size() != 1) {
            queue.poll();
        }
        min = queue.poll();
        printMinMax(max, min);
    }

    private static void printMinMax(int max, int min) {
        System.out.println("Максимальное " + max);
        System.out.println("Минимальное " + min);
    }
}
