import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int noOfDigits = (int)Math.log10(n)+1;
        while(n!=0){
            int rem = n%noOfDigits-1;
            n = n/noOfDigits-1;
            System.out.println(n);
            n = rem;
        }
    }
}
