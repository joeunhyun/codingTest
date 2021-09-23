package programmers;

import java.util.*;

public class Number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 3;
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        int[] x = solution(progresses, speeds);

        for(int a : x){
            System.out.println(a);
        }
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> temp = new LinkedList<>();
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        List<Integer> key = new ArrayList<>();

        int day = 0;
        int position = 0;

        for(int x : progresses){
            temp.add(x);
        }

        while (!temp.isEmpty()){
            if(temp.peek()+speeds[position]*day < 100){
                day++;
            }else{
                temp.poll();
                if(hashMap.containsKey(day)){
                    hashMap.put(day, hashMap.get(day)+1);
                }else{
                    hashMap.put(day, 1);
                }
                position++;
            }
        }

        for(int k : hashMap.keySet()){
            key.add(k);
        }

        Collections.sort(key);

        answer = new int[key.size()];

        for(int i = 0 ; i < key.size() ; i++){
            answer[i]=hashMap.get(key.get(i));
        }

        return answer;

    }

    public static int[] solution2(int[] progresses, int[] speeds) {
        int M = progresses.length;
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> temp = new LinkedList<>();
        int first = 0;
        int second = 0;
        int sum = 0 ;
        int cnt = 1;

        for(int i = 0 ; i < M ; i++){
            temp.add(progresses[i]);
        }

        //초기값
        first = temp.poll();
        sum +=first;

        while (!temp.isEmpty()){
            second = temp.poll();
            if(second-sum >= 0){
                sum+=first;
                first = second - sum;
                answer.add(cnt);
                cnt = 1;
            }else{
                cnt++;
            }
        }

        answer.add(cnt); //마지막값 넣기

        for(int i = 0 ; i < answer.size() ; i++)
            System.out.println(answer.get(i));

        int[] x = {};

        for(int i = 0 ; i < answer.size() ; i++){
            x[i]=answer.get(i);
        }

        return x;
    }
}


