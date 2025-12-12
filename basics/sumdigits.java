package basics;
import java.util.*;
public class sumdigits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int sum=0;
        int temp=n;

        while(temp!=0){
            int digit=temp%10;
            sum+=digit;
            temp/=10;
        }
        System.out.println(sum);
    }
}
