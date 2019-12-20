import java.util.Scanner;

public class Calculadora {
	
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	int numero1 = 0;
	int numero2 = 0;
	int resultado = 0;
	int op;
	
	
	System.out.println("Digite o primeiro Numero: ");
		numero1 = entrada.nextInt();	
		
		System.out.println("Digite o segundo Numero: ");
		numero2 = entrada.nextInt();	
		
		System.out.println(" Digite a Operacao: 0 1 2 3");
	    op = entrada.nextInt();
		
	switch (op) {
	
	case 0 : resultado = numero1 + numero2; 
	break;
	
	case 1: resultado = numero1 - numero2;
	break;
	
	case 2: resultado = numero1 * numero2;
	break;
	
	case 3 : resultado = numero1 / numero2;
	break;

	default:
	throw new IllegalArgumentException(" Opcao Invalida ");
	
	}	
	
	System.out.printf(" O Resultado do Calculo e %d ", resultado);
	
	
	
}
	
}
	

