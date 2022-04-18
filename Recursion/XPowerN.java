public class XPowerN {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = power(x,n);
        System.out.println(ans);
        
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;

        }
        return x*power(x,n-1);
    }   
}
