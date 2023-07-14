package recursion;


public class PDISkip {
    public static void pdiskip(int n){
        if(n==0)
          return;
          if(n%2!=0)
            System.out.println(n);
            pdiskip(n-1);
           if(n%2==0)
           System.out.println(n);

    }
    public static void main(String[] args) {
        pdiskip(5);
    }
    
}
