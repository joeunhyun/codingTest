package programmers;

import java.util.*;

//모의고사
public class Number2 {
    public static void main(String[] args) {
        int[] answers = {5};
        int result[] = solution(answers);

        for(int x: result)
            System.out.println(x);
    }
    public static int[] solution(int[] answers) {
        int[] people1 = {1, 2, 3, 4, 5};
        int[] people2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] people3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int position = 0;
        int max = -1;
        List<Object> list = new ArrayList<>();
        Map<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> answerList = new ArrayList<>();

        list.add(people1);
        list.add(people2);
        list.add(people3);

        while (position<list.size()){
            int[] panmswer = (int[]) list.get(position);
            int key = position+1;
            for(int i=0 ; i < answers.length; i++){
                if(answers[i] == panmswer[i%panmswer.length]){
                    if(hashMap.containsKey(key)){
                        hashMap.put(key,hashMap.get(key)+1);
                    }else{
                        hashMap.put(key,1);
                    }
                    max = Math.max(max,hashMap.get(key));
                }
            }
            position++;
        }

        for(int k : hashMap.keySet()){
            if(max==hashMap.get(k)){
                answerList.add(k);
            }
        }

        Collections.sort(answerList);

        return answerList.stream().mapToInt(i->i.intValue()).toArray();
    }
}
