package hackerblock;

import java.util.Arrays;
import java.util.Scanner;

public class Tofindmaxfrq_inString {

	public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         String S=scan.nextLine();
          int[] freq= new int[S.length()];
          char maxChar=S.charAt(0);
          
          char[] string=S.toCharArray();
            
          //Count each word in given string and store in array freq  
          for(int i = 0; i < string.length; i++) {  
              freq[i] = 1;  
              for(int j = i+1; j < string.length; j++) {  
                  if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {  
                      freq[i]++;  
                        
                      //Set string[j] to 0 to avoid printing visited character  
                      string[j] = '0';  
                  }  
              }  
          }  
            
          //Determine maximum occurring characters  
          int max = freq[0];  
          for(int i = 0; i <freq.length; i++) {  
              //If max is less than frequency of a character   
              //then, store frequency in max and corresponding character in maxChar  
              if(max < freq[i]) {  
                  max = freq[i];  
                  maxChar = string[i];  
              }  
          }   
          System.out.println( maxChar);  	
		}
	}

