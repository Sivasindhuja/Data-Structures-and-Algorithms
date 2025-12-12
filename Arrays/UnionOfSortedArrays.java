import java.util.*;
public class UnionOfSortedArrays {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();

        int arr1[]=new int[n];
        int arr2[]=new int[n1];

        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }

        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
           hs.add(arr1[i]);
        }
         for(int i=0;i<arr2.length;i++){
           hs.add(arr2[i]);
        }

        for(int element: hs){
            System.out.println(element);
        }
    }
}
