// package CNS;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.management.RuntimeErrorException;
public class MD5algo {
    public static String MD5algo(String input){
        try{
             //MessageDigest msd=new MessageDigest.getInstance("MD5");
              MessageDigest msd = MessageDigest.getInstance("MD5");

            byte[] msg=msd.digest(input.getBytes(StandardCharsets.UTF_8));

            StringBuilder hexString=new StringBuilder();

            for(byte b : msg){
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        }
        catch(NoSuchAlgorithmException e){
            throw new RuntimeException(e);

        }     
    }

    public static String SHA_One_algo(String input){

        try{
            MessageDigest msd=MessageDigest.getInstance("SHA-1");

           byte[] msg=msd.digest(input.getBytes(StandardCharsets.UTF_8));

            StringBuilder hexString=new StringBuilder();

            for(byte b : msg){
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
           
        }
        catch(NoSuchAlgorithmException e){
            throw new RuntimeException(e);
        }
       
    }
    public static void main(String args[]){
        String input="Hello guys";

        String afterMD5=MD5algo(input);

        System.out.println("before "+input);
        System.out.println("After "+afterMD5);

        String afterSHA1=SHA_One_algo(input);
        System.out.println(afterSHA1);
    }
}
