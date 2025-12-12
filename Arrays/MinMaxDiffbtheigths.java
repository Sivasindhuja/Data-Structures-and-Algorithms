import java.util.*;
public class MinMaxDiffbtheigths {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int diff=(arr[arr.length-1]-k)-(arr[0]+k);
        System.out.println(diff);


    }
}
