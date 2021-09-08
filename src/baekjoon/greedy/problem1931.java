package baekjoon.greedy;

import java.util.Scanner;

//회의실 문제
public class problem1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int[] startTime = new int[N];
        int[] endTime = new int[N];

        for (int i = 0 ; i < N ; i++){
            startTime[i] = sc.nextInt();
            endTime[i] = sc.nextInt();
        }

        System.out.println(solution(startTime, endTime, N));
    }

    public static int solution(int[] startTime , int[] endTime, int N){
        int result = 1;
        int start = startTime[0];
        int end = endTime[0];

        for(int i = 1 ; i < N ; i++){
                if(end <= startTime[i]){
                    result++;
                    start = startTime[i];
                    end = endTime[i];
                }
                else continue;
        }
        return result;
    }
}
