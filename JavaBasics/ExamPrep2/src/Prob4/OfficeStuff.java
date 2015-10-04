package Prob4;

import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class OfficeStuff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String,Map<String,Integer>> officeStuff = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine().replaceAll("[|\\s]+","").trim();
           // out.println(input);
            String[] inputs = input.split("[\\s-]+");
           // out.println(Arrays.toString(inputs));

            String office = inputs[0];
            String stuff = inputs[2];
            int ammount = Integer.parseInt(inputs[1]);

            if (!(officeStuff.containsKey(office))){
                officeStuff.put(office, new LinkedHashMap<>());
            }
            if (officeStuff.get(office).containsKey(stuff)){
                officeStuff.get(office).put(stuff,officeStuff.get(office).get(stuff)+ammount);
            }else{
                officeStuff.get(office).put(stuff,ammount);
            }
        }
        // SoftUni: paper-600, chair-40, printer-1
        for (String office : officeStuff.keySet()) {
            out.printf("%s: ",office);

            List<String> stuffAmmont = new ArrayList<>();
            for (String stuff : officeStuff.get(office).keySet()) {
                stuffAmmont.add(String.format("%s-%d",stuff,officeStuff.get(office).get(stuff)));
            }
            out.printf("%s\n",stuffAmmont.toString().substring(1,stuffAmmont.toString().length()-1));
        }
    }
}
