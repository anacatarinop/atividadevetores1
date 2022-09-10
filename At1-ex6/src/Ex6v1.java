import java.util.Scanner;

public class Ex6v1 {

	public static void main(String[] args) {


		        Scanner teclado = new Scanner(System.in);

		        // Leitura da quantidade de salas:
		        System.out.print("Digite a quantidade de salas: ");
		        int qtdSalas = teclado.nextInt();

		        // Cria��o da matriz de salas:
		        int [][] salas = new int[qtdSalas][];

		        // Leitura das notas por sala:
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

		        // Sa�da com o resultado:
		        System.out.println();
		        System.out.println("+--------+---------------+----------------------------+");
		        System.out.println("| Alunos | M�dia da Sala | Porcentagem Acima da M�dia |");
		        System.out.println("+--------+---------------+----------------------------+");
		        for (int [] sala : salas) {
		           
		        	// C�lculo da m�dia da sala:
		            double soma = 0, mediaSala;
		            for (int mediaAluno : sala) {
		                soma += mediaAluno;
		            }
		            mediaSala = soma / sala.length;
		            
		            // C�lculo da quantidade de alunos acima da m�dia da sala:
		            int qtdAcima = 0;
		            double porcentagem;
		            for (int mediaAluno : sala) {
		                if (mediaAluno > mediaSala)
		                    qtdAcima++;
		            }
		            porcentagem = (double) qtdAcima / sala.length * 100;
		          
		            // Linha com os dados da sala atual:
		            System.out.printf("|    %-4d|     %-10.3f|%18.3f %%        |\n", sala.length, mediaSala, porcentagem);
		            System.out.println("+--------+---------------+----------------------------+");
		        }


		    }

		

	}


