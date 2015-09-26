package _4;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static java.lang.System.in;
import static java.lang.System.out;

public class ActivityTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int countLines = Integer.parseInt(sc.nextLine());
        Map<Integer, Map<String, Double>> players = new TreeMap<>();

        for (int i = 0; i < countLines; i++) {
            String[] strings = sc.nextLine().split("\\s+");
            int month = Integer.parseInt(strings[0].substring(3, 5));
            String name = strings[1];
            double distance = Double.parseDouble(strings[2]);

            if (!(players.containsKey(month))) {
                players.put(month, new TreeMap<>());
            }

            if (players.get(month).containsKey(name)) {
                players.get(month)
                        .put(name,
                                players.get(month).get(name) + distance);
            } else {
                players.get(month).put(name, distance);
            }
        }
        //7: Angel(11100), Pesho(3200)
        for (Integer month : players.keySet()) {

            out.printf("%d: ",month);

            ArrayList<String> names = new ArrayList<>();

            for (String name : players.get(month).keySet()) {

                names.add(String.format("%s(%d)",name,players.get(month).get(name).intValue()));
            }
            out.println(names.toString().substring(1,names.toString().length()-1));
        }
    }
}
