import java.util.*;

class q1{
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if(a == 'a'||a=='e'||a=='i'||a=='o'||a=='u'){
            System.out.println("vowel");
        }else{
                 System.out.println("conso");
        }

    }
}