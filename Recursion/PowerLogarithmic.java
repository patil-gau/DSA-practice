public class PowerLogarithmic {
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
       if(n%2==0){
           return power(x,n/2) * power(x,n/2);
       }  
      else{
          return power(x,n/2) * power(x,n/2) * x;
      } 
        
    }

}
