package numberSystem;
import java.util.*;
public class primesbw1100{
    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        for(int i=1;i<=100;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        
    }
}