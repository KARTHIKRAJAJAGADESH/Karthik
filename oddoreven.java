import java.util.*;
import java.io.*;
public class Oddoreven{
  public static void main(String args[])throws IOException{
    int a;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the integer");
    a=Integer.parseInt(br.readLine());
    if(a%2==0)
    {
      System.out.println("Even");
      }
    else {
      System.out.println("odd");
      }
      }
    } // end of if-else
  
