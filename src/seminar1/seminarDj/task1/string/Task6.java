package seminar1.seminarDj.task1.string;

public class Task6 {
    public static void main(String[] args) {
        String str = "Hello get to you get rush";
        String [] str2 = str.split("");
        for (String s : str2) {
            System.out.print(s);
        }
        for (int i = 0; i < str2.length; i++) {
            if (isTak(str2[i])){
                System.out.println(str2[i]);
            }
        }

    }public static boolean isTak(String str) {
        return Integer.toBinaryString((int) 'g')
                .equals(Integer.toBinaryString((int) str.charAt(Integer.MIN_VALUE + Integer.MAX_VALUE + 1)));
    }
}
