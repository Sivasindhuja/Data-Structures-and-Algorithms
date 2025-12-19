import java.util.*;
public class xorString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        int xor=str.charAt(0);
        for(int i=1;i<str.length();i++){
            xor^=str.charAt(i);
        }
        System.out.println(xor);
    }
}