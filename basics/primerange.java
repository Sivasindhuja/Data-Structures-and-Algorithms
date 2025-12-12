package basics;
import java.util.*;
public class primerange {
    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
           
        }
         return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int end=sc.nextInt();
        int end2=sc.nextInt();

        for(int i=end;i<=end2;i++){
            if(end==1){
                System.out.println("not prime");
                continue;
            }
            if(isPrime(i)){
                System.out.println( i+" is prime");
            }
            else{
                System.out.println(i +" is not prime");
            }
        }
    }
}
