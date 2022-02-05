package examples;

public class Examples {

    public static void imprimirNumero(int numero) {
        //O(1)
        System.out.println("O número é: " + numero);
    }

    public static void imprimirAteNumero(int numero) {
        //O(N)
        for(int i = 1; i <= numero; i++) {
            System.out.println(i);
        }

        System.out.println("O número é: " + numero);
    }

    public static void imprimirQuadradoDeNumero(int numero) {
        //O(N^2)
        for(int i = 1; i <= numero; i++){
            String linha = "";
            for(int j = 1; j <= numero; j++){
                linha = linha + " " + numero;
            }
            System.out.println(linha);
        }

        System.out.println("O número é: " + numero);
    }

    public static void imprimirQuadradoDeNumeroOtimizado(int numero) {
        //O(2*N)
        String linha = "";

        for(int j = 1; j <= numero; j++){
            linha = linha + " " + numero;
        }

        for(int i = 1; i <= numero; i++){
            System.out.println(linha);
        }

        System.out.println("O número é: " + numero);
    }
}
