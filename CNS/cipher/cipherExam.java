package cipher;
import java.util.*;
public class cipherExam {
    


    public static String encrypt(String text,int shift){
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                ch = (char) ((ch - base + shift) % 26 + base);
            result += ch;
        }
        return result;
    }
    
    public static String decrypt(String text,int shift){
        return encrypt(text,26-shift);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    String text=sc.nextLine();
	   int shift=sc.nextInt();
	   
	   shift=shift%26;
	   
	   String enc=encrypt(text,shift);
	   String dec=decrypt(enc,shift);
	   
	   
	    
		System.out.println(enc);
		System.out.println(dec);

        sc.close();
	}
}

// 

