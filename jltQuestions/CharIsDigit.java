package jltQuestions;
import java.util.*;
public class CharIsDigit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char input=sc.next().charAt(1);

        if(Character.isDigit(input)){
            System.out.println("yess!!");
        }
        else{
            System.out.println("Noo");
        }
        sc.close();
    }
}
