
import java.util.Scanner;

/**
 * Prime
 */
public class Prime {

    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        if(n == 1) {
            System.out.println("NO this is not a prime number");
            return;
        }
        
        for(int i=2;i<n;i++) {
            if(n % i == 0) {
                System.out.println("NO this is not a prime number");
                return;
            }
        }
        
        System.out.println("YES ! This is a prime number");
    }
}