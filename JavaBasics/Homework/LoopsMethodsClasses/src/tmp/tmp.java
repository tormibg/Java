package tmp;

import java.util.*;

public class tmp {
    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList() {
            {
                add(2);
                add(3);
            }
        };
        System.out.println("1".compareTo("1"));
        System.out.println(Integer.compare(1, 1));

        Map<String, Double> grades = new LinkedHashMap<>();

        grades.put("Pencho",2.0);
        grades.put("Gosho",5.5);
        grades.put("Anelia", 5.0);

        System.out.println(grades);

        Map<String,Double> grades1 = new LinkedHashMap<>(grades);
    }
}
