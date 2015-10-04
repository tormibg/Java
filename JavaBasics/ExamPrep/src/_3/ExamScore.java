package _3;

import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class ExamScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
      //  Map<Integer, TreeSet<String>> examAndStudents = new TreeMap<>();
     //   Map<Integer, List<Double>> examAndGrade = new TreeMap<>();
        Map<Integer,Map<String,Double>> students = new TreeMap<>();
        int countToEnd = 0;
        int countForHeader = 0;
        while (countToEnd <= 2) {
            String inputStr = sc.nextLine().replaceAll("\\|", "").trim();
            countForHeader++;
            //   out.println(inputStr);
            if (inputStr.contains("-")) {
                countToEnd++;
                continue;
            }
            if (countForHeader <= 3) {
                continue;
            }
            String[] inputs = inputStr.split("\\s+");
            //out.println(Arrays.toString(inputs));
            String name = inputs[0] + " " + inputs[1];
            int examScore = Integer.parseInt(inputs[2]);
            double grade = Double.parseDouble(inputs[3]);

            if (!(students.containsKey(examScore))){
                students.put(examScore,new TreeMap<>());
            }
            students.get(examScore).put(name,grade);

//            if (!(examAndStudents.containsKey(examScore))) {
//                examAndStudents.put(examScore, new TreeSet<>());
//            }
//            examAndStudents.get(examScore).add(name);
//
//            if (!(examAndGrade.containsKey(examScore))) {
//                examAndGrade.put(examScore, new ArrayList<>());
//            }
//            examAndGrade.get(examScore).add(grade);
        }
        // <score> -> [<student1>, <student2>, …]; avg=<avg grade>"
        //120 -> [Diana Kirova, George Stefanov]; avg=3.18
//        for (Integer examScore : examAndStudents.keySet()) {
//            out.printf("%d -> %s;", examScore, examAndStudents.get(examScore).toString());
//            float sum = 0;
//            for (double doubles : examAndGrade.get(examScore)) {
//                sum += doubles;
//            }
//            double avg = sum / examAndGrade.get(examScore).size();
//            out.printf(" avg=%.2f\n", avg);
//        }
        for (Integer examScore : students.keySet()) {
            out.printf("%d -> %s;", examScore,students.get(examScore).keySet().toString());
            double sum = 0;
            for (double grade : students.get(examScore).values()) {
                sum += grade;
            }
            double avg = sum / students.get(examScore).size();
            out.printf(" avg=%.2f\n", avg);
        }
    }
}

