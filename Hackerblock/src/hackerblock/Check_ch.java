package hackerblock;

import java.util.Scanner;

public class Check_ch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		char ch = scan.next().charAt(0); 
		
		if(Character.isLowerCase(ch)) {
			System.out.println("L");	
		}
		else if(Character.isUpperCase(ch)) {
			System.out.println("U");	
		}
		else {
			System.out.println("I");	
		}
	}

}
