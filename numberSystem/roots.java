package numberSystem;
import java.util.*;
public class roots {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        double desc=Math.sqrt(b*b-4*a*c);

    
            double root1=-b+(desc/(2*a));
            double root2=-b-(desc/(2*a));
            
            System.out.println(root1+" "+root2);
        
    }
}
