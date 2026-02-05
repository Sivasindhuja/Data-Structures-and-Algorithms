package BitWiseOperation;
import java.util.*;
public class bitwiseOperators{
    public static void main(String[] args) {
       String str="Hello world";
        //And opeartion
        for (int i = 0; i < str.length(); i++) {
            int andop=str.charAt(i)&127;
            System.out.println("andop is"+andop);
            char character=(char)andop;
            System.out.println(" and lo print statement "+character);
        }
        //Or operation
    for (int i = 0; i < str.length(); i++) {
            int orop=str.charAt(i)|127;
            System.out.println(orop);
            //char character=(char)orop;
            // System.out.println("charcacter is "+character);
            // System.out.println("or"+ character);
        }
    }
}