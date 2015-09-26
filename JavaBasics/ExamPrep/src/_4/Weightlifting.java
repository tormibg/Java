package _4;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static java.lang.System.in;
import static java.lang.System.out;

public class Weightlifting {
    public static void main(String[] args) {
        Scanner sn = new Scanner(in);

        int n = Integer.parseInt(sn.nextLine());

        Map<String, Map<String, Long>> players = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = sn.nextLine().split("\\s+");

            String name = input[0];
            String exercise = input[1];
            Long weight = Long.parseLong(input[2]);

            if (!players.containsKey(name)) {
                players.put(name, new TreeMap<>());
            }

            if (players.get(name).containsKey(exercise)) {
                players.get(name)
                        .put(exercise,
                                players.get(name).get(exercise)
                                        + weight);
            }else{
                players.get(name).put(exercise,weight);
            }
        }

        for (String s : players.keySet()) {
            out.print(s + " : ");

            ArrayList<String> exercises = new ArrayList<>();

            for (String s1 : players.get(s).keySet()) {
                exercises.add(String.format("%s - %d kg",s1,players.get(s).get(s1)));

            }
            out.println(exercises.toString().substring(1, exercises.toString().length()-1));
        }
    }
}
