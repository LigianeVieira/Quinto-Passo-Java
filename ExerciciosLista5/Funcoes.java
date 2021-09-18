package ExerciciosLista5;

public class Funcoes {


	public static void main(String[] args) {

		// 10 LEITURA DE VETOR

		int vetor[] = { 1, 2, 3, 4, 5 };
		int resultado[] = fatorialVetor(vetor);

		for (int i : resultado) {
			System.out.println(i);
		}

		// matriz mult prod

		int matrizA[][] = { { 12, 4, 5 }, { 1, 8, 98 } };
		int matrizB[][] = { { 12, 4, 5 }, { 1, 8, 98 } };

		int resultado1[][] = produtoMatricial(matrizA, matrizB);

		for (int i = 0; i < resultado1.length; i++) {
			for (int j = 0; j < resultado1[i].length; j++) {
				System.out.println(resultado1[i][j]);
			}
		}
	}

	/// FATORIAL

	public static int fatorial(int n1) {

		if (n1 == 0 || n1 == 1)

			return 1;

		return n1 * fatorial(n1 - 1);

	}

	// 01 CALCULO AREA 01

	public static float calcularAreaRetangulo(float base, float altura) {

		return base * altura;
	}

	// 02 MÉDIA FINAL PONDERADA

	public static float mediaPonderadaNotas(float n1, float n2, float n3) {

		return ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;

	}

	// 03 IDADE EM ANOS,MESES E DIAS RETORNO APENAS EM DIAS

	public static int idadeDias(int anos, int meses, int dias) {

		return (anos * 365) + (meses * 30) + dias;
	}

	// 04 RECEBER CUSTO DE FABRICA E RETORNAR CUSTO CONSUMIDOR

	public static float precoVendaVeiculo(float custoFabrica) {

		return custoFabrica + custoFabrica * 0.28f + custoFabrica * 0.45f;

	}
	// 05 CALCULO SALARIO

	public static float salarioVendedorCarros(float salario, float valorvendas, int numCarros,
			float valorCarroVendido) {

		return salario + (valorvendas * 0.05f) + (numCarros * valorCarroVendido);

	}

	// 06 RECEBE 2 NUMEROS, RETORNA 2 CORRESPONDENTE FATORIAL 1.

	public static boolean isFatorialde2e1(int n1, int n2) {

		return fatorial(n1) == n2;

	}
	/// 07 RECEBER N e RETORNAR VALOR DE E

	public static float valorE(int n1) {
		float E = 1;

		for (int i = 1; i <= n1; i++) {
			E += 1 / (float) fatorial(i);
		}
		return E;
	}

/// 08 RECEBER 1 NUMERO RETORNAR O PROX NUMERO PERFEITO

	public static int proxPerfeito(int n1) {

		int soma = 0;
		boolean encontrou = false;

		while (!encontrou) {
			soma = 0;
			n1++;

			for (int i = 1; i < n1; i++) {

				if (n1 % i == 0) {
					soma += i;
				}
			}

			if (soma == n1) {
				encontrou = true;
			}
		}
		return n1;

	}

/// 09 RECEBER N (número de termos de uma progressão aritmética),A1 (o primeiro termo da progressão) e R (a razão da progressão) e RETORNAR os n termos desta progressão

	public static float[] progrecaoAri(int n, float A1, float razao) {

		float vetor[] = new float[n];
		vetor[0] = A1;

		for (int i = 1; i < n; i++) {
			A1 += razao;
			vetor[i] = A1;
		}
		return vetor;
	}

/// 10 RECEBE 2 VETORES TAMANHO 10 RETORNA VETOR CONTENDO FATORIAL DE CADA ELEMENTO DO VETOR A 

	public static int[] fatorialVetor(int vetorA[]) {

		int vetorB[] = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			vetorB[i] = fatorial(vetorA[i]);
		}
		return vetorB;
	}

//11
	public static int[] uniaoVetores(int a[], int b[]) {

		int c[] = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {

			c[i] = a[i];
		}

		for (int i = 0; i < b.length; i++) {

			c[i + b.length] = b[i];
		}
		return c;
	}

//12 
	public static int[] interseccaoVetores(int vetorA[], int vetorB[]) {
		int vetorC[] = new int[10];

		for (int i = 0; i < vetorA.length; i++) {

			for (int j = 0; j < vetorB.length; j++) {

				if (vetorA[i] == vetorB[j]) {

					vetorC[i] = vetorA[i];
				}
			}
		}
		return vetorC;
	}

//13
	public static int quantidadedePares(int vetorA[], int vetorB[]) {
		int qntidadePar = 0;

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				qntidadePar++;
			}
		}
		return qntidadePar;
	}

//14

	public static int somaElementos(int vetorA[]) {
		int soma = 0;

		for (int i = 0; i < vetorA.length; i++) {

			soma += vetorA[i];
		}
		return soma;
	}

//15
	public static int[] OrdemCrescente(int vetorA[]) {

		for (int i = 0; i < vetorA.length - 1; i++) {

			for (int j = 0; j < vetorA.length - i - 1; j++) {

				if (vetorA[j] > vetorA[j + 1]) {

					int auxiliar = vetorA[j];
					vetorA[j] = vetorA[j + 1];
					vetorA[j + 1] = auxiliar;
				}
			}
		}
		return vetorA;
	}

	// 16
	public static int[] OrdemDecrescente(int vetorA[], int vetorB[]) {
		int vetorC[] = new int[20];

		for (int i = 0; i < vetorA.length; i++) {

			vetorC[i] = vetorA[i];
		}

		for (int i = 0; i < vetorB.length; i++) {

			vetorC[i + 10] = vetorB[i];
		}

		for (int i = 0; i < vetorC.length - 1; i++) {

			for (int j = 0; j < vetorC.length - i - 1; j++) {

				if (vetorC[j + 1] > vetorC[j]) {

					int auxiliar = vetorC[j + 1];
					vetorC[j + 1] = vetorC[j];
					vetorC[j] = auxiliar;
				}
			}
		}
		return vetorC;
	}

	// 17
	public static int[] primosVetor(int vetorA[]) {

		int vetorB[] = new int[10];
		int numero;
		boolean isPrimo;

		for (int i = 0; i < vetorA.length; i++) {

			isPrimo = true;
			numero = vetorA[i];

			if (numero == 2) {

				vetorB[i] = numero;
				continue;
			}

			for (int j = 2; j < numero; j++) {

				if (numero % j == 0)
					isPrimo = false;

				if (isPrimo)
					vetorB[i] = numero;

			}
		}
		return vetorB;

	}

	// 18
	public static int maiorElementoVetor(int vetorA[]) {
		int maior = Integer.MIN_VALUE;

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] > maior)
				;
			maior = vetorA[i];
		}
		return maior;
	}

//19
	public static int matrizSomaElementos(int matrizA[][]) {
		int soma = 0;

		for (int linha = 0; linha < matrizA.length; linha++) {
			for (int coluna = 0; coluna < matrizA[linha].length; coluna++) {

				soma += matrizA[linha][coluna];
			}
		}
		return soma;
	}

	// 20
	public static int matrizSomaElementosdiagonalPrincipal(int matrizA[][]) {
		int diagonal = 0;
		for (int linha = 0; linha < matrizA.length; linha++) {
			for (int coluna = 0; coluna < matrizA[linha].length; coluna++) {
				if (linha == coluna) {
					diagonal += matrizA[linha][coluna];
				}
			}
		}
		return diagonal;
	}

//21
	public static int menorElementoDiagonal(int matrizA[][]) {
		int menor = Integer.MAX_VALUE;

		for (int linha = 0; linha < matrizA.length; linha++) {

			for (int coluna = 0; coluna < matrizA[linha].length; coluna++) {

				if (linha == coluna && matrizA[linha][coluna] < menor) {
					menor = matrizA[linha][coluna];
				}
			}
		}

		return menor;
	}

	// 22

	public static int[][] produtoMatricial(int a[][], int b[][]) {

		int[][] c = new int[a.length][b[0].length];

		for (int linha = 0; linha < c.length; linha++) {

			for (int coluna = 0; coluna < c[linha].length; coluna++) {

				int aux = 0;

				for (int k = 0; k < a.length; k++) {
					aux += a[coluna][k] * b[k][linha];
				}

				c[linha][coluna] = aux;

			}

		}

		return c;
	}

}
