import java.util.Scanner;

public class capatilize_1st_andLast_Letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        a=a+" ";
        int c =0;
        String nstr ="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) == ' '){
                nstr = nstr +capatalize(a.substring(c, i))+" ";
                
                c=i+1;
            }
        }System.out.println(nstr);

    }
    public static String capatalize(String a){
        String str ="";
        for(int i=0;i<a.length();i++){
            if(i==0 || i==a.length()-1){
                str = str + Character.toUpperCase(a.charAt(i));
            }else{
                str = str + a.charAt(i);
            }
        }
        return str;
    }
}
