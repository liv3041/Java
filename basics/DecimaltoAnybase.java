package basics;
import java.util.Scanner;
public class DecimaltoAnybase {
    public static int decimaltoanybase(int snum , int db){
        int multiplier = 1;
        int ans= 0;
        while(snum!=0){
            int rem = snum%db;
            ans=ans+(rem*multiplier);
            multiplier = multiplier*10;
            snum=snum/db;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int snum = scn.nextInt();
        int db = scn.nextInt();
        int n = decimaltoanybase(snum,db);
        System.out.println(n);
        scn.close();
    }
}
