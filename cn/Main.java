package cn;

 import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String input=sc.next();
	    int count=0;
	    String ans="";
	    for(char ch :  input.toCharArray()){
	        if(ch=='1'){
	            count++;
	             ans+=ch;
	             if(count==5){
	                 count=0;
	                 ans+=0;
	             }
	        }
	        else{
	            count=0;
	            ans+=ch;
	        }
	       
	        
	    }
	    System.out.println(ans);
	}
} 