package fibonacci;
/*
	 *Ao informar um n�mero inteiro, o c�digo calcula a sequ�ncia de Fibonacci e retorne uma mensagem 
		avisando se o n�mero informado pertence ou n�o a sequ�ncia.
	 * Sequ�ncia de Fibonacci: onde se inicia por 0 e 1 e o pr�ximo valor sempre ser� a soma dos 2 valores 
		anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
*/

import java.util.Scanner;

public class FibonacciMain {

	public static void Main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroProcurado;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o n�mero:\n");
		numeroProcurado = input.nextInt();
		
		boolean numeroEncontradoBoolean = testarFibonacci(numeroProcurado);
		
		if (numeroEncontradoBoolean == true) {
			System.out.println("O n�mero "+numeroProcurado+" pertence � sequ�ncia de Fibonacci");
		}
		else {
			System.out.println("O n�mero "+numeroProcurado+" N�O pertence � sequ�ncia de Fibonacci");
		}
		
	}

	private static boolean testarFibonacci(int numeroProcurado) {
		int numeroFibonacci = 0;
		int numero1 = 1;
		int numero2 = 0;
		boolean numeroEncontradoBoolean = false;
		
		do {
			if (numeroProcurado == numeroFibonacci) {
				numeroEncontradoBoolean = true;
			}
			else {
				numeroFibonacci = numero1 + numero2;
				numero2 = numero1;
				numero1 = numeroFibonacci;	
			}
		} while ( numeroFibonacci <= numeroProcurado && numeroEncontradoBoolean == false);
		return numeroEncontradoBoolean;
	}

}