package seminar1.seminarDj.task1.map;

import java.util.HashMap;
import java.util.Map;

public class MapExampe {
    public static void main(String[] args) {
        Person mack = new Person(1,"Mack","Mackis");
        Person nick = new Person(2,"Nick","Nicks");

        Map<Integer, Person> map = new HashMap<>();
        map.put(mack.getId(),mack);
        map.put(nick.getId(),nick);

        System.out.println(map.get(1));
    }
}
