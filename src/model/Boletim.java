package model;
import java.util.Scanner;

public class Boletim {

	private static String[] nome;
	private static float[] av1;
	private static float[] av2;
	private static float[] media;
	private static String[] situacao;
	private static final int QTDE = 100;
	
	public static void main(String[] args) {
		menu();
	}
	
	private static void menu() {

		Scanner in = new Scanner(System.in);
		nome = new String[QTDE];
		av1 = new float[QTDE];
		av2 = new float[QTDE];
		media = new float[QTDE];
		situacao = new String[QTDE];

		String op = null;
		int index = 0;
		do {
			System.out.println("----------------MENU-------------------");
			System.out.println("[1] Registrar as notas de um novo aluno");
			System.out.println("[2] Consultar boletim de um anluno.");
			System.out.println("[3] Consular notas da turma.");
			System.out.println("[4] Sair.");

			System.out.print("Entre com a opcao: ");
			op = in.next(); 

			switch (op) {
			case "1":
				System.out.print("Entre com o nome do aluno: ");
				nome[index] = in.next();
				System.out.print("Entre com a primeira nota: ");
				av1[index] = in.nextFloat();
				System.out.print("Entre com a segunda nota: ");
				av2[index] = in.nextFloat();

				media[index] = calcularMedia(av1[index], av2[index]);
				situacao[index] = situacaoDoAluno(media[index]);
				System.out.println("O aluno " + nome[index] + " foi registrado com o codigo: " + index);
				index++;
				break;

			case "2":
				System.out.print("Entre com o numero do aluno: ");
				int pos = in.nextInt();
				if(nome[pos] != null) {
					boletimDoAluno(pos);
					break;
				}
				System.out.println("Aluno nao encontrado!");
				break;

			case "3":
				notasDaTurma();
				break;

			case "4":
				System.out.println("saindo...");
				break;

			default:
				System.out.println("Opcao Invalida...");
				break;
			}


		} while(!op.equals("4"));
		
	}
	
	private static void notasDaTurma() {
		for (int i = 0; i < QTDE; i++) {
			if(nome[i] != null) {
				System.out.printf("%d - %s - Nota 1:%.2f - Nota 2:%.2f - Media:%.2f - Situacao: %s\n",
				i,
				nome[i],
				av1[i],
				av2[i],
				media[i],
				situacao[i]
				);
			}
		}
	}
	
	private static void boletimDoAluno(int pos) {
		System.out.printf("%d - %s - Nota 1:%.2f - Nota 2:%.2f - Media:%.2f - Situacao: %s\n",
				pos,
				nome[pos],
				av1[pos],
				av2[pos],
				media[pos],
				situacao[pos]
				);
	}
	
	private static float calcularMedia(float nota1, float nota2) {
		return (nota1 + nota2) / 2;
	}

	private static String situacaoDoAluno(float media) {
		String resultado;
		if (media < 4) {
			resultado = "Reprovado";
		} else if(media >= 4 && media < 7) {
			resultado = "Prova Final";
		} else {
			resultado = "Aprovado";
		}

		return resultado;
	}

}
