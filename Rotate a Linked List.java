class Solution {
    public Node rotate(Node head, int k) {
        // add code here
        if(k==0 || head==null || head.next==null)
            return head;
            
            Node curr=head;
            int length=1;
            while(curr.next!=null){
            curr=curr.next;
            length++;
                
            }
            k=k%length;
            if(k==0)
            return head;
            curr.next=head;
            curr=head;
            
            for(int i=0; i<k-1; i++){
                curr=curr.next;
                
            }
            head=curr.next;
            curr.next=null;
            
        return head;    
    }
}