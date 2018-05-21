package javaapplication13;
import java.util.*;


public class JavaApplication13 {

    
    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int i=0;
        while(i<n)
        {
            if(a[i]%(i+1)==0)
            {
                System.out.print(a[i]);
            }
            i++;
        }
        
    }
    
}
