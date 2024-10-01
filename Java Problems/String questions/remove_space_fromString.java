import java.util.Scanner;

public class remove_space_fromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a =sc.nextLine();
        String aa = new String("");
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)== 32){
                continue;
            }else{
                aa = aa+a.charAt(i);
            }
        }
        System.out.println(aa);
    }
}
