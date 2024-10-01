import java.util.Scanner;

public class q6_String_Palindrome {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int j = s.length()-1;
        for(int i =0;i<s.length()/2 ; i++){
            if(s.charAt(i) != s.charAt(j)){
                System.out.println("Not palindrome");
                break;
            }else if (i == s.length()/2-1){
                System.out.println("Palindrome");
            } 
            j--;
        }
    }
}
