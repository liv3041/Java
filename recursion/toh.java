package recursion;

public class toh {
    public static void towerofhanoi(int n ,String src, String dest , String helper){
        if(n==0){
            return;
        }
        towerofhanoi(n-1,src, helper,dest);
        System.out.println("move "+n+"th disc from "+src+" to "+dest);
        towerofhanoi(n-1,helper, dest, src);
    }
    public static void main(String[] args) {
        int n=3;
        towerofhanoi(n, "src", "dest", "helper");
    }
    
}
