import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        // write your code here  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int nod = (int)Math.log10(n)+1;
        
        k = k % nod;
        
        if (k<0){
            //k = k+nod
            k = k%nod*(-1);
        }
        System.out.println(k);
        
        int div = (int)Math.pow(10,k);
        
        int r = n%div;
        int mul = (int)Math.pow(10,nod-k);
        n = n/div;
        int ans = r * mul+n;
        System.out.println(ans);
       }
}
