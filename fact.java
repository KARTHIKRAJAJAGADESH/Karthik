import java.util.*;
import java.io.*;
   public class FactorialExample{  
     public static void main(String args[])throws IOException{  
      int i,fact=1; 
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n=Integer.parseInt(br.readLine());
                                                                                       
      for(i=1;i<=n;i++)
      {    
          fact=fact*i;    
      }    
      System.out.println("Factorial of "+n+" is: "+fact);    
     }  
    }  
