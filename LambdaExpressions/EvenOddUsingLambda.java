package LambdaExpressions;

//Interface for Even and Odd
interface EvenOdd
{
	void printEvenOdd(int n);
}
interface Arthimetic
{
	int Operation(int a, int b);
}
interface Add
{
	int Addition();
}
public class EvenOddUsingLambda 
{
	public static void main(String[] args) 
	{
		//Object for EvenOdd interface
		EvenOdd obj = (n -> {
			if(n%2 !=0) 
				System.out.println(n+" is Odd "); 
			else 
				System.out.println(n+" id Even");
			}
		);
		
		obj.printEvenOdd(5);
		obj.printEvenOdd(2);
        Arthimetic addition = (a, b) ->( a + b);
		System.out.println("Addition = " + addition.Operation(5, 6));
		Arthimetic substraction= (a,b)->(a-b);
		System.out.println("Substraction = "+substraction.Operation(5, 4));
		     
	}
}
