import java.util.Scanner;

public class reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        long ss=0;
        long aa= reverse_Number(s,ss );
        System.out.println(aa);

    }
    public static long reverse_Number(long n,long reverse){
        if(n<1){
            return reverse;
        }
        long ld = n%10;
        reverse = reverse*10 +ld;
        return reverse_Number(n/10, reverse);
    }
}
