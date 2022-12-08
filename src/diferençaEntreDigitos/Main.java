package diferençaEntreDigitos;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		 Scanner n = new Scanner(System.in);

		  

		  int soma = 0;
		  int multiplicacao = 1;
		  int diferenca = 0;



		  int numero = n.nextInt();
		  String numeroParaString = String.valueOf(numero); 
		  String[] vetor = numeroParaString.split("");


		  for(int i = 0; i < vetor.length; i++){ 
		   int item = Integer.parseInt(vetor[i]);

		   soma = soma + item;

		   multiplicacao = multiplicacao * item;



		  }

		   
		  diferenca = multiplicacao - soma;

		  System.out.println(diferenca);

	}

}
