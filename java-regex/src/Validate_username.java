import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate_username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfEntries = Integer.parseInt(sc.nextLine());
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
        Pattern pattern = Pattern.compile(regex);
        while (numOfEntries > 0){
            String input = sc.nextLine();
            Matcher m = pattern.matcher(input);
            if(m.find()){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
            numOfEntries--;
        }
    }
}
