package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;
import util.EmployeeStartM;

public class ProgramStreamEx2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter full file path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
		
		System.out.print("Enter salary : ");
		double salaryMaiorQue = sc.nextDouble();
		
		Comparator<String> comp = (email1, email2) -> email1.toUpperCase().compareTo(email2.toUpperCase());
		
		List<String> emails = list.stream()
				.filter(x -> x.getSalary() > salaryMaiorQue)
				.map(x -> x.getEmail())
				.sorted(comp)
				.collect(Collectors.toList());
		
		emails.forEach(System.out::println);
		
		double sumEmployeeM = list.stream()
				.filter(new EmployeeStartM())
				.map(e -> e.getSalary())
				.reduce(0.0, (x,y) -> x+y);
		
		System.out.println("Sum of salary of people whose name starts with 'M': " + sumEmployeeM);
					
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
