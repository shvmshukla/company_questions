
public class App
{
  public static void main(String args[]) 
  {
    String text = "This - text ! has \\ /allot # of % special % characters"; 
    text = text.replaceAll("[^a-zA-Z0-9]", "");
    
    System.out.println(text);
    
    String html = "This is bold";
    html = html.replaceAll("[^a-zA-Z0-9\\s+]", ""); 
    System.out.println(html); 
    } 
    
 } 

/*
 Output 
 Thistexthasallotofspecialcharacters b 
 This is bold b
*/

//Read more: https://javarevisited.blogspot.com/2016/02/how-to-remove-all-special-characters-of-String-in-java.html#ixzz5HROq2SDk
