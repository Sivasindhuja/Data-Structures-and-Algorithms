package basics;
import java.util.Scanner;
public class reversenum {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int temp=n;
        while (temp!=0) {
            int digit=temp%10;
            rev=rev*10+digit;
            temp/=10;

            
        }
    System.out.println(rev);
    }
}
