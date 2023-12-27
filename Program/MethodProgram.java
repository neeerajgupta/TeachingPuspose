class MethodProgram{
	public static void methodOne(){ //Without Arguments or without signature Static method
		System.out.println("Static Method  One");
	}
	
	public static void methodTwo(int a ,int b){ //static method With Arguments
		System.out.println(" Static Method  Two: " +( a+b));//concatination 
	}
	
	public  void methodthree(int a ,int b){ //Normal method With Arguments
		System.out.println(" Normal Method  Three: With Arguments " +( a+b));//concatination 
	}
	public  void methodthree(){ //Normal method WithOut Arguments
		System.out.println(" Normal Method  Three without Arguments: " );//concatination 
	}
	
	
}



Main Method->  

1. The order of modifiers is not important that is instead of public static we can 
take static public.
2. We can declare string[] in any acceptable form 
o String[] args
o String []args
o String args[]
3. Instead of args we can use any valid java identifier.
4. We can replace string[] with var-arg parameter. 
Example: main(String... args)
5. main() method can be declared with the following modifiers. 
final, synchronized, strictfp.