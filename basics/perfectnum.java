package basics;
import java.util.*;
public class perfectnum {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //sum of factors of n except n=n
        int sum=0;

        for(int i=1;i<n;i++){

            if(n%i==0){
                sum+=i;
            }

        }
        if(sum==n){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }



    }
}
