package LambdaExpressions;

//Class
public class StringClass {

	public static void main(String[] args) 
	{
		//Interface with object 
		StringFunctionInterface msg = ()-> { return "Hello" ; };
		//Method
		System.out.println(msg.sayHello());
	}
}
