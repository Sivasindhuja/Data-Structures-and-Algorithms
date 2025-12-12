import java.util.*;
public class jumpstoreachend {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int count=0;
        while(i<arr.length){
            if(arr[i]+i>=arr.length){
                System.out.println(count+1);
                break;
            }
            count++;
            i+=arr[i];
        }
    }
}
