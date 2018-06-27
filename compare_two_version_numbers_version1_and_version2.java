/*
Compare two version numbers version1 and version2.

If version1 > version2 return 1,
If version1 < version2 return -1,
otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 1.13 < 1.13.4

https://www.interviewbit.com/problems/compare-version-numbers/
*/
---------------------------------------------------------------------------------------------------------------------------
public class Solution {
    public int compareVersion(String A, String B) {
        String s1[]=A.split("\\.");
        String s2[]=B.split("\\.");
       
        int j=0,i=0;
        //1.3.4.5   1.3.4
        if(s1.length>s2.length)
        {
          for(i=0;i<s2.length;i++)
          {
              StringBuffer temp1= new StringBuffer(s1[i]);
              StringBuffer temp2= new StringBuffer(s2[i]);
              //remove zeros
              for(j=0;j<temp1.length();j++)
              {
                  if(temp1.charAt(j)=='0')
                   continue;
                   else
                    break;
              }
              temp1.replace(0,j,"");
             // System.out.println(temp1);
              
              for( j=0;j<temp2.length();j++)
              {
                  if(temp2.charAt(j)=='0')
                   continue;
                   else
                    break;
              }
              temp2.replace(0,j,"");
              //System.out.println(temp2);
              //str.length compare
              if(temp1.length()>temp2.length())
               return 1;
              else if(temp1.length()<temp2.length())
               return -1;
              else
               {
                  // System.out.println(temp1.length()+"  "+temp2.length());
                   for( j=0;j<temp1.length();j++)
                   {
                       
                       if(temp1.charAt(j)==temp2.charAt(j))
                        continue;
                        else if(temp1.charAt(j)>temp2.charAt(j))
                         return 1;
                        else
                         return -1;
                   }
               }
                  
          }
          
          for(i=i;i<s1.length;i++)
          {
              if(Integer.parseInt(s1[i])==0)
               continue;
               else
                return 1;
          }
          return 0;
        }
        
  //case 2      
        
        if(s2.length>s1.length)
        {
          for( i=0;i<s1.length;i++)
          {
              StringBuffer temp1= new StringBuffer(s1[i]);
              StringBuffer temp2= new StringBuffer(s2[i]);
              //remove zeros
              for(j=0;j<temp1.length();j++)
              {
                  if(temp1.charAt(j)=='0')
                   continue;
                   else
                    break;
              }
              temp1.replace(0,j,"");
             // System.out.println(temp1);
              
              for( j=0;j<temp2.length();j++)
              {
                  if(temp2.charAt(j)=='0')
                   continue;
                   else
                    break;
              }
              temp2.replace(0,j,"");
             // System.out.println(temp2);
              //str.length compare
              if(temp1.length()>temp2.length())
               return 1;
              else if(temp1.length()<temp2.length())
               return -1;
              else
               {
                  // System.out.println(temp1.length()+"  "+temp2.length());
                   for( j=0;j<temp1.length();j++)
                   {
                       
                       if(temp1.charAt(j)==temp2.charAt(j))
                        continue;
                        else if(temp1.charAt(j)>temp2.charAt(j))
                         return 1;
                        else
                         return -1;
                   }
               }
        
          }
        
        for(i=i;i<s2.length;i++)
          {
              if(Integer.parseInt(s2[i])==0)
               continue;
               else
                return -1;
          }
          return 0;
          
        }
   //case 3
   
    if(s2.length==s1.length)
        {
          for(i=0;i<s1.length;i++)
          {
              StringBuffer temp1= new StringBuffer(s1[i]);
              StringBuffer temp2= new StringBuffer(s2[i]);
              //remove zeros
              for(j=0;j<temp1.length();j++)
              {
                  if(temp1.charAt(j)=='0')
                   continue;
                   else
                    break;
              }
              temp1.replace(0,j,"");
            //  System.out.println(temp1);
              
              for( j=0;j<temp2.length();j++)
              {
                  if(temp2.charAt(j)=='0')
                   continue;
                   else
                    break;
              }
              temp2.replace(0,j,"");
             // System.out.println(temp2);
              //str.length compare
              if(temp1.length()>temp2.length())
               return 1;
              else if(temp1.length()<temp2.length())
               return -1;
              else
               {
                  // System.out.println(temp1.length()+"  "+temp2.length());
                   for( j=0;j<temp1.length();j++)
                   {
                       
                       if(temp1.charAt(j)==temp2.charAt(j))
                        continue;
                        else if(temp1.charAt(j)>temp2.charAt(j))
                         return 1;
                        else
                         return -1;
                   }
               }
    
          }
          return 0;
        }
        
        

    return 0;     
    }
   
}
