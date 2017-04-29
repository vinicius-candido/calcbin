/**
 * @author Vinicius Carvalho
 * @course Arquitetura de Computadores
 * @project Conversor Binario
 * Este programa em Java converte numero Decimal para base X, onde X = 2, 3, 4, 5, 6, 7,8, 9, ou 16
 * Tambem converte numeros base X para Decimal, onde X = 2, 3, 4, 5, 6, 7,8, 9, ou 16
 */

package calcbin;

import java.util.Scanner;

public class Main {
	static String BASE16 = "0123456789ABCDEF";
	static String BASE15 = "0123456789ABCDE";
	static String BASE14 = "0123456789ABCD";
	static String BASE13 = "0123456789ABC";
	static String BASE12 = "0123456789AB";
	static String BASE11 = "0123456789A";
	static String BASE10 = "0123456789";
	static String BASE9 = "012345678";
	static String BASE8 = "01234567";
	static String BASE7 = "0123456";
	static String BASE6 = "012345";
	static String BASE5 = "01234";
	static String BASE4 = "0123";
	static String BASE3 = "012";
	static String BASE2 = "01";

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int op, in, base;
		String x;

		do{
			System.out.println("Conversao de base - Selecione uma das opcoes abaixo:");
			System.out.print("1 - Converter base 10 para base X\n");
			System.out.print("2 - Converter base x para base 10\n");
			System.out.print("0 - Para sair\n");
			op = n.nextInt();

			if (op==1) {
				System.out.println("Informe um numero decimal:");
				in = n.nextInt();
				System.out.println("Informe a base para converter (2-binario, 3-base 3, 4-base 4, ..., 8-octal, 16-hexadecimal)");
				base = n.nextInt();
				System.out.print("Resultado de "+ in +" em base "+ base +": ");
				converteDecimalRecursivo(in, base);
				System.out.println("\n\n");
			}
			if(op==2){
				System.out.println("Informe um numero qualquer que sera convertido em decimal:");	
				x = n.next();
				System.out.println("Informe a base do numero digitado (2-base 2, 3-base 3, 4-base 4, ..., 8-octal, 16-hexadecimal)");
				base = n.nextInt();
				System.out.print("Resultado de "+ x +" (base "+ base +") em decimal: ");
				converteXRecursivo(x, base);
				System.out.println("\n\n");
			}
		}while(op != 0);
	}

	/**
	 * Converte um numero decimal em determinada base e ja imprime na tela
	 * @param numero numero decimal que sera convertido para uma base
	 * @param base base selecionada para conversao
	 */
	private static void converteDecimalRecursivo(int numero, int base){
		String result;
		if(numero>0){
			if(base==16){
				converteDecimalRecursivo(numero/base, base);
				result = Integer.toString(numero%base);
				if(numero%base == 10) { result = result.substring(0, result.length()-1);
				System.out.print("A");}
				else if(numero%base == 11) { result = result.substring(0, result.length()-1);
				System.out.print("B");
				}
				else if(numero%base == 12) { result = result.substring(0, result.length()-1);
				System.out.print("C");
				}
				else if(numero%base == 13) { result = result.substring(0, result.length()-1);
				System.out.print("D");
				}
				else if(numero%base == 14) { result = result.substring(0, result.length()-1);
				System.out.print("E");
				}
				else if(numero%base == 15) { result = result.substring(0, result.length()-1);
				System.out.print("F");
				}else
					System.out.print(result);
			}
			else{
				converteDecimalRecursivo(numero/base, base);
				System.out.print(numero%base);
			}
		}
	}

	/**
	 * Converte um numero de qualquer base (2 a 16) em decimal
	 * @param entrada valor na base (2 a 16) para ser convertido em decimal
	 * @param base base da entrada
	 * @return retorna o valor decimal da entrada
	 */
	private static int converteXRecursivo(String entrada, int base) {
		if (entrada.equals("")) return 0;
		entrada.toUpperCase();
		int result = 0, aux = 0;
		for (int i = 0; i < entrada.length(); i++) {
			char c = entrada.charAt(i);
			if(base==2) aux = BASE2.indexOf(c);
			else if(base==3) aux = BASE3.indexOf(c);
			else if(base==4) aux = BASE4.indexOf(c);
			else if(base==5) aux = BASE5.indexOf(c);
			else if(base==6) aux = BASE6.indexOf(c);
			else if(base==7) aux = BASE7.indexOf(c);
			else if(base==8) aux = BASE8.indexOf(c);
			else if(base==9) aux = BASE9.indexOf(c);
			else if(base==10) aux = BASE10.indexOf(c);
			else if(base==11) aux = BASE11.indexOf(c);
			else if(base==12) aux = BASE12.indexOf(c);
			else if(base==13) aux = BASE13.indexOf(c);
			else if(base==14) aux = BASE14.indexOf(c);
			else if(base==15) aux = BASE15.indexOf(c);
			else if(base==16) aux = BASE16.indexOf(c);
			result = base*result + aux;
		}
		return result;
	}

}
