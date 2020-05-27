package hackerblock;

import java.util.ArrayList;
import java.util.Scanner;

public class Von {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        String n1=scan.nextLine();
        
        int n=Integer.parseInt(n1);
        String[] arr=new String[n];
        for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextLine();
		}
        for (int i = 0; i < arr.length; i++) {
			System.out.println(Integer.parseInt(arr[i],2));
		}
        
	}    
	}

