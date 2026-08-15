import java.util.Scanner;
 
public class Main {
    public static void solve(int n) {
       
        int[] primeCount = new int[n + 1];
        for (int p = 2; p <= n; p++) {
            if (primeCount[p] == 0) {
               
                for (int i = 2 * p; i <= n; i += p) {
                    primeCount[i]++;
                }
            }
        }
        int almostPrimeTotal = 0;
        for (int i = 1; i <= n; i++) {
            if (primeCount[i] == 2) {
                almostPrimeTotal++;
            }
        }
        System.out.println(almostPrimeTotal);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            solve(n);
        }
        sc.close();
    }
}