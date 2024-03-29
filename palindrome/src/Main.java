import java.util.Locale;
import java.util.Scanner;

//A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
//Given a string , print Yes if it is a palindrome, print No otherwise.
//
//Constraints
//
//will consist at most  lower case english letters.
//Sample Input
//
//madam
//Sample Output
//
//Yes
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str.toLowerCase(Locale.ROOT);
        StringBuilder reverse = new StringBuilder(str).reverse();
        String rev = reverse.toString();

        if(str.equals(rev)){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}