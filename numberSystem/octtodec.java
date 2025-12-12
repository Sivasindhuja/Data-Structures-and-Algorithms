package numberSystem;
import java.util.*;
public class octtodec {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int oct=sc.nextInt();

    double dec=0;
    double pow=0;
    int  temp= oct;

    while(temp!=0){
        int digit=temp%10;
        dec+=digit*Math.pow(8,pow);
        pow++;
        temp/=10;
    }
    System.out.println(dec);
}
}