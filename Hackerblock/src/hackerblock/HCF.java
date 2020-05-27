package hackerblock;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
        
        System.out.println(findGCD(arr, n));
	}

	
	 public static int gcd(int a, int b) 
	    { 
	        if (a == 0) 
	            return b; 
	        return gcd(b % a, a); 
	    } 
	  
	    // Function to find gcd of array of 
	    // numbers 
	   public static int findGCD(int arr[], int n) 
	    { 
	        int result = arr[0]; 
	        for (int i = 1; i < n; i++){ 
	            result = gcd(arr[i], result); 
	  
	            if(result == 1) 
	            { 
	               return 1; 
	            } 
	        } 
	  
	        return result; 
	    } 
	
}
