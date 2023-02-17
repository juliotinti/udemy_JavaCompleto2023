package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Aula_arquivos {

	
	public static void main(String[] args) 
	{
		//aula 1
		File file = new File("C:\\Users\\PICHAU\\Documents\\ws-EclipseProjects\\udemy_javaCompleto\\teste1.txt");
		Scanner sc = null; 
		//aula 2
		String path = "C:\\Users\\PICHAU\\Documents\\ws-EclipseProjects\\udemy_javaCompleto\\teste1.txt";
 
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			System.out.println("-------Aula1-------");
			sc = new Scanner(file); //para que o scanner leia o arquivo
			System.out.println("With Scanner: ");
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
			System.out.println("-------Aula2-------");
			System.out.println("With BufferedReader: ");
			String line = br.readLine();
			while(line != null)
			{
				System.out.println(line);
				line = br.readLine();
			}
			System.out.println("-------Aula3-------");
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
// USANDO O TRY WITH RESOURCES N PRECISA DE BLOCO PARA GARANTIR QUE IREMOS FECHAR -> a declaração do bufferedReader no try faz parte disso
//		finally
//		{
//			if(sc != null)
//				sc.close();	//coloco aqui porque o scanner será fechado independente do que rolar	
//			try { //precisa disso pq pode dar um erro ao fechar o fr e o br
//				if(br != null)
//					br.close();
//				if(fr != null)
//					fr.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}

	}

}
