package hackerblock;

import java.util.ArrayList;
import java.util.Scanner;

public class OddEven_Rule {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        
        for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		
        ArrayList list=new ArrayList();
        for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
	    int sum=0;
        for (int i = 0; i < list.size(); i++) {
			String value= (String) list.get(i);
			for (int j = 0; j < value.length(); j++) {
				sum=sum+(int)j;
			}
			System.out.println(sum);
		}
        
        
	}
}
