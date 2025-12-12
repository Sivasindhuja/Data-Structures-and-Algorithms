package basics;
import java.util.*;
public class nthfib {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a=0;
        int b=1;

        while(n>=0){
            int c=a+b;
            if(n==3){
                System.out.println(c);
            }
            
            a=b;
            b=c;

            n--;
        }
    }
}
