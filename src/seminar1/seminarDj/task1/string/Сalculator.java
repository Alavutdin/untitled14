package seminar1.seminarDj.task1.string;

import java.util.Scanner;

public class Сalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String strA = scanner.nextLine();
        String strB = scanner.nextLine();
        String str = scanner.nextLine();

        int numA= Integer.parseInt(strA);
        int numB= Integer.parseInt(strB);

        char ch = str.charAt(0);

        Sum(numA,numB,ch);

    }public static void Sum(int numA, int numB, char ch){
        int res =0;
        switch (ch){
            case '+':
                System.out.println(numA+numB);
                break;
            case '-':
                System.out.println(numA-numB);
                break;
            case '*':
                System.out.println(numA*numB);
                break;
            case '/':
                try {
                    System.out.println(numA/numB);
                    break;
                }catch (NumberFormatException e){
                    System.out.println("Error");
                }

            default:
                System.out.println("404");
                break;
        }
    }
}
