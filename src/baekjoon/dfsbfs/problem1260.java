package baekjoon.dfsbfs;

import java.util.*;
import java.util.LinkedList;

public class problem1260 {
    public static int[][] arr;
    public static boolean[] visited;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int point = scan.nextInt();
        int line = scan.nextInt();
        int start = scan.nextInt();

        arr = new int[point+1][point+1];

        for(int i=1;i<=line;i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        // 깊이우선탐색
        visited = new boolean[point+1];
        dfs(start);

        System.out.println();

        // 너비우선탐색
        visited = new boolean[point+1];
        bfs(start);


    }
    public static void dfs(int start) {
        visited[start] = true;
        System.out.print(start+ " ");

        if(start == arr.length) {
            return;
        }

        for(int a=1;a<arr.length;a++) {
            if(arr[start][a] == 1 && visited[a] == false) {
                dfs(a);
            }
        }

    }
    public static void bfs(int start) {
        Queue<Integer> que = new LinkedList<>();

        que.add(start);
        visited[start] = true;
        System.out.print(start+ " ");

        while(!que.isEmpty()) {
            int temp = que.poll();
            for(int i=1; i<arr.length;i++) {
                if(arr[temp][i] ==1 && visited[i] == false) {
                    que.add(i);
                    visited[i] = true;
                    System.out.print(i+ " ");
                }
            }
        }
    }



}
