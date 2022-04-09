import java.util.Scanner;

public class SmithNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(temp!=0){
           int rem = temp%10;
           temp = temp/10;
           sum+=rem;
        }

        int c=2;
        int primeSum = 0;
        while(n>1)
           {
            if(n%c==0){
               primeSum=primeSum+c;
               n/=c;
        }
        else 
        {
            c++;
        };
    }

        if(primeSum==sum){
            System.out.println(sum);
        }
        else{
            System.out.println(-1);
        }

    }
}
