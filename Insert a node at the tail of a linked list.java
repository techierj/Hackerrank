/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
Node head1=new Node();
head1.data=data;
head1.next=null;

    if(head==null)
      {        
      head=head1;     
      return head;
      }
    
        Node tmp=head;
        while(tmp.next!=null)
        {
            tmp=tmp.next;
        }
        
        tmp.next=head1;        
        return head;

}
