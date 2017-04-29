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
				System.out.println("Informe a base para converter (2-binario, 3-base 3, 4-base 4, 8-octal, 16-hexadecimal)");
				base = n.nextInt();
				System.out.print("Resultado de "+ in +" em base "+ base +": ");
				converteRecursivo(in, base);
				System.out.println("\n");
			}
			if(op==2){
				System.out.println("Informe um numero binario:");	
				x = n.next();
				System.out.println("Informe a base para converter (3-base 3, 4-base 4, 8-octal, 10-decimal, 16-hexadecimal)");
				base = n.nextInt();
				//binarioParaX(x, bas);
			}
		}while(op != 0);
	}
	
	private static void converteRecursivo(int numero, int base){
		String result;
		if(numero>0){
			if(base==16){
				converteRecursivo(numero/base, base);
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
				converteRecursivo(numero/base, base);
				System.out.print(numero%base);
			}
		}
	}
	
//	private static void binarioParaX(String bin, int base) {
//		switch (base) {
//		case 10:
//			System.out.println("Resultado: " +Integer.parseInt(bin, 2));
//			break;
//		default:
//			break;
//		}
//	}
}
