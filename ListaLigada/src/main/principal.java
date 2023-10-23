package main;

import ListaLigada.*;
import java.util.Scanner;
public class principal {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		ListaTel<Aluno> lista = new ListaTel<Aluno>();
		Aluno aluno1 = new Aluno("rafael","23124123");
		lista.adicionar(aluno1);
		Aluno aluno2 = new Aluno("joao","133242345");
		lista.adicionar(aluno2);
		Aluno aluno3 = new Aluno("luiza","234242535");
		lista.adicionar(aluno3);
		//adcionarAlunos(lista);
		System.out.println("insira o nome do aluno buscado");
		lista.mostrarTel(lista, sc.next());
		System.out.print("\n\n\n");
		for(int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(lista.Get(i).getValor().getNome());
		}
		sc.close();
	}
	
	public static void adcionarAlunos(ListaTel<Aluno> lista) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Para parar de adicionar escreva 'stop'");
		while(true) {
			Aluno aluno = new Aluno();
			System.out.println("informe o nome do aluno:");
			aluno.setNome(sc.next());
			if(aluno.getNome().equalsIgnoreCase("stop")) {
				break;
			}
			System.out.println("informe o numero telefonico do aluno:");
			aluno.setNumeroTel(sc.next());
			if(aluno.getNumeroTel().equalsIgnoreCase("stop")) {
				break;
			}
			lista.adicionar(aluno);
		}
	}
}
