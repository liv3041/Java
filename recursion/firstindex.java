package recursion;

public class firstindex {
    public static int FI(int [] arr, int si,int data){
        if(si==arr.length){
            return -1;
        }
        if(arr[si]==data){
            return si;
        }
        else{
            int restAns = FI(arr,si+1,data);
            return restAns;
        }
    }
    public static void main(String[] args) {
        int[] arr ={3,8,6,1,9,7};
        System.out.println(FI(arr,0,1));
    }
}
