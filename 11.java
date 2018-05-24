package javaapplication14;
import java.util.*;

public class JavaApplication14 {

    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      String a;
        a = s.nextLine();
      int n=a.length();
      
      String b="";
      int k=0;
      for(int i=n-1;i>=0;i--)
      {
          
          b+=a.charAt(i);
          
      }
    
    System.out.println(b);
    }
}
