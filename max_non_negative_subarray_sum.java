/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shivam
 */
public class maxNonNegativeSubarray {
    public static void main(String[] args) {
        int arr[]={1,95,5,-7,6,-2,8,78,-4,5,6,7,112};
        int neg_index[]= new int[arr.length];
        int index=0;
        
        int sum=0,max_sum=-500;
        int m_start=-1, m_end=-1; 
        //storing negative index
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                neg_index[index++]=i;      //  3_6_8,
            }
        }
        
        for(int i=0;i<index;i++)
        {
            System.out.print(neg_index[i]+"  ");
        }
        System.out.println("");
        
        int itr=0,itr1=1;
       while(itr1<index)
       {
        for(int j=neg_index[itr]+1;j<neg_index[itr1];j++)
        {
            sum+=arr[j];
            
        }
        if(sum>max_sum)
            {
                max_sum=sum;
                m_start=neg_index[itr]+1;
                m_end=neg_index[itr1]-1;
            }
        sum=0;
        itr++;
        itr1++;
       }
       
       //check for 0 to first negative index
          sum=0;
          for(int j=0;j<neg_index[0];j++)
        {
            sum+=arr[j];
            
        }
        if(sum>max_sum)
            {
                max_sum=sum;
                m_start=0;
                m_end=neg_index[0]-1;
            }
        
        //check for last negative index to array end
          sum=0;
          for(int j=neg_index[index-1]+1;j<arr.length;j++)
        {
            sum+=arr[j];
            
        }
        if(sum>max_sum)
            {
                max_sum=sum;
                m_start=neg_index[index-1]+1;
                m_end=arr.length-1;
            }
        
      System.out.println("inclusive start index  "+m_start+"::inclusive end index::"+m_end+":: max sum is:: "+max_sum); 
    }
    
    
}
