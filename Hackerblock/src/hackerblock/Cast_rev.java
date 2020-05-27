package hackerblock;

import java.util.Scanner;

public class Cast_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
       String ip=scan.nextLine();
     
         
         
         for (int i = ip.length()-1; i>=0 ; i--) {
        	 System.out.print(ip.charAt(i)+" ");

		}
	}

}
