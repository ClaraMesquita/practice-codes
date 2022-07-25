package fibonacci;

import java.util.Scanner;

public class Main {

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
