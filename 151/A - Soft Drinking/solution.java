import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        int k =sc.nextInt();   
        int l =sc.nextInt();
        int c =sc.nextInt();
        int d =sc.nextInt();
        int p =sc.nextInt();
        int nl =sc.nextInt();
        int np =sc.nextInt();
        
        
        
        int TotaldrinkToast=(k*l)/nl;
        
        int TotallimeToast=(c*d);
        
        int TotalsaltToast=p/np;
        
        int minTost=Math.min(TotaldrinkToast,Math.min(TotallimeToast,TotalsaltToast));
        
        int result=minTost/n;
        
        
        
        System.out.println(result);
        
        sc.close();
    }
}