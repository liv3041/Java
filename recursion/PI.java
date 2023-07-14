package recursion;

 public class PI{
     public static void pi(int n){
         if(n==0){
             return;
         }
         pi(n-1);
         System.out.println(n);
     }
     public static void main(String[] args) {
         pi(5);
     }
 }