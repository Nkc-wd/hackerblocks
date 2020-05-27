package hackerblock;

import java.util.Scanner;

public class Degreecon_FC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        int first=scan.nextInt();
        int last=scan.nextInt();
        int increment=scan.nextInt();

        
        for (int i =first; i <=last; i+=increment) {
        	int centi=(i-32)*5/9;
        	System.out.println(i+" "+centi);
		}
        
	}

}
