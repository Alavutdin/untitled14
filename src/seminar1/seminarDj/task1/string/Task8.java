package seminar1.seminarDj.task1.string;

public class Task8 {
    public static void main(String[] args) {

        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int firstIndex = path.indexOf("jdk"); // Ищет строку и возв 1 индекс
        int lastIndex = path.indexOf("/",firstIndex); // Ищет строку пропус 1 до инд возв инд
        String oldJdk = path.substring(firstIndex,lastIndex); // Получаем строку от нач до конца
        //напишите тут ваш код
        return path.replace(oldJdk,jdk);
    }
}
