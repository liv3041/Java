package recursion;

public class factorial {
    public static int fact(int n){
        //Assuming the function works
        if(n==1)
           return 1;
        int fnm1 = fact(n-1);
        int fn = n*fnm1;
        return fn;
    }
    public static void main(String[] args) {
        int a = fact(4);
        System.out.println(a);
    }
}
