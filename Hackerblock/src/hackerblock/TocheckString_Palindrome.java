package hackerblock;

import java.util.Scanner;

public class TocheckString_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a, b = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        a = s.nextLine();
        String check=a.toLowerCase();
        int n = check.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + check.charAt(i);
        }
        
        if(check.equals(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }	 
		

	}

}
