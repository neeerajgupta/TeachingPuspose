class Test{
	public static void methodOne(){ //Without Arguments or without signature
		System.out.println("Method  One");
	}
	
	public static void main(String [] args){
		System.out.println("Hello JAVA");
		
		Test t=new Test();
		t.methodOne();
		methodOne(); //
	}
}