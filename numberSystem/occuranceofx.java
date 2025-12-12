package numberSystem;
import java.util.*;
public class occuranceofx {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int inputNumber=sc.nextInt();
        int x=sc.nextInt();
        int count=0;
        while(inputNumber!=0){
            int digit=inputNumber%10;
            if(digit==x){
                count++;
            }
            inputNumber/=10;
        }
        System.out.println(count);

    }
}
