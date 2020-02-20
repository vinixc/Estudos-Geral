package application;

import java.util.HashSet;
import java.util.Set;

public class ProogramSet {
	
	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo");
		alunos.add("Alberto");
		alunos.add("Nico");
		alunos.add("Sergio Lopes");
		alunos.add("Renan");
		alunos.add("Mauricios");
		alunos.add("Mauricios");
		
		System.out.println(alunos.size());
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo");
		alunos.remove("Renan");
		System.out.println(pauloEstaMatriculado);
		
		alunos.forEach(System.out::println);
		
		System.out.println(alunos);
		
	}

}
