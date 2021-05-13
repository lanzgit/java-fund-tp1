package model;

public class Aluno {
	private static String nome;
	private static float av1;
	private static float av2;

	public static String getNome() {
		return nome;
	}
	public static void setNome(String nome) {
		Aluno.nome = nome;
	}
	public static float getAv1() {
		return av1;
	}
	public static void setAv1(float av1) {
		Aluno.av1 = av1;
	}
	public static float getAv2() {
		return av2;
	}
	public static void setAv2(float av2) {
		Aluno.av2 = av2;
	}
	
}
