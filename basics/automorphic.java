package basics;
import java.util.*;
public class automorphic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int square=n*n;

        int temp=n;
        while(temp!=0){
            int digit=temp%10;
            int digitSquare=square%10;
            if(!(digitSquare==digit)){
                System.out.println("not automorphic");
                return;
            }
            temp/=10;
            square/=10;

        }

        System.out.println("Automorphic");
    }
}
