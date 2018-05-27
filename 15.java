package javaapplication17;

import java.util.*;

public class JavaApplication17 {

    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.next5Int();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        System.out.println(sum);
        
    }
    
}
