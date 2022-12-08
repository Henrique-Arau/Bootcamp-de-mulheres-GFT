package quantidadeNecessaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 final int CAIO = 4;

	      Scanner scanner = new Scanner(System.in);



	      int NAmigos = scanner.nextInt(); // NAmigos = quantidade de testes

	        // TODO: Retorne o número de pizzas necessárias para atender o pedido. 
	        

	     for (int i = 1; i <= NAmigos; i++) {

	     double amigos = scanner.nextInt()*scanner.nextInt();

	     double npizzas = Math.ceil(amigos/CAIO);

	     System.out.println((int)npizzas); // (int) -> conversão do double para int

	    }

	    scanner.close();

	}

}
