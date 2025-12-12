package jltQuestions;

public class Armstrong {
    // User function Template for Java
    //find cube
    //find sum of cubes
    static int Cube(int digit){
        return digit*digit*digit;
    }
    static boolean armstrongNumber(int n) {
        // code here
        int cubeSum=0;
        int temp=n;
        while(temp!=0){
            int digit=temp%10;
            int cube=Cube(digit);
            cubeSum+=cube;
            
            temp/=10;
        }
        
        if(cubeSum==n){
            return true;
        }
        
        return false;
    }
}

