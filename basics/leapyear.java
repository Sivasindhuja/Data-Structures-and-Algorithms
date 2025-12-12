package basics;
import java.util.*;
public class leapyear {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n%400==0){
            System.out.println("leap year");
        }
        else if(n%4==0 && n%100!=0 ){
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }
    }
}
