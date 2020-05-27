package hackerblock;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();
		System.out.println(lcm(n1,n2));
		
	}
	
	 public static int gcd(int a, int b) 
	    { 
	    if (a == 0) 
	        return b;  
	    return gcd(b % a, a);  
	    } 
	      
	    // method to return LCM of two numbers 
	 public  static int lcm(int a, int b) 
	    { 
	        return (a*b)/gcd(a, b); 
	    } 

}
