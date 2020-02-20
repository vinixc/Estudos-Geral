package application;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

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
		
		System.out.println("-------------------------------------------------");
		
		//antes do java 5 - 2004
		Iterator<String> iterator = alunos.iterator();
		
		while(iterator.hasNext()) {
			String aluno = iterator.next();
			System.out.println(aluno);
		}
		
		//1998
		System.out.println("-------------------------------------------------");
		
		Vector<String> vetor = new Vector<>(alunos);
		vetor.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------");
		
		System.out.println(alunos);
		
	}

}
