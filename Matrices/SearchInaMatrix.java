package Matrices;
import java.util.*;

public class SearchInaMatrix{
    public static int[] searchMatrix(int mat[][],int target){
        int[] index=new int[2];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==target){
                    index[0]=i;
                    index[1]=j;
                    break;
                }
        }
    }

        return index;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int mat[][]=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("entre the target");
        int target=sc.nextInt();

       int[] index=searchMatrix(mat, target);
        System.out.println(index[0]+" "+index[1]);

        
    }
}

