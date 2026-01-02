package moduloarithmatic;
import java.util.*;
public class moduloarith {
    public static int multiplyx(int k,int temp){
        int  ans=1;
        for(int i=0;i<temp;i++){
           // System.out.println(ans);
             ans=ans*k;
        }
        return ans;
    }
    public static void main(String args[]){
        //a power x mod a
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int x=sc.nextInt();
        
        int k=4%x;
       
        int temp=0;
        if(x%2==0){
           temp=x/2;
        }
    

        int ans=multiplyx(k, temp);

        int  finalAns=ans%x;

        System.out.println(finalAns);

    }
}


