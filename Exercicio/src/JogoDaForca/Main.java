package JogoDaForca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private Scanner input = new Scanner(System.in);
	private ArrayList<String> palavras = new ArrayList<String>();

	private void menu() {
		int ident;
		while(true) {
			System.out.println("(1)addpalavra");
			System.out.println("(2) jogar");
			System.out.println("(3) sair");
			ident = input.nextInt();
			if(ident == 1) {
				addPalavra();
			}else if(ident == 3) {
				return;
			}else {
				System.out.println("de u cu");
			}
		}
	}
	
	private void addPalavra() {
			String p;
			System.out.println("Adicione uma palavra");
			p = input.next();
			palavras.add(p);
	}
	public static void main(String[] args) {
		Main jogo = new Main();
		jogo.menu();
	}
}
