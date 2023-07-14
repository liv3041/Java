package pattern;
import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = 0;
		while(i<n){
		int k = n-i-1;
		    while(k>0){
		        System.out.print("\t");
		        k--;
		    }
		    int j=i;
		    while(j<n){
		        System.out.print("*\t");
		        j++;
		    }
		    i++;
		    System.out.println();
		}
        scn.close();
        
    }
    
}
