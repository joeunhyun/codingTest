package baekjoon.dfsbfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//유기농 배추
public class problem1012 {
    public static int[][] arr;
    public static boolean[][] visited;
    public static int M; //배추밭 가로의 길이
    public static int N; //배추밭 세로의 길이
    public static int K; //배추의 갯수


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> answer = new ArrayList<>();
        int T = scan.nextInt(); //테스트 케이스

        //값 초기화
        M = scan.nextInt(); //가로
        N = scan.nextInt(); //세로
        K = scan.nextInt(); //배추
        arr = new int[M][N];
        visited = new boolean[M][N];


        //값 입력
        for(int i=0;i<K;i++) {
            int x = Integer.parseInt(scan.next());
            int y = Integer.parseInt(scan.next());
            arr[x][y]=1;
        }

        for(int i = 0 ; i < M ; i++){
            for(int j = 0 ; j < N ; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
   /* public static int search(int a, int b) {
        int[] dx = {-1,1,0,0}; //상하좌우
        int[] dy = {0,0,-1,1}; //상하좌우

        visited[a][b] = true;

        for(int i=0;i<4;i++){
            int nx = a + dx[i];
            int ny = b + dy[i];
            if(nx>=0 && ny>=0 && nx<N && ny<N){
                if(arr[nx][ny]==1 && !visited[nx][ny]){
                    cnt++;
                    search(nx,ny);
                }
            }

        }
        return cnt;
    }*/

}
