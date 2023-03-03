package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Sec19_ex3 {

	public static void main(String[] args) {
		String path = "C:\\Users\\PICHAU\\Documents\\ws-EclipseProjects\\udemy_javaCompleto\\Sec19_ex3.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			Map<String, Integer> votationUrn = new HashMap<>();
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int votes = Integer.parseInt(fields[1]);
				if(votationUrn.containsKey(name))
				{
					int votesSoFar = votationUrn.get(name);
					votationUrn.put(name, votesSoFar+votes);
				}
				else
					votationUrn.put(name, votes);
				line = br.readLine();
			}
			for(String key: votationUrn.keySet()) {
				System.out.println(key + " : " + votationUrn.get(key));
			}
		} catch (IOException e ) { 
			System.out.println(e.getMessage());
		}

	}

}
