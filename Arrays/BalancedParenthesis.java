
import java.util.*;
public class BalancedParenthesis
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.next();
	    
	    Stack s=new Stack();
	    for(int i=0;i<str.length();i++){
	       if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[' ){
	           s.push(str.charAt(i));
	       }
	       else{
	           if(str.charAt(i)== ')' && s.pop().equals('(') ){
	               if(i==str.length()-1){
	                   System.out.println("yess!!");
	               }
	               continue;
	           }
	            
	           else if(str.charAt(i)== '}' && s.pop().equals('{')){
	               if(i==str.length()-1){
	                   System.out.println("yess!!");
	               }
	               continue;
	           }
	           else if(str.charAt(i)== ']' && s.pop().equals('[')){
	               if(i==str.length()-1){
	                   System.out.println("yess!!");
	               }
	               continue;
	           }
	           else{
	               System.out.println("not balanced");
	           }
	       }
	    }
	}
}