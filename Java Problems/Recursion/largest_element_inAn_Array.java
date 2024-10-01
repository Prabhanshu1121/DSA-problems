import java.util.Scanner;

public class largest_element_inAn_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {44,87,9,7};
        int i=arr[0];
        int l=arr.length-1;
        int ld = largestArray(arr, i, l);
        System.out.println(ld);

    }
    public static int largestArray(int[] arr,int i,int l){
        if(l==0){
            return i;
        }if(i < arr[l]){
            i=arr[l];
        }return largestArray(arr, i, l-1);
    
    }
}
