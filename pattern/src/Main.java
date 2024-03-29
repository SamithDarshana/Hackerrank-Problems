import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i=0; i<n; i++){
            String input = sc.nextLine();
            try{
                Pattern.compile(input);
                System.out.println("Valid");

            }catch(PatternSyntaxException ea){
                System.out.println("Invalid");
            }
        }
    }
}
