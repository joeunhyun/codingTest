package baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

//ATM
public class problem11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, N= sc.nextInt();
        int[] time = new int[N];

        for (i = 0; i < N; i++) time[i] = sc.nextInt();

        System.out.println(solution(time, N));
    }

    public static int solution(int[] time , int N){
        int answer = 0;

        //오름차순 배열
        Arrays.sort(time);

        for(int i = 0 ; i < time.length ; i++){
            answer+=time[i]*(time.length-i);
        }
        return answer;
    }
}
