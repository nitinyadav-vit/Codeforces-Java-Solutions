import java.util.Scanner;
 
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        
        long k=sc.nextLong();
        long n=sc.nextLong();
        long w=sc.nextLong();
        
        long totalcost=k*(w*(w+1)/2);
        long amountBorrow= totalcost-n;
        if(amountBorrow>0){
            System.out.println(amountBorrow);
        }else{
            System.out.println(0);
        }
        sc.close();
    }
}