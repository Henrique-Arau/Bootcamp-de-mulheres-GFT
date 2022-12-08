package flexaEscudoEspada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  Scanner leitor = new Scanner(System.in);  



		   int jogadaJogador = leitor.nextInt();  
		   int jogadaInimigo = leitor.nextInt();  




		  if (jogadaJogador == 1){  
		    if (jogadaInimigo == 1){  

		        System.out.println("Empatou");  

		    } else if(jogadaInimigo == 2){  

		        System.out.print("Perdeu");  


		    } else if(jogadaInimigo == 3){  

		        System.out.print("Ganhou");  



		    }  

		  } else if(jogadaJogador == 2){  

		    if (jogadaInimigo == 1){  

		        System.out.print("Ganhou");  



		    } else if(jogadaInimigo == 2){  

		        System.out.print("Empatou");  



		    } else if(jogadaInimigo == 3){  

		        System.out.print("Perdeu");  



		    }  

		  } else if(jogadaJogador == 3){  

		    if (jogadaInimigo == 1){  

		        System.out.print("Perdeu");  



		    } else if(jogadaInimigo == 2){  

		        System.out.print("Ganhou");  



		    } else if(jogadaInimigo == 3){  

		        System.out.print("Empatou");  



		    }  

		}  

	}

}
