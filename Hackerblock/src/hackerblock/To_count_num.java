package hackerblock;

import java.util.Scanner;

public class To_count_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        String in=scan.nextLine();
        char ch = scan.next().charAt(0); 
        int count=0;
        for (int i = 0; i < in.length(); i++) {
        	   if(in.charAt(i)==ch) {
        		   count++;
        	   }
			
		}
        System.out.println(count);
	}

}
