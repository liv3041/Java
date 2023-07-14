package basics;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        
    
    Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = scn.nextInt();
        int cnt=1;
        int flag=0;
        for(int i = 1;i<=n;i++){
            if(i%cnt==0){
                flag++;

                cnt++;
            }
        
       

    }
}
    
//        scn.close();
}

