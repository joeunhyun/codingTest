package baekjoon.greedy;

import java.util.Scanner;

//주유소
public class problem13305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, N= sc.nextInt();
        long[] distance = new long[N-1];//거리
        long[] liter = new long[N]; //주유비용

        for (i = 0; i < N-1; i++) distance[i] = sc.nextLong();
        for (i = 0; i < N; i++) liter[i] = sc.nextLong();

        System.out.println(solution(distance, liter, N));
    }

    public static long solution(long[] distance, long[] liter, int N){
        long answer = 0;
        long minLiter = liter[0]; //초기값

        for(int i = 1 ; i < N-1 ; i++){
            if(minLiter>liter[i]) minLiter=liter[i];

            answer+=distance[i]*minLiter;
        }

        return answer;
    }
}
