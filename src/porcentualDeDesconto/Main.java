package porcentualDeDesconto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double M = input.nextDouble();
		double D = input.nextDouble();

		double desconto = ((M - D) / M) * 100;

		System.out.println("O desconto foi de " + String.format("%.0f", desconto)+ "%");
	}

}
