package hackerblock;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=0,flag=0;
        m=n/2;      
        if(n==0||n==1){  
         System.out.println("Not Prime");      
        }else{  
         for(int i=2;i<=m;i++){      
          if(n%i==0){      
           System.out.println("Not Prime");      
           flag=1;      
           break;      
          }      
         }      
         if(flag==0)  { System.out.println("Prime"); }  
        }//end of else
        }
       
	}


