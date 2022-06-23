package classes;
import java.util.Scanner;

public class Winner {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Faca sua aposta!\n Escolha um numero entre 1 e 100:");

        int option = scanner.nextInt();

    switch (option) {
        case 11:
            System.out.println("Premio minimo");
            break;
    
        case 22:
            System.out.println("Premio Medio");
            break;
        
        case 36:
            System.out.println("Premio maximo");
            break;

        default:
        System.out.println("Perdeu Tudo");
            break;
    }

        scanner.close();
    }


}
