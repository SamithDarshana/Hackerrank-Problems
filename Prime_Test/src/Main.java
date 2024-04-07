import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String n = bufferedReader.readLine();
            BigInteger num = new BigInteger(n);
            System.out.println(num.isProbablePrime(1)? "prime" : "not prime");
//            if(num<=1){
//                System.out.println("not prime");
//                return;
//            }
//            int divider = 2;
//            while (divider<num){
//               if( num%divider==0){
//                   System.out.println("not prime");
//                   return;
//               }
//               divider++;
//            }
//            System.out.println("prime");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}