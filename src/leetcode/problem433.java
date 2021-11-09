package leetcode;

import java.util.*;

/**
 * 433. Minimum Genetic Mutation
 */

public class problem433 {
    public static void main(String[] args) {
        String[] b1 = {"AACCGGTA"};
        String[] b2 = {"AACCGGTA","AACCGCTA","AAACGGTA"};
        String[] b3 = {"AAAACCCC","AAACCCCC","AACCCCCC"};
        String[] b4 = {"AAAAAAAA","AAAAAAAC","AAAAAACC","AAAAACCC","AAAACCCC","AACACCCC","ACCACCCC","ACCCCCCC","CCCCCCCA"};

        //minMutation("AACCGGTT", "AACCGGTA", b1); //return 1
        //minMutation("AACCGGTT", "AAACGGTA", b2); //return 2
        //minMutation("AAAAACCC", "AACCCCCC", b3); //return 3
        System.out.println(minMutation("AAAAAAAA","CCCCCCCC", b4));
    }

    /**
     * BFS 솔루션 이용
     */
    public static int minMutation(String start, String end, String[] bank) {
      if(start.equals(end)){
          return 0;
      }

      Queue<String> q = new LinkedList<>();
      Set<String> vis = new HashSet<>(); //방문여부

      q.add(start);
      vis.add(start);
      int level = 0;

      while(!q.isEmpty()){ //BFS 시작
          int len = q.size();

          while(len-- > 0){
              String curr = q.poll();

              if(curr.equals(end)){ //end로 변경이 된다면
                  return level;
              }

              for(String e : bank){
                  int diff = 0;
                  for(int i=0;i<e.length();i++){
                      if(curr.charAt(i) != e.charAt(i)) {
                          diff++;
                      }

                      if(diff > 1){ break;} //최소인 비교값 찾기
                  }
                  
                  if(diff==1 && !vis.contains(e)){
                      q.add(e);
                      vis.add(e);
                  }
              }
          }
          
          level++;
      }
      return -1;
  }
}
