class Solution {
    Node reverseList(Node head) {
        // code here
        Node current= head;
        Node previous= null;
        Node next=null;
        while(current!=null){
                next=current.next;
                current.next=previous;
                previous= current;
                // 
            
            current=next;
        }
        return previous;
    }
}