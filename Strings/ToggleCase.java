import java.io.*;
import java.util.*;

public class ToggleCase {	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

public static String toggleCase(String word)
  {
	   String res = "";
	   for(int i=0;i<str.length();i++){
		   char c  = str.charAt(i);
		   if(((int)c)<=90){
              //upper case letter
		      res += (char)(((int)c)+32);

		   }
		   else{
			   //small case letter
			   res += (char)(((int)c)-32);
		   }
	   }
	   return res;
   }
}
	
   
