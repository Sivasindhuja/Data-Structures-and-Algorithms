package numberSystem;
import java.util.*;
public class hexadec {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //hexadecimals have characters so take string input
        String hex=sc.next();
        String digits="123456789ABCDEF";
        int power=0;

        int ans=0;
        for(int i=0;i<hex.length();i++){
            int digit=hex.charAt(i);
            ans+=Math.pow(16,power)*digit;

        }

    }
}
