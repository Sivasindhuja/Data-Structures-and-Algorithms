import java.util.*;
public class HillCipher{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String plainText=sc.next();

        int mat[][]=new int[2][2];

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        String pair1="";
        pair1+=(plainText.charAt(0));
        pair1+=(plainText.charAt(1));

        String pair2="";
        pair2+=(plainText.charAt(2));
        pair2+=(plainText.charAt(3));

          String pair3="";
        pair3+=(plainText.charAt(4));
        pair3+=(plainText.charAt(5));

           String pair4="";
        pair4+=(plainText.charAt(6));
        pair4+=(plainText.charAt(7));

        HashMap<Character,Integer> map=new HashMap<>();
        map.put('S',19);
        map.put('I',9);
        map.put('N',14);
        map.put('D',4);
        map.put('H',8);
        map.put('U',21);
        map.put('J',10);
        map.put('A',1);

        int pair1Matrix[][]=new int[2][2];
        


    }
}