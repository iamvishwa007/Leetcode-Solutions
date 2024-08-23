/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
         if(head==null) return head;
        Map<Node,Node> map=new HashMap<>();
        
        Node temp=head;
        //creating clones
        while(temp!=null){
            map.put(temp,new Node(temp.val));
            temp=temp.next;
        }

        //next and random ptrs
        temp=head;
        while(temp!=null){
            map.get(temp).next=map.get(temp.next);
            map.get(temp).random=map.get(temp.random);
            temp=temp.next;
        }    
        return map.get(head);
    }
}