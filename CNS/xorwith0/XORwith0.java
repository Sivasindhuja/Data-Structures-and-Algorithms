package xorwith0;
import java.util.*;
public class XORwith0{
    public static void main(String[] args) {
        String input="Hello World";
        for(int i=0;i<input.length();i++){
            int ans=input.charAt(i)^0;
            System.out.println("ans"+ans);
            char character=(char)ans;
            System.out.print(character+" ");
        }
    }
}