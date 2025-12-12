package numberSystem;
import java.util.*;
public class hcf {
    public static boolean isFactor(int n1,int i){
        if(n1%i==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        
        //highest common factor

        int min=Math.min(n1,n2);
        int ans=0;

        for(int i=1;i<=min;i++){
            if(isFactor(n1,i) && isFactor(n2,i)){
                ans=i;
            }
        }
        System.out.println(ans);
    }
}
