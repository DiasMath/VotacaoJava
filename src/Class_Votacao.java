import java.util.Scanner;

public class Class_Votacao {
    public static void main(String[] args) {

        System.out.println("******************************");
        System.out.println("\nVotacao!");
        System.out.println("\n******************************");

        String menu = """
                Escolha Dentre os Numeros Listados o seu voto.
                
                Numeros = 123, 323, 321.
                
                9 - Sair
                """;

        int contadorNum123 = 0;
        int contadorNum323 = 0;
        int contadorNum321 = 0;
        int numeroEscolhido = 0;
        Scanner leitura = new Scanner(System.in);

        while(numeroEscolhido != 9){
            System.out.println(menu);
            numeroEscolhido = leitura.nextInt();

            if(numeroEscolhido == 123){
                contadorNum123++;
            } else if(numeroEscolhido ==323){
                contadorNum323++;
            } else if (numeroEscolhido == 321){
                contadorNum321++;
            } else if( numeroEscolhido != 9){
                System.out.println("Numero invalido");
            }
        }

        System.out.println("\n#### Total de Votos #### " );
        System.out.println("\nNumero 123: " + contadorNum123);
        System.out.println("Numero 323: " + contadorNum323);
        System.out.println("Numero 321: " + contadorNum321);
    }
}
