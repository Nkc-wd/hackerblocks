package hackerblock;

import java.util.*;
public class Stopafter_neg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       ArrayList<Integer> list=new ArrayList<>();
       
       int no=scan.nextInt();
       list.add(no);
       while(no>=0) {
    	   no=scan.nextInt();
    	   if(no>0) {
    	   list.add(no);
       }
       }
       
      for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}
	}

}
