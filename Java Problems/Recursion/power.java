import java.util.Scanner;

class power{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int aa =power(a,b);
        System.out.println(aa);

    }
    public static int power(int a , int b ){
        if(b == 0){
            return 1;
        }else if(b==1){
            return a;
        }return a*power(a,b-1);
    }
}