import java.util.*;

public class RSAAlgo{
    //euclidean algorithm
    static int commonDivisor(int F, int S) {
        if (S == 0) {
            return F;
        }
        return commonDivisor(S, F % S);
    }

    public static boolean coPrimes(int a,int b){
        if (commonDivisor(a, b) == 1) {
            return true;
        }
        else{
            return false;
        }
    }
    public static int findE(int phiN){
        for(int i=2;i<phiN;i++){
            if(coPrimes(i,phiN)){
                return i;
            }
        }
        return -1;
    }
    
    public static int findD(int e,int phiN){
      int k=1;
      for(int i=0;i<Integer.MAX_VALUE;i++){
        int rem=(k*phiN+1)%e;

      if(rem==0){
        return (k*phiN+1)/e;
      }
      else{
        k++;
      }
      }
      return -1;
      
    }
    public static void main(String args[]){
        //select two large prime numbers
        Scanner sc=new Scanner(System.in);
        //input the message
        String Message=sc.nextLine();
        int p=sc.nextInt();
        int q=sc.nextInt();

        int n=p*q;
        int phiN=(p-1)*(q-1);
        //find e
        int  e=findE(phiN);
        double doubleE=(double)e;
        //find d
        double d=(double)findD(e,phiN);

        //ecryption:
        //convert the message into numbers
        double ans=(double)CipherModular.encryption(3,Message);

        //cipher text finding

        double cipherText=Math.pow(ans,doubleE) %n ;

        int cipherTexti=(int)(cipherText);


        //decryption
        double oriMessage=Math.pow(cipherText,doubleE) %n;
        System.out.println(oriMessage);
    }
}

