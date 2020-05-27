package hackerblock;

import java.util.ArrayList;
import java.util.Scanner;

public class Rec_str2_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String ip=scan.nextLine();
		s2i(0,ip);
		
	}
       public static void s2i(int result,String inp) {
    	   
    	   if(inp.isEmpty()) {
    		   System.out.println(result);
    		   return;
    	   }
    	   
    	   char ch=inp.charAt(0);
    	   inp=inp.substring(1);
    	   s2i(10*result+ch-48,inp);
       }
}
