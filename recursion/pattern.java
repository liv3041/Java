package recursion;

public class pattern {
    public static void pat(int n, int i,int j){
      if(i>n)
        return;
      if(j>i){
          System.out.println();
          pat(n,i+1,1);
          return;
      }
      System.out.print("*");
      pat(n, i, j+1);
    }
    public static void main(String[] args) {
        pat(5, 1, 1);
    }
}
