package dev;

import java.util.ArrayList;

public class LV1_46_모의고사 {
    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};

        ArrayList<Integer> arr = new ArrayList<>();

        int st1_correct = 0, st2_correct = 0, st3_correct = 0;
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};
        for(int i = 0; i< answers.length;i++){
            if(answers[i]==student1[i%student1.length])st1_correct++;
            if(answers[i]==student2[i%student2.length])st2_correct++;
            if(answers[i]==student3[i%student3.length])st3_correct++;
        }

        int max = Math.max(Math.max(st1_correct, st2_correct), st3_correct);
        if(st1_correct== max)arr.add(1);
        if(st2_correct== max)arr.add(2);
        if(st3_correct== max)arr.add(3);
        int[] answer = new int[arr.size()];
        for (int i = 0; i< answer.length;i++)answer[i] = arr.get(i);

        System.out.println(st1_correct + " " + st2_correct + " " + st3_correct);

    }
}
