package hackerblock;

import java.util.Scanner;

public class Sumof_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
       int n1=scan.nextInt();
       int[] arr1=new int[n1];
       for (int i = 0; i < arr1.length; i++) {
		  arr1[i]=scan.nextInt();
	}
      
       int n2=scan.nextInt();
       int[] arr2=new int[n2];
       for (int i = 0; i < arr2.length; i++) {
		   arr2[i]=scan.nextInt();
	}
       
       int n=Math.max(n1, n2);
       int[] res=new int[n];
       int prev =0;
       for (int i = 0; i < n; i++) {
    	   if(n1>n2) {
    		   for (int j = 0; j < res.length; j++) {
				res[j]=arr1[j+1]+arr2[j];
			}
    	   }
    	   else if (n2>n1){
    		 for (int j = 0; j < res.length; j++) {
 				res[j]=arr1[j]+arr2[j+1];
 			}
    	   }
    		 else {
    			 for (int j = 0; j < res.length; j++) {
    	 				res[j]=arr1[j]+arr2[j];
    	 			}
    		 }
    			
    		   }
       for(int val:res) {
    	   System.out.print(val+", ");
       }
       System.out.println("END");
	}       
	}

