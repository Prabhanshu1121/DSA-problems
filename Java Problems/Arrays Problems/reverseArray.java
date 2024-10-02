import java.util.*;
class reverseArray{
    public static void main(String[] args) {
        int[] arr ={2,3,5,3,2,1};
        int arr1[] = reverseArray(arr);
        System.out.println(Arrays.toString(arr1));
        
    }
    public static int[] reverseArray( int[] arr){
        int a=arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[a];
            arr[a] = arr[i];
            arr[i] = temp;
            a--;
        }
        return arr;
    }
}