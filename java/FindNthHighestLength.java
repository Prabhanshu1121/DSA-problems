import java.util.HashMap;
import java.util.*;

public class FindNthHighestLength {

    public static void main(String[] args) {
        String s ="I am learning Stream API java";
        s.chars().stream()


        int n=0;
        System.out.println(s);
        System.out.println(findNthString(s,n));
    }
    private static String findNthString(String s,int n){
        TreeMap<Integer,String> a = new TreeMap<>(Comparator.reverseOrder());
        String ss[] = s.split(" ");
        for(int i=0;i<ss.length;i++){
            a.put(ss[i].length(), ss[i]);
                     
        }
        Iterator it = a.values().iterator();
        // System.out.println(it.next());
        if(n<=0) return " ";
        for(int i=0;i<n-1;i++){
           it.next();
        }
        return (String) it.next();
    }
}