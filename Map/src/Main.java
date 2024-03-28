import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String a = "CATAK";
        String b = "TAAKC";

        a = a.toLowerCase();
        b = b.toLowerCase();

        Map<Character, Integer> mapA = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char letter = a.charAt(i);
            Integer prev = mapA.putIfAbsent(letter, 1);
            System.out.println(i + " " + prev);
            if (prev != null) {
                mapA.replace(letter, prev + 1);
            }
        }

        Map<Character, Integer> mapB = new HashMap<>();
        for (int i = 0; i < b.length(); i++) {
            char letter = b.charAt(i);
            Integer prev = mapB.putIfAbsent(letter, 1);
            if (prev != null) {
                mapB.replace(letter, prev + 1);
            }
        }
        System.out.println(mapA);
        //return mapA.equals(mapB);

    }
}