package ApnaCollegeDsaSheetq;
import java.util.*;
//binary number to decimal conversion
public class BinToDec {
    public static void main(String args[]){
        //take a binary number as an input(0 and 1 only)
        Scanner sc=new Scanner(System.in);
        int binNumber=sc.nextInt();
        //start power with 1
        int pow=1;
        int ans=0;

        while(binNumber!=0){
            int rem=binNumber%10;
            ans=ans+(rem*pow);
            pow=pow*2;  // 1,2,4,8 etc 
            binNumber=binNumber/10;
        }
        System.out.println(ans);
        sc.close();
    }
}
