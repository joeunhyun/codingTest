package baekjoon.greedy;

import java.util.Scanner;

//동전 0번 문제
public class problem11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, m = 0, N= sc.nextInt(), K = sc.nextInt();
        int money[] = new int[N + 1];
        for (i = 1; i <= N; i++) money[i] = sc.nextInt();

        System.out.println(solution(money, N, K));
    }

    public static int solution(int[] money , int N , int K){
        int result = 0;
        int index = money.length-1;

        while (K>0){
            int tempmoney = money[index];
            if(tempmoney <= K){
                K -= tempmoney;
                result++;

                if(tempmoney <= K) continue;
                else index--;
            }else{
                index--;
            }
        }

        //간단풀이
        /*for(i=N;i>0;i--){
            resuslt+=K/money[i];
            K%=money[i];
        }*/

        return result;
    }
}
