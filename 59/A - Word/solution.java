import java.util.Scanner;
 
public class Main {
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
       
        String s1 =sc.next();
        int upper=0;
        int lower=0;
        
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            
            if(Character.isUpperCase(ch)){
                upper++;
            }else{
                lower++;
            }
        }
        if(upper>lower){
            System.out.println(s1.toUpperCase());
        }else{
            System.out.println(s1.toLowerCase());
        }
        
        
        
        sc.close();
        
    }
    
    
}