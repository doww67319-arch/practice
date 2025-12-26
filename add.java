package basics;
import java.util.*;
public class add {

	public static void main(String[] args) {
	   Scanner re = new Scanner(System.in);
	   System.out.println("enter your String:");
	   String chr = re.nextLine();
	   String reverse="";
	   String Original= chr;
	   for(int i=chr.length()-1;i>=0;i--) {
		   reverse=reverse+chr.charAt(i);
	   }
	   System.out.println("The Reverse Of a String:"+reverse);
	   
	   if(Original.equals(reverse)) {
		   System.out.println("The String is palindrome");
		   }
		   else {
			   System.out.println("String is Not Plindrome");  
	     }
	   }
	}
    	  
       
        

	
