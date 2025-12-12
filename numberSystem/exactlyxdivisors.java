package numberSystem;
import java.util.*;
public class exactlyxdivisors {
    public static  int countFactors(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        //b/w 1 and n how many integers has divsers count equal to x

        int count=0;

        for(int i=1;i<=n;i++){
            int countfun=countFactors(i);
            System.out.println(countfun);
            if(countfun==x){
                count++;
            }
            
        }
        System.out.println(count);

    }
}
