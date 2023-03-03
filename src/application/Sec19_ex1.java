package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import model.entities.Sec19_logEntrie;

public class Sec19_ex1 {

	public static void main(String[] args) {
		String path = "C:\\Users\\PICHAU\\Documents\\ws-EclipseProjects\\udemy_javaCompleto\\Sec19_ex1.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			Set<Sec19_logEntrie> set = new HashSet<>();
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(" ");
				String username = fields[0]; 
				Instant moment = Instant.parse(fields[1]);
				set.add(new Sec19_logEntrie(username, moment));
				line = br.readLine();
			}
			System.out.println("Total Users: " + set.size());
		} catch (IOException e ) { 
			System.out.println(e.getMessage());
		}

	}

}
