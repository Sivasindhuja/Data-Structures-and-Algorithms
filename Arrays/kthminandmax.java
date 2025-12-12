import java.util.*;
public class kthminandmax{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        Arrays.sort(arr);
        int temp=k;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                temp--;
            }
            if(temp==1){
                System.out.println("smallest is"+arr[i]);
            }
        }
        
        //greatest element
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=arr[i]+1){
                k--;
            }
            if(k==1){
                System.out.println("greatest is"+arr[i]);
            }
        }
        
    }
}