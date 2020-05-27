package hackerblock;

import java.util.*;

public class WithHash {

	public static void main(String[] args) {
		
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        
        HashMap<Character,Integer> map=new HashMap<>();
         for (int i = 0; i < input.length(); i++) {
        	 //taking first char
			 char cc=input.charAt(i);
			 
			 if(map.containsKey(cc)) { //check that if first char still contains in map 
				 int oldvalue=map.get(cc); // if yes then
				 int newvalue=oldvalue+1;
				 map.put(cc, newvalue);
			 }else {
				 map.put(cc, 1); // if no then
			 }
		}
         
         char maxchar='\0';
         int max=0;
         //obtaining both 
         Set<Map.Entry<Character,Integer>> entries= map.entrySet();
         //Enhanced loop to get keys and values
         for (Map.Entry<Character,Integer> entry:entries) {
        	 
        	 if(entry.getValue()>max) {
        		 //increment key value
        		 max=entry.getValue();
        		 //get that character
        		 maxchar=entry.getKey();
        	 }
		}
           //print that character
         System.out.println(maxchar);;
		
	}

}
