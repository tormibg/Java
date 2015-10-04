package _4;

import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, Map<String, Integer>> orders = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split("\\s+");

            String name = input[0];
            int count = Integer.parseInt(input[1]);
            String product = input[2];

            if (!(orders.containsKey(product))) {
                orders.put(product, new TreeMap<>());
            }
            if (orders.get(product).containsKey(name)) {
                orders.get(product).put(name, orders.get(product).get(name) + count);
            } else {
                orders.get(product).put(name, count);
            }
        }
        for (String order : orders.keySet()) {
            out.print(order + ": ");

            ArrayList<String> names = new ArrayList<>();
            //bananas: kiro 4, maria 3
            for (String name : orders.get(order).keySet()) {
                names.add(String.format("%s %d", name, orders.get(order).get(name)));
            }
            out.println(names.toString().substring(1, names.toString().length() - 1));
        }
    }
}
