package basics;
import java.util.Scanner;
public class addition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int sum = a+b;
        System.out.println(sum);
        scn.close();
    }
}
