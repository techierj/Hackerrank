
import java.util.*;
public class Solution {
       
          static void insertionSort(int[] ar) {
                               int  a=ar.length;
              boolean done=false;
              int temp=ar[a-1];
              for(int j=a-2;j>=0;j--)
              {
                  if(temp<ar[j])
                  {
                      ar[j+1]=ar[j];
                      printArray(ar);
                      //ar[j]=temp;
                  }
                  else if(temp>=ar[j]){ar[j+1]=temp;printArray(ar);done=true;break;}
                  
              }
              if(!done){ar[0]=temp;printArray(ar);}
       }   

/* Tail starts here */
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           insertionSort(ar);
       }    
   }
