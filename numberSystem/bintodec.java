package numberSystem;
import java.util.*;
public class bintodec {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int bin=sc.nextInt();

        //binary to decimal==?  from last digit *2 to the power 0->x
        double  power=0;
        int temp=bin;
        double dec=0;
        double two=2;
        while(temp!=0){
            int digit=temp%10;
            dec+=digit*Math.pow(two,power);
            power++;
            temp/=10;  
        }
        System.out.println(dec);
    }
}
