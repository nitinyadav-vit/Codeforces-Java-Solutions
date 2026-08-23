import java.util.Scanner;
 
 
public class Main {
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        
        int count=0;
        int p=240-k;
        int sum=0;
        
        for(int i=1;i<=n;i++){
            sum+=5*i;
            
            if(sum<=p){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
        
        
       
    }
}