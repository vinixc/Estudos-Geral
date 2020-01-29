package application;

import java.util.Arrays;

public class ProgramGlobalValue {

	public static int globalValue = 3;
	
	public static void main(String[] args) {
		
		int[] vect = new int[] {3,4,5};
		changeOddValues(vect);
		System.out.println(Arrays.toString(vect));
	}
	
	/**
	 * Função sem transparencia referencial, pois o resultado da mesma não depende de seus parametros
	 * mas sim do valor contido na variavel globalValue fora da função.
	 * 
	 * @param numbers
	 */

	private static void changeOddValues(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		}
	}
}
