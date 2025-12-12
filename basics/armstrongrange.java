package basics;
import java.util.*;
public class armstrongrange {

    public static int findLength(int n){
        int length=0;
        while(n!=0){
            length++;
            n/=10;
        }
        return length;
    }
    public static boolean isArmStrong(int n){
        int length=findLength(n);
        int temp=n;
        int ans=0;

        while(temp!=0){
            int digit=temp%10;
            int power=(int)Math.pow(digit, length);
            ans+=power;
            temp/=10;
        }
        if(ans==n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
   int n1=sc.nextInt();
   int n2=sc.nextInt();
   
   for(int i=n1;i<=n2;i++){
    if(isArmStrong(i)){
        System.out.println("yes");
    }
    else{
        System.out.println("no");
    }
   }
}

    }
   