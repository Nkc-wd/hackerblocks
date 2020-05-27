package hackerblock;

import java.util.Scanner;

public class TocheckArray_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
			arr[i]=scan.nextInt();
		}
        System.out.println(isSorted(arr));
   	 
	}
         
        public static boolean isSorted(int[] arr) {
        	int prev = arr[0];
        	for (int i = 1; i < arr.length; i++) {
        		if (arr[i] < prev) {
        			return false;
                }
        		prev = arr[i];
        	}
            return true;
        }

}
