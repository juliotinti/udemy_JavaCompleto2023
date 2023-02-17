package application;

import java.io.File;
import java.util.Scanner;

public class Aula_arquivos3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//listar todos as pastas dentro do path que o usuário mencionou
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for(File fold : folders)
			System.out.println(fold);
		
		//listar todos os arquivos dentro do path que o usuário mencionou
		File[] files = path.listFiles(File::isFile);
		System.out.println("FOLDERS: ");
		for(File file : files)
			System.out.println(file);
		
		//criar uma sub-pasta dentro do path que o usuário mencionou
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Diretório criado com sucesso? " + success);
		
		
		sc.close();
	}

}
