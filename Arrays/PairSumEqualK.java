import java.util.*;
public class PairSumEqualK {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        int count=0;//count of pairs

        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum=arr[i];
            for(int j=i+1;j<arr.length;j++){
                currSum+=arr[j];
                if(currSum==sum){
                    count++;
                }
                currSum=arr[i];
            }
        }
        System.out.println(count);
    }
}
