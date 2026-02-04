import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // String a = "dabcadefg";
        // StringBuilder sc  = new StringBuilder();
        // int arr[] = new int[128];
        // System.out.println(a.charAt(0));
        // for(int i=0;i<a.length();i++){
        //     int asci =(int) a.charAt(i);
        //     if(arr[asci] ==0){
        //         arr[asci]++;
        //         sc.append(a.charAt(i));
        //     }
        // }
        // String ans= sc.toString();
        // System.out.println(ans);



        String a = "dabcadefg";
        System.out.println(a);

        a.chars().distinct().mapToObj(x->(char)x).forEach(System.out::print);
        System.out.println();





       

    }
    
}
