package classes;
import java.util.Scanner;

public class Drink {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("fala a idade passa o RG");

        int age = scanner.nextInt();

        //operador ternario
        String msg = age < 18 ? "Não pode ir na baladinha" : "Poder ir na baladinha";

        System.out.println(msg);

        scanner.close();
     }
}
