class Test {
     static void  print(int x) {
        System.out.println("Printing integer: " + x);
    }
   static void print(double y) {
        System.out.println("Printing double: " + y);
    }
    public static void main(String[] args) {
        Test demo = new Test();
        demo.print(5); // Compiler uncertainty: Which method to invoke?
    }
}

	 