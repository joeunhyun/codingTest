package inflearn.stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;


//
public class Main
{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int N = Integer.parseInt(br.readLine());
            String[] str = new String[N];
            String[] print = new String[N];

            for(int i = 0 ; i < N ; i++){
                str[i] = br.readLine();
                print[i] = "";
                char[] temp = str[i].toCharArray();
                for(int j = (temp.length-1) ; j >= 0  ; j--){
                    print[i]+=temp[j];
                }
            }

            for(String result : print){
                System.out.println(result);
            }

        }catch (IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }



    }
}
