package Matrices;
import java.util.*;
public class commonelinallrows {
    public static void main(String args[]){
        //take the size of the matrix as the input
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[][] mat=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 mat[i][j]=sc.nextInt();
            }
        }

        //common elements in all the rows in the given matrix

        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(mat[1][i]);
        }
        //count array

        int countArray[]=new int[n];

        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                if(set.contains(mat[i][j])){
                    countArray[j]++;
                }
            }
        }

        for(int i=0;i<countArray.length;i++){
            if(countArray[i]==m-1){
                System.out.println(countArray[i]);
            }
        }
        //optimise to handle the edge cases
        
    }
}
