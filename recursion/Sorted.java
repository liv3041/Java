package recursion;

public class Sorted {
    public static Boolean isSorted(int[] arr,int si){
        if(arr.length-1==si){
            return true;
        }
        if(arr[si]>arr[si+1]){
            return false;
        }
        else{
            Boolean restAns = isSorted(arr,si+1);
            return restAns;
        }
    }
    public static void main(String[] args) {
      //  int[] arr ={3,8,6,1,9,7};
      int[] arr ={1,2,3,4,5};
        System.out.println(isSorted(arr,0));
    }
    
}
