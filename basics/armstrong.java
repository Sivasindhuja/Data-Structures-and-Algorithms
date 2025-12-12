package basics;
import java.util.*;
public class armstrong {
    public static int findLength(int n){
        int length=0;
        while(n!=0){
            length++;
            n/=10;
        }
        return length;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int length=findLength(n);
        System.out.println(length);

        int ans=0;

        int temp=n;
        while(temp!=0){
            int digit=temp%10;
            int power=(int)Math.pow(digit, length);
            ans+=power;
            temp/=10;
        }

        if(ans==n){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }

    }
}
