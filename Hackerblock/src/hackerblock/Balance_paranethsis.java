package hackerblock;

import java.util.Scanner;

public class Balance_paranethsis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner s = new Scanner(System.in);
	        String a=s.nextLine();
	        int n = a.length();       
	        if(n%2!=0) {
	        	System.out.println("No");
	        
	        }
	        else {
	        	pera(a);
	        }
		}
	        
	        public static void pera(String a) {
	        	
	         	  int mid=a.length()/2;              
				int count=0;
				
				for (int i = 0; i <mid; i++) {
					if(a.charAt(i)!=(a.charAt(a.length()-1-i))) {
						count+=1;
					}
				}
					if(count==mid) {
						System.out.println("Yes");
					}
					else {
						System.out.println("No");
					}
				}

	}


