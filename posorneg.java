import java.util.*;
import java.io.*;
public class Posorneg{
  public static void main(String args[])throws IOException{
    int a,b;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the integer");
    a=Integer.parseInt(br.readLine());
    if(a >= 0)
    {
      System.out.println("Positive");
      }
    else {
      System.out.println("Negative");
      }
      }
    } // end of if-else
  
