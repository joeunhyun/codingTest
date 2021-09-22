package baekjoon.dfsbfs;

import java.util.*;

//단지 번호 찾기
public class problem2667 {
    public static int[][] arr;
    public static boolean[][] visited;
    public static int cnt;
    public static int N; //지도의 크기

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> answer = new ArrayList<>();

        //값 초기화
        N = scan.nextInt(); // 지도의 크기
        arr = new int[N][N];
        visited = new boolean[N][N];
        cnt = 0;

        //값 입력
        for(int i=0;i<N;i++) {
            String input = scan.next();
            for(int j=0;j<N;j++){
                arr[i][j]=input.charAt(j)-'0';
            }
        }

        //값 확인
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++){
                if(arr[i][j]==1 && !visited[i][j]){
                    cnt=1;
                    search(i,j);
                    answer.add(cnt);
                }
            }
        }

        Collections.sort(answer);
        System.out.println(answer.size());
        for(int x : answer) System.out.println(x);

    }
    public static int search(int a, int b) {
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
    }

}
