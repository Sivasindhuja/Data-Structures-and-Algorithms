package RSAalgo;
import java.math.BigInteger;
import java.util.Scanner;
//Rivest-Shamir-Adleman algorithm
//Asymetric key crypto algos
public class RSAAlgo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter message: ");
        String text = sc.nextLine();

        // Convert text to number
        BigInteger message = new BigInteger(text.getBytes());
        BigInteger p = sc.nextBigInteger();
        BigInteger q = sc.nextBigInteger();

        BigInteger n = p.multiply(q);
        BigInteger phi = p.subtract(BigInteger.ONE)//(p-1)
                          .multiply(q.subtract(BigInteger.ONE));//*(q-1) */

        
        BigInteger e = BigInteger.valueOf(65537);
            if (!phi.gcd(e).equals(BigInteger.ONE)) {
                System.out.println("e is not coprime with phi(n)");
                return;
            }

        BigInteger d = e.modInverse(phi);

        BigInteger cipher = message.modPow(e, n);
        BigInteger decrypted = cipher.modPow(d, n);

        System.out.println("Encrypted: " + cipher);

        String decryptedText = new String(decrypted.toByteArray());
        System.out.println("Decrypted Text: " + decryptedText);

    }
}
