// import java.util.Scanner;

// /**
//  * q5_Count_Vowel
//  */
// public class q5_Count_Vowel {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String a = sc.nextLine();
//     a = a.toLowerCase();
//     int count =0;
//     for(int i=0;i<a.length();i++){
//         if(a.charAt(i) == 'a' || a.charAt(i)== 'e' || a.charAt(i)=='o' || a.charAt(i)=='i' || a.charAt(i)== 'u'){
//             count++;
//         }

//     }System.out.println(count);
// }
    
// }






//  Consonent and Vowel both count

import java.util.Scanner;

/**
 * q5_Count_Vowel
 */
public class q5_Count_Vowel {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    a = a.toLowerCase();
    int consonent =0;
    int vowel=0;
    for(int i=0;i<a.length();i++){
        if(a.charAt(i) == 'a' || a.charAt(i)== 'e' || a.charAt(i)=='o' || a.charAt(i)=='i' || a.charAt(i)== 'u'){
            vowel++;
        }else{
            consonent++;
        }

    }System.out.println(consonent);
    System.out.println(vowel);
}
    
}