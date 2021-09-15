package baekjoon.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class problem2606 {
    public static int[][] arr;
    public static boolean[] visited;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int point = scan.nextInt();
        int line = scan.nextInt();
        int start = 1;

        arr = new int[point+1][point+1];

        for(int i=1;i<=line;i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        // 깊이우선탐색
        visited = new boolean[point+1];
        System.out.println(bfs(arr, visited, start));


    }
    public static int bfs(int[][] a, boolean[] c, int v) {
        Queue<Integer> q = new LinkedList<>();
        int n = a.length - 1;
        int cnt = 0;
        q.add(v);
        c[v] = true;
        while (!q.isEmpty()) {
            v = q.poll();
            for (int i = 1; i <= n; i++) {
                if (a[v][i] == 1 && !c[i]) {
                    q.add(i); c[i] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }

}
