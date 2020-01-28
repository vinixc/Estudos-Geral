package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.UsuarioCurso;

public class ProgramExercicioSet2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<UsuarioCurso> alunosDoInstrutor = new HashSet<>();
		
		System.out.print("How many students for course A?");
		Integer cursoA = sc.nextInt();
		
		for(int i = 0; i < cursoA; i++) {
			alunosDoInstrutor.add(new UsuarioCurso(sc.nextInt()));
		}
		
		System.out.print("How many students for course B?");
		Integer cursoB = sc.nextInt();
		
		for(int i = 0; i < cursoB; i++) {
			alunosDoInstrutor.add(new UsuarioCurso(sc.nextInt()));
		}
		
		System.out.print("How many students for course C?");
		Integer cursoC = sc.nextInt();
		
		for(int i = 0; i < cursoC; i++) {
			alunosDoInstrutor.add(new UsuarioCurso(sc.nextInt()));
		}
		
		sc.close();
		
		System.out.println("Total students:" + alunosDoInstrutor.size());
	}

}
