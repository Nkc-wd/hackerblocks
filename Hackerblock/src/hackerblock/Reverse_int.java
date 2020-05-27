package hackerblock;
import java.util.*;
public class Reverse_int {

	public static void main(String[] args) {
		
         Scanner scan =new Scanner(System.in);
         int ip=scan.nextInt();
         
         int rev=0;
        while(ip>0) {
         int x=ip%10;
         rev=rev*10+x;
         ip/=10;
        }
        System.out.println(rev);
         
	}

}
