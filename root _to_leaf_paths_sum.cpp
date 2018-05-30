/*
Given a binary tree, where every node value is a number . Find the sum of all the numbers which are formed from root to leaf paths.

For example consider the following Binary Tree.
 

           6                               
         /   \                          
        3     5                      
      /   \     \
     2    5      4             
        /  \                        
       7    4                 
            
  There are 4 leaves, hence 4 root to leaf paths:
  Path                      Number
  6->3->2                   632
  6->3->5->7                6357
  6->3->5->4                6354
  6->5>4                    654   
Answer = 632 + 6357 + 6354 + 654 = 13997 
https://practice.geeksforgeeks.org/problems/root-to-leaf-paths-sum/1
https://www.geeksforgeeks.org/sum-numbers-formed-root-leaf-paths/
*/

int treePath(Node*root,int val)
{
    if(root==NULL)
        return 0;
    val=val*10+root->data;
    if(root->left==NULL && root->right==NULL)
    return val;
    
    return treePath(root->left,val)+treePath(root->right,val);
}
long long treePathsSum(Node *root)
{
    return treePath(root,0);
}
