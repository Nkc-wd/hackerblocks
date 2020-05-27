package hackerblock;

import java.util.*;
public class PalindromeDetector
{
public static void main(String args[]) {


Scanner in =new Scanner(System.in);
boolean palin;
String input;
System.out.println("Please enter a string to test for palindrome or type QUIT to exit:");


while(!"quit".equals(input=in.nextLine().toLowerCase())) {
	palin=isPalindrome(input,0,input.length()-1);
	if(palin)
	System.out.println("The input is a palindrome.");
	else
	System.out.println("The input is not a palindrome.");


	
}

System.out.println("End program");


}
public static boolean isPalindrome(String str,int low, int high)
{
if(high <= low)
return true;
if(Character.isDigit(str.charAt (low))||(Character.isLetter(str.charAt (low)))
&&(Character.isDigit((str.charAt (high)))||(Character.isLetter(Character.toUpperCase(str.charAt (high))))))
if( Character.toUpperCase(str.charAt (low))==Character.toUpperCase(str.charAt (high)))
return isPalindrome(str,low+1,high-1);
else return false;
else
{
if(Character.isDigit(Character.toUpperCase(str.charAt (low)))||(Character.isLetter(Character.toUpperCase(str.charAt (low)))))
return isPalindrome(str,low,high-1);
else
return isPalindrome(str,low+1,high);
}


}
}