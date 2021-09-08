package inflearn.stringEx;

import java.util.Scanner;

public class Main7 {
    public String solution(String str){
        int answer = 0;
        str = str.toUpperCase().replaceAll("[^0-9]",""); //숫자만 남기기
        answer = Integer.parseInt(str);

        //다른 풀이
        /*for(char x : str.toCharArray()){
            if(Character.isDigit(x)) answer+=x; //앞에 0이 나옴
        }*/

        return String.valueOf(answer);
    }

    public static void main(String[] args) {
        Main7 T = new Main7();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine(); //g0en2T0s8eSoft
        System.out.println(T.solution(str));
    }
}
