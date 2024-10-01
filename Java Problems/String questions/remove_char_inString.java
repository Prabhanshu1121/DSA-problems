import java.util.Scanner;

public class remove_char_inString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String aa = "";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z' || a.charAt(i) >= 'a' && a.charAt(i)<= 'z' ){
                aa = aa+a.charAt(i); 
            }
        }System.out.println(aa);

    }
}
