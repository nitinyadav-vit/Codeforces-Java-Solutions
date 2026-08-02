import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int limakWeigh = sc.nextInt();
        
        int bobWeigh = sc.nextInt();
        
        int year=0;
        
        while(limakWeigh<=bobWeigh){
            limakWeigh=limakWeigh*3;
            bobWeigh=bobWeigh*2;
            year=year+1;
            
            
        }
        
        System.out.println(year);
        
        sc.close();
    }
}