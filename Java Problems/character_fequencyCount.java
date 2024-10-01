import java.util.Scanner;

public class character_fequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a =sc.nextLine();
        while(a.length()>0){
            int count=0;
            String f =Character.toString(a.charAt(0));
            count = count(a);
            a= a.replaceAll(f, "");
            System.out.print(f+" : ");
            System.out.println(count);

        } 
       
    }
    public static int count(String a ){
        int j=0;
        int count=1;
        for(int i=1;i<a.length();i++){
            if(a.charAt(j) == a.charAt(i)){
                count++;
            }
        }
        return count;

    }
}
