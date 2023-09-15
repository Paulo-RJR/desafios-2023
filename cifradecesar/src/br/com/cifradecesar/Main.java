package br.com.cifradecesar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe uma Mensagem Encriptada: ");
        String mensagemEncriptada = entrada.nextLine();
        System.out.print("Informe uma palavra conhecida: ");
        String palavraConhecida = entrada.nextLine();

        DecriptadorDeCesar decriptador = new DecriptadorDeCesar();
        String mensagemOriginal = decriptador.quebrarCifra(mensagemEncriptada, palavraConhecida);
        System.out.println(mensagemOriginal);
    }
}