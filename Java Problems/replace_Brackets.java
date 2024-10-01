import java.util.Scanner;

public class replace_Brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a =sc.nextLine();
        a= a.replaceAll("[(){}]", "");
        System.out.println(a);
    }
}
