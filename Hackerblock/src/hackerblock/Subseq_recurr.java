package hackerblock;

import java.util.Scanner;

public class Subseq_recurr {

	public static void main(String[] args) {
		// TODO Auto-gene
		Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
         subsequence("",str);
		
	}

	
	public static void subsequence(String process,String unprocess) {
		
		if(unprocess.isEmpty()) {
		     System.out.print(process+" ");
		     return;
		}
		
		
		char ch=unprocess.charAt(0);
		unprocess=unprocess.substring(1);
		subsequence(process,unprocess);
		subsequence(process+ch,unprocess);
		
		
		
		
		
	}
}
