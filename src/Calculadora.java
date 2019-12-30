import java.util.Scanner;

public class Calculadora {
	
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	int numero1 = 0;
	int numero2 = 0;
	int resultado = 0;
	int op = 0 ;
	int contador = 0;
	
	while(op <= 3)   { 
		
    		    	
	System.out.println("Digite o primeiro   Numero: ");
		numero1 = entrada.nextInt();	
		
		System.out.println("Digite o segundo Numero: ");
		numero2 = entrada.nextInt();	
		
		System.out.println(" Digite a Operacao: 1 2 3 4");
	    op = entrada.nextInt();
	    System.out.println("");	    
	    	
	switch (op) {
	
	case 1 : resultado = numero1 + numero2; 
	break;
	
	case 2: resultado = numero1 - numero2;
	break;
	
	case 3: resultado = numero1 * numero2;
	break;
	
	case 4 : resultado = numero1 / numero2;
	break;

	default:
	throw new IllegalArgumentException(" Opcao Invalida ");
		 
	
	}
	System.out.printf(" O RESULTADO do Calculo e %d ", resultado);
	System.out.println("");
	}
	
	System.out.println(" ** Digite a Operacao Novamente ate 3  VEZES ** ");
	System.out.println("");	
	
	
	}
	
}



	

