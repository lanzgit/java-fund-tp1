package model;
import java.util.Iterator;
import java.util.Scanner;

public class Boletim {

	private static String[] nomes;
	private static float[] av1;
	private static float[] av2;
	private static final int QTDE = 2;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		nomes = new String[QTDE];
		avi1 = new float[QTDE];
		avi2 = new float[QTDE];

	}
	
	private static void menu() {
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
				nomes[index] = in.next();
				System.out.print("Entre com a primeira nota: ");
				av1[index] = in.next();
				System.out.print("Entre com a segunda nota: ");
				av2[index] = in.next();
				
				index++;
				break;

			case "2":
				break;
			case "3":
				for (int i = 0; i < QTDE; i++) {
					System.out.println("%d")
				}
				break;
			case "4":
				break;
			default:
				break;
			}


		} while(!op.equals("4"));
		
	}

}
