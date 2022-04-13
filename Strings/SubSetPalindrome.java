import java.io.*;
import java.util.*;

public class SubSetPalindrome {

	public static void solution(String str){
		//write your code here
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();

		for(int i=0;i<word.length();i++){
			for(int j=1;j<=word.length();j++){
				String subs = word.substring(i,j);
				StringBuilder b = new StringBuilder();
				for(int k=subs.length()-1;k>=0;k--){
                    b.append(subs.charAt(k));
				}
				if(b.equals(subs)){
					System.out.println(b);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}