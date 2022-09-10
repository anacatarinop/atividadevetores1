import java.util.Scanner;

public class Main {

    static Scanner teclado = new Scanner(System.in);

    public static void lerMediasPorSala(int [][] salas, int qtdSalas) {
        for (int i = 0; i < qtdSalas; i++) {
            // Leitura da quantidade de alunos da i-�sima sala:
            System.out.print("\nDigite quantos alunos a sala " + (i + 1) + " possui: ");
            int qtdAlunos = teclado.nextInt();
            // Cria��o do vetor de m�dias da sala:
            salas[i] = new int[qtdAlunos];
            // Leitura das m�dias dos alunos da sala:
            for (int j = 0; j < qtdAlunos; j++) {
                System.out.print("  Digite a m�dia do " + (j + 1) + "� aluno: ");
                salas[i][j] = teclado.nextInt();
            }
        }
    }

    public static double calcularMediaSala(int [] sala) {
        double soma = 0;
        for (int mediaAluno : sala) {
            soma += mediaAluno;
        }
        return soma / sala.length;
    }

    public static int calcularAlunosAcimaMedia(int [] sala, double mediaSala) {
        int qtdAcima = 0;
        for (int mediaAluno : sala) {
            if (mediaAluno > mediaSala)
                qtdAcima++;
        }
        return qtdAcima;
    }

    public static void mostrarResultado(int [][] salas) {
        System.out.println();
        System.out.println("+--------+---------------+----------------------------+");
        System.out.println("| Alunos | M�dia da Sala | Porcentagem Acima da M�dia |");
        System.out.println("+--------+---------------+----------------------------+");
        for (int [] sala : salas) {
          
        	// C�lculo da m�dia da sala:
            double mediaSala = calcularMediaSala(sala);
           
            // C�lculo da quantidade de alunos acima da m�dia da sala:
            int qtdAcima = calcularAlunosAcimaMedia(sala, mediaSala);
            double porcentagem;
            porcentagem = (double) qtdAcima / sala.length * 100;
           
            // Linha com os dados da sala atual:
            System.out.printf("|    %-4d|     %-10.3f|%18.3f %%        |\n", sala.length, mediaSala, porcentagem);
            System.out.println("+--------+---------------+----------------------------+");
        }
    }

    public static void main(String[] args) {

        // Leitura da quantidade de salas:
        System.out.print("Digite a quantidade de salas: ");
        int qtdSalas = teclado.nextInt();

        // Cria��o da matriz de salas:
        int [][] salas = new int[qtdSalas][];

        // Leitura das m�dias por sala:
        lerMediasPorSala(salas, qtdSalas);

        // Sa�da com o resultado:
        mostrarResultado(salas);
    }

}
