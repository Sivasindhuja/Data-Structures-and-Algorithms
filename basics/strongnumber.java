package basics;
import java.util.*;
public class strongnumber {
    public static int factof(int n){
        int fact=1;
        for(int i=1;i<=n;i++){

            fact*=i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //sum of fact of each digit of n is equal to n

        int sum=0;
        int temp=n;
        while(temp!=0){
            int digit=temp%10;
            int fact=factof(digit);
            sum+=fact;
            temp/=10;
        }

        if(sum==n){
            System.out.println("strong number");
        }
        else{
            System.out.println("not strong");
        }
    }
}
