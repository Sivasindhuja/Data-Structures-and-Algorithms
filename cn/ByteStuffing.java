package cn;
import java.util.*;
public class ByteStuffing {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String res="";
       input= 'F' + input + 'F';
       
       for(int i=0;i<input.length();i++){
           if(input.charAt(i) == 'F' && i!=0 && i!=input.length()-1){
               res = res + 'E' + input.charAt(i);
           }
           else if(input.charAt(i)=='E'){
               res=res+'E'+input.charAt(i);
           }
           else{
               res+=input.charAt(i);
           }
       }
       System.out.println(res);
    }
}

