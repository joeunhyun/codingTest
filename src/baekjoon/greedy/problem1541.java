package baekjoon.greedy;

import java.util.*;

//잃어버린 괄호
public class problem1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }

    public static int solution(String str){
        int answer = 0;
        String[] temp = str.split("-");

        if(temp.length>0){
            for(int i = 0; i <temp.length; i++){
                if (i==0){
                    answer=calculation(temp[i]);
                }else {
                    answer-=calculation(temp[i]);
                }
            }
        }else{
            calculation(str);
        }

        return answer;
    }

    public static int calculation(String str){
        LinkedList<Integer> numList = new LinkedList<>();
        LinkedList<Character> opList = new LinkedList<>();
        String num = "";

        //문자열을 연산식과 숫자로 나눔
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(ch=='+'){
                opList.add(ch);
                numList.add(Integer.parseInt(num));
                num = "";
                continue;
            }
            num+=ch;
        }

        numList.add(Integer.parseInt(num)); //마지막값 넣기

        while (!opList.isEmpty()){
            int prenum = numList.poll();
            int aftnum = numList.poll();

            if(opList.poll()=='+') numList.addFirst(prenum+aftnum);
        }

        return numList.poll();
    }
}
