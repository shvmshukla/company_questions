package dynamic_programming;
//import java.lang.*;
public class check_string_rotation {
    public static void main(String[] args) { 
        
    
  String a="waterbottle";
  String b="erbottlewat";
  boolean flag=false;
  int i= b.length()-1;  // i=5
  
  while(i!=0)
  {
      if(!((a.contains(b.substring(0,i))) && (a.contains(b.substring(i, b.length())))))
       {
                      i--;
        }
      else
      {
          flag=true;
          
          break;
      }
  }
         if(flag)
             System.out.println("yes, its a rotation");
         else
             System.out.println("No, its not  a rotation");
  
        //System.out.println(a.substring(1,3));
  }
}
