package inflearn.stringEx;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public ArrayList<String> solution(int n , String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString(); //reverse string
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] str = new String[n];
        for(int i = 0 ; i < str.length; i++){
            str[i] = scanner.nextLine();
        }
        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
    }
}
