package baekjoon.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Graph{
    class Node{
        int data;
        LinkedList<Node> adjacent ; //자식
        boolean marked;
        Node(int data){
            this.data = data;
            this.marked = false;
            adjacent = new LinkedList<Node>();
        }
    }

    Node[] nodes;
    Graph(int size){
        nodes = new Node[size];
        for(int i = 0 ; i < size; i++){
            nodes[i] = new Node(i);
        }
    }
    void addEgde(int i1, int i2){
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];
        if(!n1.adjacent.contains(n2)){
            n1.adjacent.add(n2);
        }
        if(!n2.adjacent.contains(n1)){
            n2.adjacent.add(n1);
        }
    }

    void dfs(){
        dfs(0);
    }

    void dfs(int index){
        Node root = nodes[index];
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        root.marked = true;
        while(!stack.isEmpty()){
            Node r = stack.pop();
            for(Node n : r.adjacent){
                if(n.marked == false){
                    n.marked = true;
                    stack.push(n);
                }
            }
            visit(r);
        }
    }

    void bfs(){
        bfs(0);
    }

    void bfs(int index){
        Node root = nodes[index];
        Queue<Node> queue1 = new LinkedList<>();
        queue1.add(root);
        root.marked = true;

        while (!queue1.isEmpty()){
            Node r = queue1.poll();
            for(Node n : r.adjacent){
                if(n.marked==false){
                    n.marked = true;
                    queue1.add(n);
                }
            }
            visit(r);
        }
    }

    void bfsR(){
        bfsR(0);
    }

    void bfsR(int index){
        Node r = nodes[index];
        bfsR(r);
    }

    void bfsR(Node r){
        if(r==null) return;
        r.marked = true;
        visit(r);
        for(Node n : r.adjacent){
            if(n.marked == false){
                bfsR(n);
            }
        }
    }

    void visit(Node n){
        System.out.print(n.data+" ");
    }
}
public class CreateBfsDfs {
    public static void main(String[] args) {
        Graph g = new Graph(9);
        g.addEgde(0, 1);
        g.addEgde(1, 2);
        g.addEgde(1, 3);
        g.addEgde(2, 4);
        g.addEgde(2, 3);
        g.addEgde(3, 4);
        g.addEgde(3, 5);
        g.addEgde(5, 6);
        g.addEgde(5, 7);
        g.addEgde(6, 8);
        g.bfsR();

    }
}
