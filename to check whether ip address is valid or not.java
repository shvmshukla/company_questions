
class ip_addr{
 public static void main(String args[])
 {
int c=0,i;
        String s = "255.255.256.255";
        String token[] = s.split("\\.");
System.out.println(token.length);
for(i=0;i<token.length;i++)
  {
   System.out.println(token[i]);
  }

 for(i=0;i<token.length;i++)
  {
  int temp= Integer.parseInt(token[i]);
   if(!(temp<=255 && temp>=0))
   { c=1;System.out.println("invalid ip");break;}
   else 
    continue;
  }
 if(c==0)
  System.out.println("valid ip");
}
}

   
 
