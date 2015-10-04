package Prob4;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;
import static java.lang.System.out;

public class UserLogs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String input = sc.nextLine();
        Map<String,Map<String,Integer>> userLogs = new TreeMap<>();
        while (!(input.equals("end"))) {
            Pattern pat = Pattern.compile("IP=([\\w:.]+)\\s+message='.*?'\\s+user=(.*)");
            Matcher matcher = pat.matcher(input);
            if (matcher.find()){
                String ip = matcher.group(1);
                String username = matcher.group(2);
                //out.println(ip);
                //out.println(username);

                if (!(userLogs.containsKey(username))){
                    userLogs.put(username,new LinkedHashMap<>());
                }
                if (userLogs.get(username).containsKey(ip)){
                    userLogs.get(username).put(ip,userLogs.get(username).get(ip)+1);
                }else{
                    userLogs.get(username).put(ip,1);
                }
            }
            input = sc.nextLine();
        }
        //destroyer: 192.23.30.40 => 2, 192.23.30.41 => 1, 192.23.30.42 => 1.
        for (String username : userLogs.keySet()) {
            out.printf("%s:\n",username);

            List<String> ips = new ArrayList<>();
            for (String ip : userLogs.get(username).keySet()) {
                ips.add(String.format("%s => %d",ip,userLogs.get(username).get(ip)));
            }
            out.print(ips.toString().substring(1,ips.toString().length()-1)+".\n");
        }
    }
}
