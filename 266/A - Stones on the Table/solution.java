import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int noOfStone = sc.nextInt();
        String s=sc.next();
        int ans=0;
    
        for(int i=1;i< noOfStone;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                ans++;
            }
        }
        
        
        
        System.out.println(ans);
        
        sc.close();
    }
}