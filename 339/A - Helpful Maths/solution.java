import java.util.Scanner;
import java.util.Arrays;
 
 
public class Main {
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
       
        String s= sc.next();
        
        String []numbers=s.split("\\+");
        Arrays.sort(numbers);
        String result=String.join("+", numbers);
        System.out.println(result);
        
        
        
        sc.close();
        
        
       
    }
}