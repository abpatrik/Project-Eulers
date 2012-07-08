package se.patrik.euler;

import se.patrik.exception.WrongNumberOrDivisorSizeException;



public class EulerCounter  {

	public static int eulerCounter(int max, int[] divisors) throws WrongNumberOrDivisorSizeException {

		int i = 0;
		int sum = 0;


		if(divisors.length == 0){
			throw new  WrongNumberOrDivisorSizeException("The divisors are empty");

		}

		else if(max <= 0 ){
			throw new  WrongNumberOrDivisorSizeException("The max argument is to small");

		}


		while( i < max ){

			for (int j = 0; j < divisors.length; j++) {

				if(i % divisors[j] == 0){
					sum = sum + i;	
					break;
				}

			}

			i++;
		}

		return sum;
	}
}
