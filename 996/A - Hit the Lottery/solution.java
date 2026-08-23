import java.util.Scanner;
public class Main{
    public static void main(String []args){
    
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int bills=0;
        int [] denominations={100,20,10,5,1};
        for(int d:denominations){
            bills+=n/d;
            n%=d;
            
        }
        System.out.println(bills);
    }
    
}