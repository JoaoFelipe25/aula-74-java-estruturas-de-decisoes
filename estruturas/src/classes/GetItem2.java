package classes;
import java.util.Scanner;
import java.util.Arrays;

public class GetItem2 {
    public static void main(String[] args) {

        String names[] = {"paulo", "joao", "caioo"};
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String name = scanner.nextLine();

        if (Arrays.asList(names).contains(name)) {
            System.out.println("Nome encontrado, você e um convidado");
        } else {
            System.out.println("Seu nome não esta na lista, vaza penetra!");
        }

        scanner.close();
    }
}
