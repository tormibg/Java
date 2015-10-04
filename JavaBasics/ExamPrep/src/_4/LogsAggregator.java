package _4;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

import static java.lang.System.in;
import static java.lang.System.out;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Integer> names = new TreeMap<>();
        Map<String, TreeSet<String>> ips = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] inputs = sc.nextLine().split("\\s+");
            if (!(names.containsKey(inputs[1]))) {
                names.put(inputs[1], Integer.parseInt(inputs[2]));
            } else {
                names.put(inputs[1], names.get(inputs[1]) + Integer.parseInt(inputs[2]));
            }
            if (!(ips.containsKey(inputs[1]))) {
                ips.put(inputs[1], new TreeSet<>());
            }
            ips.get(inputs[1]).add(inputs[0]);
        }
        for (String name : names.keySet()) {
            out.printf("%s: %d ", name, names.get(name));
            for (String ipName : ips.keySet()) {
                if (name.equals(ipName)) {
                    out.printf("%s\n", ips.get(ipName).toString());
                }
            }
        }
    }
}
