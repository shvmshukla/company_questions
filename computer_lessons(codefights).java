

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shivam
 */
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;
public class fffff {
 
    public static void main(String[] args) {
     
  String pros[] = {"Jack", "Leon", "Maria"}; 
  String c[][] = {{"Computer repair", "Handyman", "House cleaning"},
      {"Computer lessons", "Computer repair", "Data recovery service"},
      {"Computer lessons", "House cleaning"}};
//String [][][] res= new String[5][1][1];
       // System.out.println("shivam");
 TreeSet<String> t = new TreeSet<String>();
 int len=0;
        for (int i=0;i<c.length;i++) {
      for (int j=0;j<c[i].length;j++) {
          if (t.add(c[i][j])) {
              //System.out.print(c[i][j]+"  ");
              len++;
          }
      }
        }
        System.out.println(len);
  //return res; 
        String res[][][]= new String[1][len][3];
        int p=0;
        Iterator itr;
      itr = t.iterator();

      
     TreeMap<String,List<String> > tmap; 
        tmap = new TreeMap<String,List<String>>();
        
      
        while (itr.hasNext()) {
            ArrayList<String> l = new ArrayList<String>();
            String str=itr.next()+"";
           // System.out.println(str);
         
         for (int i=0;i<c.length;i++) {
      for (int j=0;j<c[i].length;j++) {
          if (c[i][j].equals(str)) {
              l.add(pros[i]);
                }
          }
     }
         tmap.put(str,l);
        //  l.clear(); 
    }
        
        //printing TreeMap
        
       for(Map.Entry m:tmap.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }
        
      }
 }
    
/*OUTPUT
5
Computer lessons [Leon, Maria]
Computer repair [Jack, Leon]
Data recovery service [Leon]
Handyman [Jack]
House cleaning [Jack, Maria]
BUILD SUCCESSFUL (total time: 0 seconds)
*/


  
 
     

  

   

