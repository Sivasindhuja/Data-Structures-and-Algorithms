package ApnaCollegeDsaSheetq;
import java.util.*;
public class DecToBin {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int decNumber=sc.nextInt();
	    int ans=0;
	   // int pow=0;
	   int pow=1;
	    while(decNumber!=0){
	        
	       // ans=ans+(((int)Math.pow(10,pow))*decNumber%2);
	       // pow++;
	       ans=ans+((decNumber%2)*pow);
	       pow*=10;
	        decNumber=decNumber/2;
	        
	    }
		System.out.println(ans);
	}
}

