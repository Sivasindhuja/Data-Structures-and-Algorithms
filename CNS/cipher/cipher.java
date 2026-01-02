package cipher;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class cipher{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String plainText=sc.next();

        //encryption

        //define a key and shift each characater in the plain text key number of positions

        int key=3;
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
           else{
            ans[i]=map.get(plainText.charAt(i))+key;
           }
        }
        System.out.println("cipher text is");
        for (int i = 0; i < ans.length; i++) {
            System.out.println("Cipher Text is "+ans[i]+" ");
        }


        //decryption
        String decryptedCode="";
        for(int i=0;i<ans.length;i++){
                int temp=ans[i]-3;
                
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(temp)) {
               char foundKey = entry.getKey();
            //    System.out.println(foundKey);
               decryptedCode+=foundKey;
                break; // Found the key, no need to continue
            }
        } 
        
            }
            System.out.println("decrypted code is "+decryptedCode);
             
        }

      
       
    }
