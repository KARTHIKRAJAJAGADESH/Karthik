import java.util.*;
import java.io.*;
public class Power {

    public static void main(String[] args)throws IOException {
         
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the base");
        int base =Integer.parseInt(br.readLine());
        System.out.println("Enter the exponent");
        int exponent =Integer.parseInt(br.readLine());

        long result = 1;

        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println("Answer = " + result);
    }
}
