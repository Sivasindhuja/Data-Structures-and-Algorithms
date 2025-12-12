package ApnaCollegeDsaSheetq;
import java.util.*;
public class BinToDec {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int binNumber=sc.nextInt();

        int pow=1;
        int ans=0;

        while(binNumber!=0){
            int rem=binNumber%10;
            ans=ans+(rem*pow);
            pow=pow*2;
            binNumber=binNumber/10;
        }
        System.out.println(ans);
    }
}
