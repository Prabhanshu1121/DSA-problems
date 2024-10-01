import java.util.Scanner;

public class q4_Toggle_each_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String aa = new String("");
        for(int i =0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                aa = aa +Character.toUpperCase( s.charAt(i));
            }else{
                aa = aa + Character.toLowerCase(s.charAt(i));
            }
        }System.out.println(aa);
    }
}
