package baekjoon.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//회의실 문제
public class problem1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N= sc.nextInt();
        int cnt = 0;
        int endtime = 0;

        int[][] time = new int[N][2];

        for (int i = 0 ; i < N ; i++){
            time[i][0] = sc.nextInt(); //시작시간
            time[i][1] = sc.nextInt(); //종료시간
        }

        //끝나는 시간 기준으로 정렬하기
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]){ //종료시간이 같으면 시작 시간 빠른거 부터
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        for(int i = 0 ; i < N ; i++){
            if(endtime <= time[i][0]){
                endtime = time[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
