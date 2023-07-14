package recursion;

public class bubblesort {
    public static void bubble_sort(int[] arr,int si,int li){
        if(li==0){
            return;
        }
        if(si==li){
            bubble_sort(arr,0,li-1);
            return;
        }
        if(arr[si]>arr[si+1]){
            int temp = arr[si+1];
            arr[si]=arr[si+1];
            arr[si+1]=temp;
        }
        bubble_sort(arr,si+1,li);
     }

    public static void display(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
     
        int[]arr ={50,40,30,20,10};
       bubble_sort(arr, 0, arr.length-1);
        display(arr);
       
    }
}
