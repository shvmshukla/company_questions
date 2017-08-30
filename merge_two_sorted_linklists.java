/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* Link list Node  
struct Node {
    int data;
    Node* next;
}; */
Node* SortedMerge(Node* head1,   Node* head2)
{ 
    Node * q,*s,*t; 
 if(head1->data<=head2->data)  
 { 
     q=head1; 
     head1=head1->next;
 } 
 else  
 {
 q=head2;
 head2=head2->next;
     
 } 
 s=q;
 while(head1!=NULL&&head2!=NULL) 
 { 
     if(head1->data<=head2->data) 
     { 
         s->next=head1;  
         s=s->next;
         head1=head1->next;
     }      
      else if(head1->data>head2->data) 
     { 
         s->next=head2;  
         s=s->next;
         head2=head2->next;
     } 
     
 } 
 while(head1!=NULL) 
 { 
     s->next=head1;  
     s=s->next;
     head1=head1->next;
 }   
  while(head2!=NULL) 
 { 
     s->next=head2;  
     s=s->next;
     head2=head2->next;
 }  
 return q;
}
