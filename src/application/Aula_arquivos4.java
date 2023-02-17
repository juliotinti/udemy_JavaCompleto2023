package application;

import java.io.File;
import java.util.Scanner;

public class Aula_arquivos4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);
		
		System.out.println("getPath: " + path.getPath()); //pega o path inteiro do arquivo
		System.out.println("getParent: " + path.getParent()); //pega o path mas sem o nome do arquivo
		System.out.println("getName: " + path.getName()); //pega o nome do arquivo que foi solicitado pelo usuário
		
		sc.close();
	}
}