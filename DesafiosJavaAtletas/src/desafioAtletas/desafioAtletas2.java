package desafioAtletas;

import java.util.Locale;
import java.util.Scanner;

public class desafioAtletas2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

//		Leitura quantidade atletas 
			System.out.println("Qual a quantidade de atletas? ");
			int n = sc.nextInt();

//		Declaração Var
			double somaPeso = 0.0;
			double porcentagemDeHomens = 0.0;
			double alturamediaDasMulheres = 0.0;
			String nomeAtletaMaisAlto = "";
			double alturaAtletaMaisAlto = 0.0;
			double pesomedioDeAtletas = 0.0;
			int numeroMulheres = 0;
			double somaAlturaMulheres = 0;

//		Leitura dos dados dos atletas 

			for (int i = 1; i < n; i++) {
				System.out.println("Digite os dados do atleta numero " + i++ + " : ");

				System.out.print("Nome: ");
				String nome = sc.next();

				System.out.println("Digite o sexo: ");
				char sexo = sc.next().charAt(0);
				while (sexo != 'F' && sexo != 'M') {
					System.out.println("Valor invalido! Favor digitar F/M: ");
					sexo = sc.next().charAt(0);
				}

				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				while (altura <= 0.0) {
					System.out.print("Valor invalido! Favor digitar um valor positivo: ");
					altura = sc.nextDouble();
				}

				System.out.print("Peso: ");
				double peso = sc.nextDouble();
				while (peso <= 0.0) {
					System.out.println("Valor invalido! Favor digitar um valor positivo: ");
					peso = sc.nextDouble();

				}
//	    Somas 
				somaPeso += peso;
				if (altura > alturaAtletaMaisAlto) {
					alturaAtletaMaisAlto = altura;
					nomeAtletaMaisAlto = nome;
				}

				else if (sexo == 'M') {
					porcentagemDeHomens++;
				} else {
					somaAlturaMulheres += altura;
					numeroMulheres++;
				}
			}
			

			System.out.println("RELATÓRIO:\n");
			System.out.printf("Peso médio dos atletas: %.2f kg\n", somaPeso / n);
			System.out.println("Atleta mais alto: " + nomeAtletaMaisAlto);
			System.out.printf("Porcentagem de homens: %.2f%%\n", (double) porcentagemDeHomens / n * 100);
			if (numeroMulheres < 0.0) {
				 System.out.printf("Altura média das mulheres: %.2f m\n", somaAlturaMulheres / numeroMulheres);
			} else {
				System.out.println("Não há mulheres cadastradas.");
			}
		
		}


	}


