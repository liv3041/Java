package recursion;

public class allindices {
    public static int[] allIndices(int[] arr, int si, int data, int count){
        if(si==arr.length){
            int[] base = new int[count];
            return base;
        }
        int[] indices = null;
        if(arr[si]==data){
            indices=allIndices(arr,si+1,data,count+1);
         }
         else{
             indices = allIndices(arr, si+1, data, count);
         }
         if(arr[si]==data){
             indices[count]=si;
         }
         return indices;
    }
    public static void main(String[] args) {
        int[] arr = {3,8,1,8,8,4};
        int[] ans = allIndices(arr, 0, 8, 0);
        for(int i =0;i<ans.length;i++){
        System.out.print(ans[i]+" "); 
          
        }
    }

}
