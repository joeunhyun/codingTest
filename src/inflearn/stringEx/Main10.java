package inflearn.stringEx;

import java.util.Scanner;
import java.util.Stack;

public class Main10 {
    public String Mysolution(int N, String str){
        String answer = "";
        String[] temp = new String[N];
        int[] tempInt = new int[N];
        int subindex = 0;

        for(int i = 0 ; i < N ; i++){
            temp[i]=str.substring(subindex,subindex+7);
            subindex+=7;
        }

        //1. #->1 , *->0
        for(int i = 0 ; i < N ; i++){
            temp[i]=temp[i].replaceAll("#","1");
            temp[i]=temp[i].replaceAll("\\*","0");
        }
        //2. 2진수를 10진수
        for(int i = 0 ; i < N ; i++){
            String t = temp[i];
            for(int j = 0; j < t.length(); j++){
                if(t.charAt(j)=='1'){
                    if(j==t.length()-1){
                        tempInt[i]+=1;
                    }else{
                        tempInt[i]+=Math.pow(2,6-j);
                    }
                }
            }
        }
        //3.아스키코드로 변환
        for(int i = 0 ; i < N ; i++){
            answer+=(char)tempInt[i];
        }

        return answer;

    }

    public String AnswerSolution(int N, String str) {
        String answer = "";
        for(int i = 0 ; i < N ; i++){
            String tmp = str.substring(0,7).replace("#","1").replace("*","0");
            int num = Integer.parseInt(tmp,2);
            answer+=(char)num;
            str=str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main10 T = new Main10();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String str = scanner.next();
        System.out.println(T.AnswerSolution(N, str));
    }
}
