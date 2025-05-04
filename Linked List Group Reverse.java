class Solution {
    public static Node reverseKGroup(Node head, int k) {
        // code here
        if(head==null || k==1)
        return head;
        
        Node dum=new Node(0);
        dum.next=head;
        Node pre=dum;
        Node curr=head;
        
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        curr=head;
        while( count>0){
            Node fnog=curr;
            Node pnog=null;
            
            int groupsize=Math.min(k,count);
            for(int i=0; i<groupsize; i++){
                Node next=curr.next;
                curr.next=pnog;
                pnog=curr;
                curr=next;
                
            }
            
            pre.next=pnog;
            fnog.next=curr;
            pre=fnog;
            count-=groupsize;   
        }
        return dum.next;
    }
}
