/*
Mark and Jane are very happy after having their first kid. Their son is very fond of toys. Therefore, Mark wants to buy some toys for his son. But he has a limited amount of money. But he wants to buy as many unique toys as he can. So, he is in a dilemma and is wondering how he can maximize the number of toys he can buy. He has N items in front of him, tagged with their prices and he has only K rupees.

Now, you being Mark’s best friend have the task to help him buy as many toys for his son as possible.

Input Format
The first line will contain two inputs N and K, followed by a line containing N integers

Output Format
Maximum number of unique toys Mark can buy for his son.

Constraints
1<=N<=105
1<=K<=109
1<=price of any toy<=109

Sample Input

7 50
1 12 5 111 200 1000 10
Sample Output

4
Explanation

He can buy only 4 toys at most. These toys have the following prices: 1,12,5,10.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int count=0,total=0;
        
        int[] ar = new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=in.nextInt();
        }
        quickSort(ar,0,n-1);
        
        for(int i=0;i<ar.length;i++)
        {
            if(total+ar[i]<=k)
            {
                total+=ar[i];
                count++;
            }
        }
        System.out.println(count);
    }
    
    
     public static int partition(int arr[], int left, int right)
{
      int i = left, j = right;
      int tmp;
      int pivot = arr[(left + right) / 2];
     
      while (i <= j) {
            while (arr[i] < pivot)
                  i++;
            while (arr[j] > pivot)
                  j--;
            if (i <= j) {
                  tmp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = tmp;
                  i++;
                  j--;
            }
      };
     
      return i;
}
 
public static void quickSort(int arr[], int left, int right) {
      int index = partition(arr, left, right);
      if (left < index - 1)
            quickSort(arr, left, index - 1);
      if (index < right)
            quickSort(arr, index, right);
}
  
}
