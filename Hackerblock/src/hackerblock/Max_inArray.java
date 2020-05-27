package hackerblock;

import java.util.Scanner;

public class Max_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
			if(max>arr[i]) {
				arr[i]=max;
			}
			else {
				max=arr[i];
			}
			
		}
        System.out.println(max);
	}

}
