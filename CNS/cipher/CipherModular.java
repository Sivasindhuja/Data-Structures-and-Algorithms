package cipher;
import java.util.*;
public class CipherModular {
    public static int encryption(int key,String plainText){
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('H',8);
        map.put('E',6);
        map.put('L',12);
        map.put('O',15);
        map.put('W',23);
        map.put('R',18);
        map.put('D',4);

        int ans[]=new int[plainText.length()];
        for (int i = 0; i < plainText.length(); i++) {
           ans[i]=map.get(plainText.charAt(i))+key;
           if(ans[i]>26){
            ans[i]=ans[i]-26;
           }
        }
        return 1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String plainText=sc.next();

        int key=3;

        int  ans=encryption(key, plainText);
        System.out.println(plainText);


    }
}
