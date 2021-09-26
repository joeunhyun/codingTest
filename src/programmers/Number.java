package programmers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//모의고사
public class Number {
    public static void main(String[] args) {
        int[] numbers = {2,5,3,8,1};
        int k = 3;
        int t = 11;

        System.out.println(String.valueOf(solution(numbers, k ,t)));

    }

    public static int cnt = 0;

    public static int solution(int arr[], int k , int t) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        while (k<=arr.length){
            combination(arr, visited, 0, n, k, t);
            k++;
        }
        return cnt;
    }

    static void combination(int[] arr, boolean[] visited, int start, int n, int r, int t) {
        int sum = 0;
        if(r==0) {
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    sum+=arr[i];
                }
            }
            if(sum<=t) cnt++;
            return;
        }

        for(int i=start; i<n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1, t);
            visited[i] = false;
        }
    }
}
