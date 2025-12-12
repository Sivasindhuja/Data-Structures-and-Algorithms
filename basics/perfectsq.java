package basics;
import java.util.*;
public class perfectsq {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int  sqrt=(int)Math.sqrt(n);
        System.out.println(sqrt);
        if((sqrt*sqrt)==n){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}
