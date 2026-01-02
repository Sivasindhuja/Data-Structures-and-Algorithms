package BitWiseOperation;
import java.util.*;
public class bitwiseOperators{
    public static void main(String[] args) {
       String str="Hello world";
        //And opeartion
        for (int i = 0; i < str.length(); i++) {
            int andop=str.charAt(i)&127;
            char character=(char)andop;
            System.out.println(character);
        }
        //Or operation
    for (int i = 0; i < str.length(); i++) {
            int andop=str.charAt(i)|127;
            System.out.println(andop);
            char character=(char)andop;
            System.out.println("or"+ character);
        }
    }
}