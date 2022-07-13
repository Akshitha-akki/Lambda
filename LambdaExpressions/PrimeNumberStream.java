package LambdaExpressions;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimeNumberStream 
{
	public static void main(String[] args) 
	{
		 System.out.println(isPrime(14));
		 System.out.println(isPrime(5));
	}
	private static boolean isPrime(int num)
	{
		IntPredicate isDivisible = index -> num % index == 0;
		return num > 1 && IntStream.range(2, num - 1).noneMatch(isDivisible);
	}
}
