package classes;


public class Comparision {
    public static void main(String[] args) {
        
        //Declarando arrays com o msm valores
        int array01[] = {1,2,3};
        int array02[] = {1,2,3};

        if (array01 == array02){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }
    }

    //retorna Diferentes porque nao estao comparando o conteudo,mas sim a variavel de referencia
}
