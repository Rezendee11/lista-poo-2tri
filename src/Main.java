import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos estudantes deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        Estudante[] estudantes = new Estudante[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Nome do estudante " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            Estudante estudante = new Estudante(nome);
            estudante.insereNotas();
            estudantes[i] = estudante;
        }

        Estudante[] aprovados = Aprovador.filtraAprovados(estudantes);

        if (aprovados == null) {
            System.out.println("Nenhum estudante foi aprovado.");
        } else {
            System.out.println("Estudantes aprovados:");
            for (Estudante estudante : aprovados) {
                System.out.println(estudante.getNome() + " - Média: " + estudante.calculaMedia());
            }
        }

        int[] pesos = {2, 2, 3, 1, 2};
        System.out.println("Média ponderada do primeiro estudante: " + estudantes[0].calculaMedia(pesos));

        Livro livro = new Livro("Dom Casmurro");
        System.out.println("Livro disponível? " + livro.isDisponivel());
        livro.emprestar();
        System.out.println("Livro disponível após empréstimo? " + livro.isDisponivel());
        livro.devolver();
        System.out.println("Livro disponível após devolução? " + livro.isDisponivel());

        Periodico periodico = new Periodico("Revista Exame", 45);
        System.out.println("Periódico: " + periodico.getTitulo() + " - Volume " + periodico.getNumeroVolume());
    }
}