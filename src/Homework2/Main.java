package Homework2;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> students = new HashMap<>();
        students.put("Alexey", new ArrayList<>() {{
            add(90);
            add(95);
            add(80);
        }});

        students.put("Damir", new ArrayList<>() {{
            add(96);
            add(90);
            add(87);
        }});

        students.put("Maksim", new ArrayList<>() {{
            add(83);
            add(90);
            add(89);
        }});

        double averageRating;


        for (String key : students.keySet()){
            System.out.print(key + ": ");
            double sumRating = 0;
            for (int value : students.get(key)){
                sumRating+=value;
            }
            averageRating = sumRating / students.get(key).size();
            System.out.println(averageRating);
        }

        String studentHighRating = "";
        int maxRating = 0;
        for (String key : students.keySet()){
            for (int value : students.get(key)){
                if (value>maxRating){
                    maxRating=value;
                    studentHighRating=key;
                }
            }
        }
        System.out.println("\nСтудент с наивысшей оценкой: " + studentHighRating + " " + maxRating);

    }
}