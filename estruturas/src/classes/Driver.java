package classes;
import java.util.Scanner;

public class Driver {
    
    

    public static void main(String[] args) {
        
        Scanner scann = new Scanner(System.in);

        System.out.println("Informe a sua Idade:");

        int age = scann.nextInt();

        if(age < 18){

            System.out.println("Não pode digirigir!");

        }else if(age > 18 && age < 21){

            System.out.println("Carteira Provisoria");

        }else{

            System.out.println("Pode dirigir!");
            
        }

        scann.close();

    }

}
