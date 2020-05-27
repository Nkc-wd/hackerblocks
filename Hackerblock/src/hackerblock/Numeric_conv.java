package hackerblock;

import java.util.Scanner;

public class Numeric_conv {

	  public static void main(String args[]) {
	       Scanner scan=new Scanner(System.in);
            String ip=scan.nextLine();
            int inp=scan.nextInt();
            
            //for binary input use ip(String)
            //for hex input use ip(String)
            
            // for decimal input use inp(int)
            // for octal input use inp(int)
            

	    }
	  
	  // binaries
	  public static int binary2deci(String input) {
		  return Integer.parseInt(input,2);
	  }
	  public static void binary2oct(String input) {
		  int deci= binary2deci(input);
		  System.out.println(Integer.toOctalString(deci));
	  }
	  public static void binary2hex(String input) {
		 int deci= binary2deci(input);
		  System.out.println(Integer.toHexString(deci));
	  }
	  
	  // decimals
	  public static void deci2binary(int input) {
			  System.out.println(Integer.toBinaryString(input));
		  }
	  public static void deci2octal(int input) {
		  System.out.println(Integer.toOctalString(input));
	  }
	  public static void deci2hex(int input) {
		  System.out.println(Integer.toHexString(input));
	  }
	  
	  // octals
	  public static void octal2binary(int input) {  
		  System.out.println(Integer.toBinaryString(input));
	  }
	  public static void octal2deci(int input) { 
		     String o2d= String.valueOf(input);
		     System.out.println(Integer.parseInt(o2d,8));	   
	  }
	  public static void octal2hex(int input) {  
		  System.out.println(Integer.toHexString(input));
	  }
	  
	  
	  // hexas
	  public static void hex2binary(String input) { 
		    int h2d=Integer.parseInt(input,16);
		  System.out.println(Integer.toBinaryString(h2d));
	  }
	  public static void hex2deci(String input) { 
		  System.out.println(Integer.parseInt(input,16));
	  }
	  public static void hex2octal(String input) { 
		    int h2d=Integer.parseInt(input,16);
		  System.out.println(Integer.toOctalString(h2d));
	  }
	  
}
