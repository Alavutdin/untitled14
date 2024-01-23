package seminar1.seminarDj.task1.arrays.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String in = scanner.nextLine();

//        while (scanner.hasNext()){
//            String in = scanner.nextLine();
//            list.add(in);
//            System.out.println(in);
//        }
//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                int s01 = Integer.parseInt(o1.split(" ")[2]);
//                int s02 = Integer.parseInt(o2.split(" ")[2]);
//
//                return s01-s02;
//            }
//        });
        System.out.println();
        System.out.println(list);

        ArrayList<String> listFamyry = new ArrayList<>();
        ArrayList<String> listName = new ArrayList<>();
        ArrayList<Integer> listAge = new ArrayList<>();
        ArrayList<String> listGenden = new ArrayList<>();
        ArrayList<Integer> listid = new ArrayList<>();
        int id = 0;

        while (!in.equals("q")){
            System.out.println(in);
            String [] arr =new String[5];
            arr=in.split(" ");
            list.add(in);
            listFamyry.add(arr[0]);
            listName.add(arr[1]);
            listAge.add(Integer.parseInt(arr[2]));
            listGenden.add(arr[3]);
            listid.add(id);
            in=scanner.nextLine();
            id++;

        }
        int temp = 0;
        boolean flag = true;
//        while (flag){
//            flag = true;
//            if (flag);
//        }
        System.out.println(listFamyry);
        System.out.println(listName);
        System.out.println(listAge);


    }
}
