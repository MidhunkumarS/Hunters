package javaapplication12;
import java.util.*;
public class JavaApplication12 {

    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
           a[i]=s.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==a[i+1])
            {
                max=a[i];
                break;
            }
            
            
            
        }
        if(max==0)
        {
            System.out.println("unique");
        }
        else
        {
            System.out.println(max);
        }
    }
    
}
