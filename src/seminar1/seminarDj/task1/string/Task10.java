package seminar1.seminarDj.task1.string;

public class Task10 {
    public static void main(String[] args) {
        //Основание 7, стапень 1, результат равен
        //Основание 3, стапень 5, результат равен
        //Основание 4, стапень 2, результат равен
        String s = allaySum("Основание 7, стапень 1, результат равен");
        System.out.println(s);
    }
    public static String allaySum(String str){
        String [] array = str.split(" ");
        int base = 0;
        int power = 0;
        int product;
        for (int i = 0; i < array.length; i++) {
            array[i]=array[i].replace(",","");

        try {
            Integer.parseInt(array[i]);
            if (base==0){
                base=Integer.parseInt(array[i]);
            }else {
                power=Integer.parseInt(array[i]);
            }
        }catch (NumberFormatException e){
            continue;
        }
        }
        product = (int)Math.pow(base,power);
        return str+" "+product;


    }
}
