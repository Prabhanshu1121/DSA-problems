import java.util.Scanner;

public class sum_ofNumber_inString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
       int sum=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) >= 48 && a.charAt(i) <=57){
                sum = sum+ (int) a.charAt(i)-48; 
            }
        }System.out.println(sum);
    }
}
