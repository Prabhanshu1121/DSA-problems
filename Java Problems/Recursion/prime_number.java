import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();  
          boolean aa = prime(a,2);     
          System.out.println(aa);   
    }
    public static boolean prime(int a,int i){
        if(a==3 || a==2 || a==i+1){
            return true;
        }else if (a%i==0|| a <2){
            return false;
        }return prime(a,i+1);
    }
    
}
