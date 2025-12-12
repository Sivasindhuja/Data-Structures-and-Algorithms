package basics;
import java.util.*;
public class friendlypair {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        int sum=0;
        int sum2=0;

        for(int i=1;i<n1;i++){
            if(n1%i==0){
                sum+=i;
            }
        }

        for(int i=1;i<n2;i++){
            if(n2%i==0){
                sum2+=i;
            }
        }

        if(((double)sum/n1)==((double)sum2/n2)){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }

        
    }
}
