package basics;
import java.util.Scanner;


public class BasicCalculator {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n =1;
       do{
            char ch = scn.next().charAt(0);
        if(ch == '+' || ch =='-' || ch=='*'|| ch == '/'|| ch == '%'){
                 int n1 = scn.nextInt();
                 int n2 = scn.nextInt();
                 int ans=0;
                 switch(ch){
                     case '+' : ans=n1+n2;;break;
                     case '-' :ans=n1-n2; break;
                     case '*' : ans=n1*n2;break;
                     case '/' :ans=n1/n2; break;
                     case '%' : ans=n1%n2;;break;
                   
                }
                System.out.println(ans);
              }
              else if(ch == 'x' || ch == 'X'){
                  System.exit(0);
              }
              else{
                  System.out.println("Invalid operation.Try Again");
             }
         }while(n>0);
      
      
       
        scn.close();
    }
}
