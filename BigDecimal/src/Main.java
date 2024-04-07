import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        //Arrays.sort(s);
        BigDecimal []arr = new BigDecimal[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = new BigDecimal(s[i]);
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

//        9
//        -100
//        50
//        0
//        56.6
//        90
//        0.12
//        .12
//        02.34
//        000.000