package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aula_arquivos2 {

	public static void main(String[] args) 
	{
		String path = "C:\\Users\\PICHAU\\Documents\\ws-EclipseProjects\\udemy_javaCompleto\\teste2.txt";
		String[] lines = new String[] {"Hello", "Hi", "Bye"};
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			System.out.println("Arquivo criado");
			for(String line : lines) {
				bw.write(line); //por padrão, ele n tem a quebra de linha
				bw.newLine(); //assim quebramos a linha
			}
			System.out.println("Escrevendo no arquivo");
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
