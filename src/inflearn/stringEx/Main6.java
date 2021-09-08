package inflearn.stringEx;

import java.util.Scanner;

public class Main6 {
    public String solution(String str){
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]",""); //대문자 A부터 Z까지가 아니면 다 빈칸
        String tmp  = new StringBuilder(str).reverse().toString();

        if(str.equals(tmp)) answer="YES";

        return answer;
    }

    public static void main(String[] args) {
        Main6 T = new Main6();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine(); //found7, time: study; Yduts; emit, 7Dnuof
        System.out.println(T.solution(str));
    }
}
