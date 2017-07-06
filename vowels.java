import java.util.*;
import java.io.*;
public class Vowels{
  public static void main(String args[])throws IOException{
    int n;
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the character");
    n=sc.next().charAt(0);
    if(n=='a' || n=='A' || n=='e' || n=='E' || n=='i' || n=='o' || n=='u' || n=='I' || n=='O' || n=='U')
    {
      System.out.println("Vowels");
      }
    else {
      System.out.println("Consonant");
      }
      }
    } // end of if-else
