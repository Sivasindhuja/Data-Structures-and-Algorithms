import java.util.Scanner;
import java.util.ArrayList;

public class MoveAllNegative {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //put all the negative numbers to one array
        ArrayList<Integer> negative=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                negative.add(arr[i]);
            }
        }

       int ansArray[]=new int[n];
       int j=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]>0){
            ansArray[j]=arr[i];
            j++;
        }
       }
      int i=0;
       while(j<ansArray.length){
        ansArray[j]=negative.get(i);
        j++;
        i++;
       }

       for(int k=0;k<ansArray.length;k++){
        System.out.println(ansArray[k]);
       }

    }
}