package inflearn.stringEx;

import java.util.Scanner;

public class Main4 {
    public String solution(String str){
        String answer ="";

        for(int i = 0 ; i < str.length() ; i++){
            if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
        }

        return answer;

    }
    public static void main(String[] args) {
        Main4 T = new Main4();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
