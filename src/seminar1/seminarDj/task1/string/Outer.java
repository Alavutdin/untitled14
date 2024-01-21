package seminar1.seminarDj.task1.string;

public class Outer {
    public static Integer s = Integer.MAX_VALUE;

    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        long begin=System.currentTimeMillis();
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
        long end=System.currentTimeMillis();
        System.out.println(begin-end);
    }

    public static int countDigits(String string) {
        int y = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i)))
                y++;
        }
        return y;
    }
    public static int countLetters(String string) {
        int y = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i)))
                y++;
        }
        return y;
    }
    public static int countSpaces(String string) {
        int y = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isWhitespace(string.charAt(i)))
                 y++; }
        return y;
    }
}
