package eucledianalgo;
import java.util.*;
public class euclideanalgo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        //find the larger number among a and b

        int max=Math.max(a, b);
        int min=Math.min(a,b);

        //get the quotient and remainder
        //quotient
        while(true){
            int quotient=max/min;
            int remainder=max%min;
            if(remainder!=0){
                max=min;
                min=remainder;
            }

            else if(remainder==0){
                System.out.println("gcd is:"+min);
                break;
            }

           
        }   

    }
}

// The Algorithm Steps
// To find the GCD of two positive integers, A and B:
// Divide the larger number (A) by the smaller number (B) to get a quotient (Q) and a remainder (R). This can be written as:
// A = B ⋅ Q + R
// Replace the larger number (A) with the smaller number (B), and the smaller number (B) with the remainder (R).
// Repeat the process until the remainder (R) is zero.
// The value of the smaller number (B) in the step where the remainder becomes zero is the GCD of the original two numbers. 
// If one of the numbers is zero, the GCD is the absolute value of the other number. 
