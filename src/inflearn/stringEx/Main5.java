package inflearn.stringEx;

import java.util.Scanner;

public class Main5 {
    public String solution(String str){
        String answer = "YES";
        String tmp = new StringBuilder(str).reverse().toString(); //뒤집어짐

        if(!str.equalsIgnoreCase(tmp)) answer = "NO";


        /*str = str.toUpperCase();
        int len = str.length();

        for(int i = 0; i < len/2 ; i++){
            if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
        }*/

        return answer;
    }

    public static void main(String[] args) {
        Main5 T = new Main5();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
