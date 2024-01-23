package seminar1.seminarDj.task1.gb;
import java.util.Arrays;
import java.util.function.Function;

public class GBTask4<T> {
    private int index;
    private T[] arr;

    public GBTask4(int capacity, Function<Integer, T[]> createArray) {
        arr = createArray.apply(capacity);
    }
    public int size() {
        return index;
    }

    public void add(T value) {
        if (index >= arr.length) {
            arr = Arrays.copyOf(arr, (int) (arr.length * 1.5));
        }
        arr[index] = value;
        index++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(index * 2);
        for (int i = 0; i < index; i++) {
            sb.append(arr[i]);
            if(i != index - 1)
                sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        GBTask4<Integer> arrayList = new GBTask4<>(2, Integer[]::new);
        for (int i = 0; i < 99; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        System.out.println(arrayList.size());
    }
}