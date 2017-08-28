/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*The structure of linked list is the following
struct node
{
int data;
Node* next;
};*/
int detectloop(Node *list)
{
    int flag=0;
   // your code here
   if(list==NULL)
    return 0;
   if(list->next==NULL)
    return 0;
   
   Node *temp= list;
   Node *temp1= list;
  while(temp1 && temp &&temp1->next)
  {
     temp=temp->next;
     temp1=temp1->next->next;
      if(temp==temp1){
        flag=1;
       break;
          
      }
  }
  
  return flag;
}
