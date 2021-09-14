package baekjoon.dfsbfs;

//단방향노드
public class Node {
    int data;
    Node next = null;

    Node(int data){
        this.data = data;
    }

    //노드 추가
    void append(int data){
        Node end = new Node(data);
        Node n = this; //첫 번쨰 노드 선택
        while (n.next!=null){
            n = n.next;
        }
        n.next = end;
    }

    //노드 삭제
    void delete(int data){
        Node n = this; //첫번째 노드 선택
        while (n.next!=null){
            if(n.next.data == data){
                n.next=n.next.next;
            }else{
                n=n.next;
            }
        }
    }

    void retrieve(){
        Node n = this;
        while (n.next!=null){
            System.out.print(n.data+"->");
            n = n.next;
        }
        System.out.print(n.data); //마지막 데이터
        System.out.println();
    }
}

class NodeTest{
    public static void main(String[] args) {
        Node node = new Node(1); 
        node.append(2);
        node.append(3);
        node.append(4);
        node.retrieve();
        node.delete(2);
        node.retrieve(); //첫 번째 데이터는 삭제 불가
    }
}
