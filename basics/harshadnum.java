package basics;
import java.util.*;
public class harshadnum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int temp=n;
        int sum=0;
        while(temp!=0){
            int digit=temp%10;
            sum+=digit;
            temp/=10;
        }

        if(n%sum==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
