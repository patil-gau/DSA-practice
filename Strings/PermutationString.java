import java.util.*;

public class PermutationString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int n = str.length();
        int fact = fact(n);

        for(int i=0;i<fact;i++){
            StringBuilder cpstr = new StringBuilder(str);
            int temp = i;
            for(int j=n;j>=1;j--){
                 int q = temp/j;
                 int r = temp%j;

                 //remove remainder index
                 System.out.print(cpstr.charAt(r));
                 cpstr.deleteCharAt(r);
            }
            System.out.println("");
        }


    }   

    public static int fact(int n){
        int ans = 1;
        for(int i=2;i<=n;i++){
            ans*=i;
        }
        return ans;
    }
}
