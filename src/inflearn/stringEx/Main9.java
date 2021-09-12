package inflearn.stringEx;

import java.util.Scanner;
import java.util.Stack;

public class Main9 {
    public String Mysolution(String str){
        String answer = "";
        Stack<Object> tmp = new Stack<>();
        int cnt = 1;

        for(int i = 0 ; i < str.length(); i++){
            if(i==0) {tmp.push(str.charAt(i)); continue;}

            if(str.charAt(i)==str.charAt(i-1)){
                cnt++;
                if(cnt > 2){
                    tmp.pop();
                }
                tmp.push(cnt);
            }else{
                tmp.push(str.charAt(i));
                cnt = 1;
            }
        }

        while (!tmp.isEmpty()){
            answer+=tmp.pop();
        }

        return new StringBuilder(answer).reverse().toString();
    }

    public String AnswerSolution(String str) {
        String answer = "";
        str+=" ";
        int cnt = 1;

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                answer += str.charAt(i);
                if (cnt > 1) {
                    answer+=Integer.toString(cnt);
                    cnt=1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main9 T = new Main9();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine(); //found7, time: study; Yduts; emit, 7Dnuof
        System.out.println(T.AnswerSolution(str));
    }
}
