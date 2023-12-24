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
	
	public static void main(String [] args){
		System.out.println("This is Static Method");
		    methodOne(); //
			methodTwo(100,200);
			
			System.out.println("This is Normal Method calling by Object:-->");
		MethodProgram mt=new MethodProgram();
		    mt.methodthree(200,200);
			mt.methodthree();
		
		
	}
}