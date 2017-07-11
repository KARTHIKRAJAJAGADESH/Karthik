import java.io.*;
public class Palindrome 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter a String : ");
        String str = br.readLine();
        String rev = "";
        int n = str.length();
        for(int i=n-1 ; i>=0 ; i--)
        {
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev))
            System.out.println("\nGiven string is a palindrome");
        else
            System.out.println("\nGiven string is not a palindrome");
    }
}
