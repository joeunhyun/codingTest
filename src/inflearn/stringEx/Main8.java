package inflearn.stringEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next(); //teachermode e
        char ch = scanner.next().charAt(0);
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
}
