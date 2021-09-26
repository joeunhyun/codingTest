package programmers;

import java.util.Arrays;
import java.util.Collections;

//동빈나 정렬에 대한 문제 풀이
public class Number4 {
    public static void main(String[] args) {
        int[] A = {1,2,5,4,3}; //1,2,3,4,5
        int[] B = {5,5,6,6,5}; //5,5,5,6,6
        int N = 5; //배열의 원소값
        int K = 3; //교체 횟수
        int answer = 0;

        //Arrays.stream(a).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).
        //List<Integer> bList = Arrays.stream(B).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        A = Arrays.stream(A).boxed().sorted().mapToInt(Integer::intValue).toArray(); //오름차순으로 정렬
        B = Arrays.stream(B).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray(); //내림차순으로정렬

        for(int i = 0 ; i < K ; i++){ //K 번째까지 A값이 B보다 작으면 교체
            if(A[i]<B[i]){
                A[i]=B[i];
            }
        }

        for(int x : A){
            answer += x;
        }

        System.out.println(String.valueOf(answer));

    }
}
