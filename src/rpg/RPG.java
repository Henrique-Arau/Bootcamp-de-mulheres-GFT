package rpg;

import java.util.Scanner;

public class RPG {
	public static void main(String[] args){ 
        Scanner leitor = new Scanner(System.in); 
 
        int dados = leitor.nextInt(); 
        int vidaDoJogador = leitor.nextInt(); 
        int ataqueDoJogador= leitor.nextInt(); 
        int defesaDoJogador = leitor.nextInt(); 
        int vidaDoInimigo= leitor.nextInt(); 
        int ataqueDoInimigo = leitor.nextInt();

     //TODO: Crie as condições necessárias para verificar se o jogador vai sobreviver, e contra-atacar, ou morrer;
     
      if(dados == 9){

     ataqueDoJogador = (ataqueDoJogador + dados) * 2;

     defesaDoJogador = (defesaDoJogador + dados) * 2;

      

    }



    vidaDoJogador = vidaDoJogador - (ataqueDoInimigo - (defesaDoJogador + dados));

    if(vidaDoJogador > 0){

     vidaDoInimigo = vidaDoInimigo - (ataqueDoJogador + dados);

     if(vidaDoInimigo > 0){

      System.out.println( "Jogador sobreviveu e nao derrotou o inimigo");

     }else{

      System.out.println( "Jogador sobreviveu e derrotou o inimigo");

     }



    }else{

     System.out.println( "Jogador nao sobreviveu");


   }
  }
}
