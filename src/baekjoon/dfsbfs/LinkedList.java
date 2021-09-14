package baekjoon.dfsbfs;

public class LinkedList {
    Node header;

    static class Node{
        int data;
        Node next = null;
    }

    LinkedList(){
        header = new Node();
    }

    //노드 추가
    void append(int data){
        Node end = new Node();
        end.data = data;
        Node n = header;
        while (n.next!=null){
            n = n.next;
        }
        n.next = end;
    }

    //노드 삭제
    void delete(int data){
        Node n = header;
        while (n.next!=null){
            if(n.next.data == data){
                n.next=n.next.next;
            }else{
                n=n.next;
            }
        }
    }

    void retrieve(){
        Node n = header.next;
        while (n!=null && n.next!=null){
            System.out.print(n.data+"->");
            n = n.next;
        }
        System.out.println(n.data); //마지막 데이터
    }
    
    void removeDups(){ //중복 데이터 삭제
        Node n = header;
        while (n.next!=null){
            Node r = n;
            while (r.next!=null){
                if(n.data == r.next.data){
                    r.next = r.next.next;//마지막 데이터까지 못가기 때문
                }else{
                    r = r.next;
                }
            }
            n = n.next;
        }
    }
}

class LinkedListNode{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(1);
        ll.retrieve();
        ll.removeDups();
        ll.retrieve();
    }
}