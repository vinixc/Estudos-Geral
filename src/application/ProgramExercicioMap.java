package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import entities.Candidato;

public class ProgramExercicioMap {
	
	public static void main(String[] args) {
		
		Map<String, Candidato> candidatosVotos = new LinkedHashMap<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		sc.close();

		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				
				if(!candidatosVotos.containsKey(fields[0])) {
					candidatosVotos.put(fields[0], new Candidato(fields[0], Integer.parseInt(fields[1].trim())));
				}
				 else {
					 Integer votosAtual = candidatosVotos.get(fields[0]).getVotos();
					candidatosVotos.put(fields[0], new Candidato(fields[0], Integer.parseInt(fields[1].trim()) + votosAtual));
				}
				
				line = br.readLine();
			}
			
			for(String name : candidatosVotos.keySet()) {
				System.out.println(name + ": " + candidatosVotos.get(name).getVotos());
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
