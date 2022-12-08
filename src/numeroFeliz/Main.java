package numeroFeliz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

		    int n = scan.nextInt();
		    scan.close();
		    System.out.println(isHappy(n));

		  }


		  public static boolean isHappy(int n) {
		    String texto = String.valueOf(n);

		    if (texto.length() == 1) {

		      return Integer.parseInt(texto) == 1;

		    }

		    do {

		      //System.out.println("Executou o do com " + texto);

		      String[] vetor = texto.split("");
		      int soma = 0;
		      for (int x = 0; x < vetor.length; x++) {
		        int valor = Integer.parseInt(vetor[x]);

		        soma += (valor * valor);

		      }

		      String somaStr = String.valueOf(soma);

		      if (somaStr.length() == 1) {

		        return Integer.parseInt(somaStr) == 1;

		      }

		      texto = somaStr;

		    } while (texto.length() != 1);

		    return false;

	}

}
