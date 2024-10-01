import java.util.Scanner;

// public class q7_String_inReverse_Order {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String a = sc.nextLine();
//         String aa =new String("");
//         for(int i=0;i<a.length();i++){
//             aa = a.charAt(i) + aa;
//         } System.out.println(aa);
//     }
    
// }



// ** Reverse only word that present inside the String


public class q7_String_inReverse_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
       a= a+" ";
        int c=0;
        String fs = new String("");
        for(int i =0;i<a.length();i++){
            if(a.charAt(i) == ' '){
                 fs = fs +reverse(a.substring(c, i))+" ";
                 c=i+1;
            }
        }System.out.println(fs);
        
    }
    public static String reverse(String a){
        String aa =new String("");
        for(int i=0;i<a.length();i++){
            aa = a.charAt(i) + aa;
        }
        return aa;

    }
    
}

