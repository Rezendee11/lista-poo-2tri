import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do estudante: ");
        String nome = scanner.nextLine();

        Estudante estudante = new Estudante(nome);
        estudante.insereNotas();

        System.out.println("Média: " + estudante.calculaMedia());
        System.out.println("Menor nota: " + estudante.menorNota());
    }
}