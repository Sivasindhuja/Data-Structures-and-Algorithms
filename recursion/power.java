package recursion;
import java.util.*;

public class power{
    public static int Power(int base,int power,int ans){
        if(power==0){
            return ans;
        }
        else{
        ans*=base;
        return Power(base,power-1,ans);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int power=sc.nextInt();

        int ans=Power(base,power,1);
    }
}