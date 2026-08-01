import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rowofOne=0;
        int colOfOne=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                int val=sc.nextInt();
                if(val==1){
                    rowofOne=i;
                    colOfOne=j;
                }
            }
        }
        
        int moves=Math.abs(rowofOne -3)+Math.abs(colOfOne -3);
        
        
        System.out.println(moves);
        sc.close();
    }
}