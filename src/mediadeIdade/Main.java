package mediadeIdade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);


	       int idade1 = leitor.nextInt();
	       int idade2 = leitor.nextInt();
	       int idade3 = leitor.nextInt();


	    //TODO: Implemente um condi��o de verifique a m�dia de idade da turma conforme a descri��o do desafio:


	       double mediaIdades = (idade1 + idade2+ idade3)/3;


	       if( mediaIdades <26){

	         System.out.println("Jovem!");

	       }else if(mediaIdades >25 && mediaIdades <=60){

	         System.out.println("Adulta!");

	       }else{

	         System.out.println("Idosa!");

	       }


	}

}
