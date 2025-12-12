package basics;
import java.util.*;
public class primeornot {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=true;

        for(int i=1;i<n/2;i++){
            if(n%i==0){
                flag=false;
               
            }
        }
        if(flag==false){
  System.out.println("not prime");
        }
       else{
 System.out.println("prime");
       }
       
    }
}
