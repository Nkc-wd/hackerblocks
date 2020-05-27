package hackerblock;

import java.util.Scanner; // Scanner class package import

public class NestedLoop {

	public static void main(String[] args) {
		
   Scanner scnr=new Scanner(System.in); // Scanner class
   int userNum; // All variables
   int i;
   int j;
   userNum=scnr.nextInt(); // You take here input
   for ( i = 0; i <= userNum; i++) {
	    for ( j = 0; j < i; j++) { // See here that j loop only iterate over < i
	        System.out.print(" ");// print white space 
	    }
	    System.out.println(i);// then will print integer
	}
	}
}
