/*
You are given two integer arrays, A and B, each containing N integers. The size of the array is <= 1000. You are free to permute the order of the elements in the arrays.

Now for the real question - is there an arrangement of the arrays such that Ai+Bi>=K for all i where Ai denotes the ith element in the array A.


Input Format
The first line contains the an integer T denoting the number of test-cases. T test cases follow. Each test case is given in the following format.

The first line contains two integers, N and K. The second line contains N integers separated by a single space, denoting A array. The third line describes B array in a same format.

Output Format
For each test case, if there is such arrangement exists output “YES”, otherwise “NO” (quotes for clarity).


Constraints
1 <= T <= 10
1 <= N <= 1000
1 <= K <= 109
0 <= Ai, Bi <= 109


Sample Input

2
3 10
2 1 3
7 8 9
4 5
1 2 2 1
3 3 3 4

Sample Output

YES
NO
Explanation

The first input has 3 elements in Array A and Array B, we see that the one of the arrangements, 3 2 1 and 7 8 9 has each pair of elements (3+7, 2 + 8 and 9 + 1) summing upto 10 and hence the answer is “YES”.

The second input has B array with three 3s. So, we need at least three numbers in A to be greater than 1. As its not the case, the answer is “NO”.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner in=new Scanner(System.in);
        
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int k=in.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            
            for(int j=0;j<n;j++)
            {
                a[j]=in.nextInt();
            }
            for(int j=0;j<n;j++)
            {
                b[j]=in.nextInt();
            }
            
            sort(a,b,k);
        }
    }
    
    public static void sort(int[] a,int[] b,int k)
    {
       
        
        for(int i=0;i<=a.length-1;i++)
        {
            int temp;
            for(int j=i;j<=a.length-1;j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
                if(b[i]>b[j])
                {
                    temp=b[j];
                    b[j]=b[i];
                    b[i]=temp;
                }
            }
        }
        
        
        check(a,b,k);
    }
    
    public static void check(int[] a,int[] b,int k)
    {
        boolean ans=false;
        
        for(int i=0;i<a.length;i++)
        {
            
            if(a[i]+b[i]>=k)
            {
                ans=true;
            }
            else
            {
                ans=false;
                break;
            }
        }
        if(ans) System.out.println("YES");
        else System.out.println("NO");
       
    }
}
