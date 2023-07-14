package recursion;

public class power {
    public static int pow (int x, int n){
        if(n==0)
          return 1;
        int pnm1=pow(x,n-1);
        int pn=x*pnm1;
        return pn;
    }
    public static void main(String[] args) {
        int a=pow(2,5);
        System.out.println(a);
    }
}
