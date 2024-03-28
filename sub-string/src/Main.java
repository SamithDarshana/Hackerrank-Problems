import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> strArray = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int range = sc.nextInt();

        for (int i = 0; i < str.length()-(range-1); i++) {

            strArray.add(str.substring(i, i+range) );
            //System.out.println(str.substring(i, i+3));
        }

        Collections.sort(strArray);

        System.out.println(strArray.getFirst());
        System.out.println(strArray.getLast());

        for(String s: strArray){
            System.out.println(s);
        }

        //System.out.println(strArray);
    }
}