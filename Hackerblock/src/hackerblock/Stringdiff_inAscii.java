package hackerblock;

import java.util.Scanner;

public class Stringdiff_inAscii {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
        String ip=scan.nextLine();
        int n=ip.length();
        
        String res="";
        
        
        for (int i = 0; i <n; i++) { 
        	 
        	if(i!=n-1) {
        	    res+=ip.charAt(i);       	   
        		res+=String.valueOf(ip.charAt(i+1)-ip.charAt(i));
        		
        	}
        	else {
        		res+=ip.charAt(i);
        	}
       
	}
        System.out.print(res);	
	
	}}
