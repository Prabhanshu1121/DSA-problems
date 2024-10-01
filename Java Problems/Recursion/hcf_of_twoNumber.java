import java.util.Scanner;

/**
 * hcf_of_twoNumber
 */
public class hcf_of_twoNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i=2;
        int ans=1;
        int aa=hcf(a, b, i, ans);
        System.err.println(aa);

    }
    public static int hcf(int a , int b,int i,int ans){
        if(a==0 || b==0){
            return 0;
        }
        else if () {
            return 1;
        }if( a%i==0 && b%i==0){
            ans = ans*i;
            a=a/i;
            b=b/i;
        }
        return hcf(a, b, i+1, ans);



    }
}