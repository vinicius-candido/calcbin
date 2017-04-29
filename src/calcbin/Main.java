/**
 * @author Vinicius Carvalho
 * @course Arquitetura de Computadores
 * @project Calculador Binario
 */

package calcbin;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("1 - Converter base 10 para base X\n");
		System.out.println("2 - Converter base x para base 10\n");
		int op = n.nextInt();
		if(op==1){
			System.out.println("Informe um numero binario:");
			String x;
			x = n.next();
			
			System.out.println("Informe a base para converter (10-decimal, 8-octal, 16-hexadecimal)");
			int bas = n.nextInt();
			binarioParaX(x, bas);
		}
	}

	private static void binarioParaX(String bin, int base) {
		switch (base) {
		case 10:
			System.out.println("Resultado: " +Integer.parseInt(bin, 2));
			break;
		default:
			break;
		}
	}
	
}
