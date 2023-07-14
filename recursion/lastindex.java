package recursion;

public class lastindex {
    public static int LI(int[] arr,int si,int data){
         if(si==arr.length){
             return si;
         }
        int index = LI(arr,si+1,data);
        if(index==-1){
            if(arr[si]==data){
                return si;
            }
            else{
                return -1;
            }
        }
        else{
            return index;
        }
    }
    public static void main(String[] args) {
        int[] arr={3,8,1,8,8,7};
        System.out.println(LI(arr,0,8));
    }
}
