package basics;


public class FtoCtable {
    public static void main(String[] args) {
       
        int fmin = 0;
        int fmax = 300;
        int fcurrent = fmin;
        int fstep = 20;
        while(fcurrent<=fmax){
            System.out.print(fcurrent);
            int celsius = (fcurrent-32)*5/9;
            fcurrent = fcurrent+fstep;
            System.out.print("\t" + celsius);
            System.out.println();
        
    }

    }
    
}
