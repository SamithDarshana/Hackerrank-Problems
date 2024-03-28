import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();

        int lengthA = A.length();
        int lengthB = B.length();

        int sum = lengthA + lengthB;

        char letterA = A.charAt(0);
        char letterB = B.charAt(0);
        System.out.println(sum);

        int length = 0;
        if(lengthA > lengthB){
            length = B.length();
        }else{
            length = A.length();
        }

        for(int i=0; i<length; i++){
            if(A.charAt(i) == B.charAt(i)){
                if(i == A.length()-1){
                    System.out.println("No");
                }
                continue;
            }
            else{
                if(letterA > letterB){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }

        }


        String capiA = Character.toUpperCase(A.charAt(0)) + A.substring(1);
        String capiB = Character.toUpperCase(B.charAt(0)) + B.substring(1);
        System.out.println(capiA + " " + capiB);
    }
}