package numberSystem;
import java.util.*;
public class noofdigits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        
        int count=0;
        while(number!=0){
            int digit=number%10;
            count++;
            number/=10;
        }
        System.out.println(count);

    }
}
