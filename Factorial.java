import java.util.*;
import java.io.*;
public class fact {
  public static void main(String args[]) {
    int i,a, fact=1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num");
    a=sc.nextInt();
    for(i=1;i<=a;i++)
    {
      fact = fact * i;
      }
      System.out.println(fact);
      }
      }
      
