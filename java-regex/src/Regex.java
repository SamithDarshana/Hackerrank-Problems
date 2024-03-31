import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(\\d|\\d{2}|1\\d{2}|2[0-4]\\d|25[0-5])$");
        Matcher matcher = pattern.matcher("225");

        boolean found = matcher.find();
        System.out.println("found : " + found);
    }
}

//  regex syntax
//  [abc]       sigle character of: a, b,
//  [a-z]       single character in range: a to z
//  a|b         match either a or b
//  \d          a digit: [0-9]
//  \w          word character: [a-z, A-Z, 0-9]
//  .           any single character
//  a{3}        exactly 3 of a: aaa
//  a{3,}       3 or more of a
//  a{2,4}      between 2 or 4 of a: aa, aaa, aaaa
//  ^           beginning of a line
//  $           end of a line
//  *           match zero or more occurance
//  +           match one or more occurance
//  ?           match zero or one occurance