package inflearn.stringEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next(); //teachermode e
        char ch = scanner.next().charAt(0);
        AnswerSolution(str, ch);
    }

    public static void Mysolution(String str, char ch){
        int start = 0 , end = 0;
        List<Integer> index = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i)==ch) index.add(i);
        }

        for(int i = 0 ; i < index.size() ; i++){
            if(i==index.size()-1){
                end = str.length()-1;
            }else{
                end = (index.get(i)+index.get(i+1))/2;
            }
            for(int j = start ; j <= end ; j++){
                result.add(Math.abs(j-index.get(i)));
            }
            start = end+1;
        }

        for (int x : result){
            System.out.print(x+" ");
        }
    }

    public static void AnswerSolution(String str, char ch){
        int answer[] = new int[str.length()];
        int p = 1000; // p는 거리 최대값이 100으로 더 크게 설정
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i)==ch) p=0;
            else p++;

            answer[i]=p;
        }

        p = 1000;
        for(int i = str.length()-1 ; i>=0 ; i--){
            if(str.charAt(i)==ch) p=0;
            else {
                p++;
                answer[i] = Math.min(answer[i],p);
            }
        }

        for (int x : answer)
            System.out.print(x+" ");
    }
}
