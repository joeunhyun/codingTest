package inflearn.stringEx;

import java.util.Scanner;

public class Main3 {
    public String solution(String str){
        String answer;
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length()-1; //왼쪽 , 오른쪽 시작
        while (lt<rt){
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }

        answer=String.valueOf(s);

        return answer;

    }
    public static void main(String[] args) {
       Main3 T = new Main3();
       Scanner scanner = new Scanner(System.in);
       String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
