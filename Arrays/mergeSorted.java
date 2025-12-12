import java.util.*;
public class mergeSorted {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
         int n2=sc.nextInt();

        int arr1[]=new int[n1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }

         int arr2[]=new int[n2];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }

        int merged[]=new int[n1+n2];


        //sorted 
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                merged[k]=arr1[i];
                k++;
                i++;
            }
            else{
                merged[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<arr1.length){
            merged[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            merged[k]=arr2[j];
            j++;
            k++;
        }

        for(int x=0;x<merged.length;x++){
            System.out.println(merged[x]);
        }

       
    }
}
