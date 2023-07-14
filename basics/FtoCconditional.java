package basics;
import java.util.Scanner;
public class FtoCconditional {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int fmin = scn.nextInt();
        int fmax = scn.nextInt();
        int fstep = scn.nextInt();
        int fcurrent = fmin;
        while(fcurrent<=fmax){
            System.out.print(fcurrent);
            int celsius = (fcurrent-32)*5/9;
            fcurrent = fcurrent+fstep;
            System.out.print("\t" + celsius);
            System.out.println();
        }
        scn.close();
    }
}
