package numberSystem;
import java.util.*;
public class noofdays {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        int year=sc.nextInt();

        //first check if the given year is a leap year
        boolean isLeap=false;

        if(year%400==0){
            isLeap=true;
        }
        else if(year%4==0 && year%100!=0){
            isLeap=true;
        }

        if(isLeap && month==2){
            System.out.println("29");
        }
        else if(month==2){
            System.out.println("28");

        }
        else if(month==1 || month==3 ||month==5 ||month==7 ||month==9 ||month==12){
            System.out.println("31");
        }
        else{
            System.out.println("30");
        }
    }
}
