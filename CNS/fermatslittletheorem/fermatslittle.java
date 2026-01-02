package fermatslittletheorem;
public class fermatslittle {
    public static long power(long x, long y, long p) {
        long res = 1;
        x = x % p;
        while (y > 0) {   
            if (y % 2 == 1) {
                res = (res * x) % p;
            }
            y = y >> 1; 
           
            x = (x * x) % p;
        }
        return res;
    }

    
    public static long modInverse(long a, long p) {
        
        return power(a, p - 2, p);
    }

    public static void main(String[] args) {
        int a = 3;
        int p = 11; 
        
        long result = power(a, p - 1, p);
        System.out.println(a + "^(" + p + "-1) mod " + p + " = " + result); // Output: 1

         
        long inverse = modInverse(a, p);
        System.out.println("Modular multiplicative inverse of " + a + " mod " + p + " is " + inverse); // Output: 4
        // Check: (3 * 4) % 11 = 12 % 11 = 1
    }
}

