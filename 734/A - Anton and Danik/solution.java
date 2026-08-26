import java.util.Scanner;
public class main{
    public static void main(String []args){
        Scanner sc =new Scanner (System.in);
        
        int n=sc.nextInt();
        
        String s=sc.next();
        
        int antoncount=0;
        int dainikcount=0;
        
        
        for(int i=0;i<n;i++){
            if (s.charAt(i)=='A'){
                antoncount++;
            }else if(s.charAt(i)=='D'){
                dainikcount++;
            }
        }
        
        if(antoncount>dainikcount){
            System.out.println("Anton");
        }else if(dainikcount>antoncount){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
        sc.close();
    }
}