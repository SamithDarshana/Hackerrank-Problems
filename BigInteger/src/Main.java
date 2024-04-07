import java.math.BigInteger;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));
    }
}