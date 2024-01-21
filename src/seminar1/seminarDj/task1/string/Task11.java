package seminar1.seminarDj.task1.string;

public class Task11 {
    public static void main(String[] args) {
        String str = "Osn 126, res 7";
        String []res = str.split(" ");
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
            try {
                Integer.parseInt(res[i]);

            }catch (Exception e){

            }

        }


    }public static int Res(String str){
        String []res = str.split(" ");
        for (int i = 0; i < res.length; i++) {
            System.out.println(i);

        }
        return 0;
    }
}
