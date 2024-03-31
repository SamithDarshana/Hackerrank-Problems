import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Pattern pattern = Pattern.compile("\\b(\\w+)(\\W\\1)+\\b", Pattern.CASE_INSENSITIVE);

        while (n>0){
            String str = sc.nextLine();
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()){
                str = str.replaceAll(matcher.group(), matcher.group(1));
            }
            System.out.println(str);
            n--;
        }
        sc.close();


        //boolean found = matcher.find();
        //System.out.println("found : " + found);
    }
}
