package hackerblock;

import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist_palindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		LinkedList list=new LinkedList();
		for (int i = 0; i <n; i++) {
			list.add(scan.nextInt());	
		}
		LinkedList newlist=new LinkedList();
		for (int i = n-1; i>=0 ; i--) {
			newlist.add(list.get(i));
	
		}
		
		if(newlist.equals(list)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
