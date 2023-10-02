package Strings;

public class Main {
public static void main(String[] args) {
	Aluno aluno = new Aluno("Joao", "111.222.333-44", 1233444);
	System.out.println(aluno/*.toString nem precisa mais*/);// isso converte o obj aluno para string
	// agora toString é um método próprio do objeto e não um método erdado
	
	String nome = "asdffg";
	String string1 = "text", t = "nome1, nome2, nome3";
	
	String palavras[] = t.split(","); // mesmo do js, divide e retorna um array 
	
	for(String str : palavras) {
		System.out.print(str +" ");
	}
	String string2 = new String("text");
	System.out.println(string1 == string2); // retorna false
	System.out.println(string1.equalsIgnoreCase(string2)); // retorna true se o conteúdo for igual ignorando o Case
	System.out.println(string1.charAt(2)); // serve pra percorrer string
	for (int i = 0; i < string1.length(); i++) {
		System.out.println(string1.charAt(i));
	}
	for(char c : string1.toCharArray()) { // toCharArray transforma uma string em array
		System.out.println(c+ " ");
	}
	
	System.out.println(nome.length());
	System.out.println(nome.toLowerCase());
	System.out.println(nome.toUpperCase());
	System.out.println(nome.substring(0,2));// retorna uma parte da string ( igual o slice ) 
	
}
}
