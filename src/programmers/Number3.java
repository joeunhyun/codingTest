package programmers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//모의고사
public class Number3 {
    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        System.out.println(solution(numbers));

    }

    public static String solution(int[] numbers) {
        String answer = "";
        List<String> sNumbers = new ArrayList<>();

        for(int x: numbers){ //문자열로 변환
            sNumbers.add(String.valueOf(x));
        }

        //문자열을 내림차순으로 정렬
        Collections.sort(sNumbers, ((o1, o2) -> (o2+o1).compareTo(o1+o2)));

        if(sNumbers.get(0).equals("0")) return "0";

        for(int i = 0 ; i < sNumbers.size(); i++){
            answer+=sNumbers.get(i);
        }

        /*A.compareTo(B)
            A와 B가 같으면 0 리턴
            A가 B보다 크면 양수 리턴
            A가 B보다 작으면 음수 리턴
            맨 첫자리부터 차례대로 비교
       **/
        return answer;
    }
}
