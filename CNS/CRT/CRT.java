package CRT;
import java.util.*;
public class CRT {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //input a's
        int a1=sc.nextInt();
        int a2=sc.nextInt();   
        int a3=sc.nextInt();
        //input m's
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();

        //calculate M
        int M=m1*m2*m3;

        //calculating M1,M2,M3
        int M1=M/m1;
        int M2=M/m2;
        int M3=M/m3;

        //calculating M inverse

        int M1Inverse=0;
        for(int i=1;i<M1;i++){
            if((M1 * i) % m1 == 1){
                M1Inverse=i;
                break;
            }
        }
        System.out.println(M1Inverse);
        int M2Inverse=0;
        for(int i=0;i<M2;i++){
            if(((M2 * i) % m2 == 1)){
                M2Inverse=i;
                break;
            }
        }
        int M3Inverse=0;
        for(int i=0;i<M3;i++){
            if((M3 * i) % m3 == 1){
                M3Inverse=i;
                System.out.println(M3Inverse);
                break;
            }
        }

        int ans=((a1*M1*M1Inverse)+(a2*M2*M2Inverse)+(a3*M3*M3Inverse)) % M;
        System.out.println("ans " +ans);

        }   
    }