package _4;

import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class Nuts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Map<String, Integer>> companys = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split("\\s+");

            String compName = input[0];
            String goodsName = input[1];
            int orderKG = Integer.parseInt(input[2].substring(0, input[2].length() - 2));

            if (!(companys.containsKey(compName))) {
                companys.put(input[0], new LinkedHashMap<>());
            }
            if (companys.get(compName).containsKey(goodsName)) {
                companys.get(compName).put(goodsName, companys.get(compName).get(goodsName) + orderKG);
            } else {
                companys.get(compName).put(goodsName, orderKG);
            }
        }
        //EatYourNuts: almonds-30kg, brazilnuts-15kg
        for (String company : companys.keySet()) {
            out.printf("%s: ", company);

            List<String> nuts = new ArrayList<>();
            for (String goods : companys.get(company).keySet()) {
                nuts.add(String.format("%s-%dkg", goods, companys.get(company).get(goods)));
            }
            out.printf("%s\n", nuts.toString().substring(1, nuts.toString().length() - 1));
        }
    }
}
