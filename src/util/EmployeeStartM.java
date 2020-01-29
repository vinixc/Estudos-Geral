package util;

import java.util.function.Predicate;

import entities.Employee;

public class EmployeeStartM implements Predicate<Employee>{

	@Override
	public boolean test(Employee t) {
		return t.getName().charAt(0) == 'M';
	}

}
