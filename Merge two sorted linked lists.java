class Solution {
    Node sortedMerge(Node head1, Node head2) {
        if(head1==null) return head2;
        if(head2==null) return head1;
          
          Node result;
          
            if(head1.data<=head2.data){
                result=head1;
                head1=head1.next;
            }
                else{
                result=head2;
                head2=head2.next;
            }
            Node curr=result;
        
        while(head1!=null && head2!=null){
            
            if(head1.data<=head2.data){
                curr.next=head1;
                head1=head1.next;
                
            }
            else{
                curr.next=head2;
                head2=head2.next;
            }
            curr=curr.next;
            // curr.next=null;            
        }
        if(head1!=null){
            curr.next=head1;
        }
        else{
            curr.next=head2;
            
        }
        return result;
    }
}