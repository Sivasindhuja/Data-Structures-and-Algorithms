package eulerstotient;
import java.util.*;
public class eulerstotient {

    public static int eulerstotient(int n) {
    int result = n;

    for (int p = 2; p * p <= n; p++) {
        // Check if p is a prime factor
        if (n % p == 0) {
            // If yes, remove all multiples of p from result
            while (n % p == 0) {
                n /= p;
            }
            result -= result / p;
        }
    }

    // If n has a prime factor greater than sqrt(n)
    if (n > 1) {
        result -= result / n;
    }

    return result;
}

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=eulerstotient(n);
        System.out.println(ans);
    }
}

