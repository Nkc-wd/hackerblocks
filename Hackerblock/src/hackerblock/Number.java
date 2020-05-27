package hackerblock;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        int ip=scan.nextInt();
        deci2octal(ip);
	}


	public static void deci2octal(int deci){
		System.out.println(Integer.toOctalString(deci));
	}
}
