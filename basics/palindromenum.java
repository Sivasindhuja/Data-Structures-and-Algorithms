package basics;
import java.util.*;
public class palindromenum {
    public static int reverse(int n){
        int rev=0;
        int temp=n;
        while(temp!=0){
            int digit=temp%10;
            rev=rev*10+digit;
            temp/=10;
        }
        return rev;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=reverse(n);
        System.out.println(rev);
        if(n==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
