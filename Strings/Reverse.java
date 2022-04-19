import java.util.*;
public class Reverse {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  String str = sc.next();
  StringBuilder res = reverseString(str);
  System.out.println(res);

    }

    public static StringBuilder reverseString(String input1) {
        String[] ss = input1.split(" ");
        StringBuilder res = new StringBuilder();
        for(String x : ss){
            StringBuilder sb = new StringBuilder(x);
            sb.reverse();
            sb.setCharAt(0,sb.substring(0,1).toUpperCase().charAt(0));
            sb.setCharAt(sb.length()-1,sb.substring(sb.length()-1).toLowerCase().charAt(0));
            res.append(sb);
        }

        return res;

    }
}
