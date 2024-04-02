import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        //System.out.println(testCases);
        while(testCases>0){
            String line = in.nextLine();
            boolean found = false;
            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher match = pattern.matcher(line);
            while(match.find()){
                System.out.println(match.group(2));
                found = true;
            }
            if(!found){
                System.out.println("None");
            }
            testCases--;
        }
        in.close();
    }
}