import java.util.Scanner;
 
 
public class Main {
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        String s= sc.next();
        
        char[] n= s.toCharArray(); // convert string to array
        int count =0;
        
        for(int i=0;i<n.length;i++){
            if(n[i]=='4' || n[i]=='7'){
                count+=1;
            }
        }
        if(count==4  || count ==7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
       
    }
}