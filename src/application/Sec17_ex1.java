package application;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Sec17_product;

public class Sec17_ex1 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		String path = "C:\\Users\\PICHAU\\Documents\\ws-EclipseProjects\\udemy_javaCompleto\\ex1.txt";
		String path2 = "C:\\Users\\PICHAU\\Documents\\ws-EclipseProjects\\udemy_javaCompleto\\ex1_solved.csv";
		List<Sec17_product> products = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null)
			{
				String[] infos = line.split(",");
				products.add(new Sec17_product(infos[0], Double.parseDouble(infos[1]), Integer.parseInt(infos[2])) );
				line = br.readLine();
			}
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2))) {
				for(Sec17_product _products : products) {
					bw.write(_products.toString()); 
					bw.newLine(); 
				}
			} 
			catch (IOException e) {
				System.out.println("Error Writing" + e.getMessage());
			}
		} 
		catch (IOException e) {
			System.out.println("Error Reading" + e.getMessage());
		}
	}

}
