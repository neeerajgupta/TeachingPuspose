dg817304@gmail.com
dg0373860@gmail.com

suhanishaw0205@gmail.com


What is Java.?
java is most papular programming language.
java is PlateForm Idenpendence.(os ,linux mac,android)

OOps(Abstraction,Class,Object,Incapulation,Polimorphism,Inheritance(Single inheritance,multiple inheritance,multilable,hybrid ,hirichay)
 Multithread


Object: Any things is object 

JDK- For making java programs, we need some tools that are provided by JDK
(Java Development Kit). JDK is the package that contains various tools,
Compiler, Java Runtime Environment, etc.


JRE -  To execute the java program we need an environment. (Java Runtime
Environment) JRE contains a library of Java classes +  JVM. What are JAVA
Classes?  It contains some predefined methods that help Java programs to use
that feature, build and execute. For example - there is a system class in java that
contains the print-stream method, and with the help of this, we can print
something on the console.


JVM - (Java Virtual Machine) JVM  is a part of JRE that executes the Java
program at the end.  Actually, it is part of JRE, but it is soware that converts
bytecode into machine-executable code to execute on hardware. 


Identifire:-its mean name.like class name,method name.valiable name,

Rule of Identifire:--
				1- a to z lower case
				
				2- A to Z upper case
				3- _  and $ underScore All place VAlid ( symbol)
			    4- 0 to 9 digiti not use starting and single  (didit)



int A =10;
int 3 =10;*
int _a =10;
int a_ =10;
int 1a =10;*
int a4 =10;

int _4 =10;


	02/11/2023
	----------------
	Variable:
	--------------------------------------------------------------------------------------------------------
	java valiable is a givien to a memory location.
	it is basic unit of storage in a program.
	in java all variable must be decleared befoure use;
	
	int a,b,c;---------variable count of identifire---->3
	
	int 10;
	
 ------------------------------------------------------------------------------------------------------------------
 DAta Type
 -------------------------------------------------------------------------------------------------------------------
 Data ---> 
 Every variable has a type, every expression has a type and all types are strictly define 
more over every assignment

 different size of value that can be store in a variable.
 
 
 2 type of datatype in java
 
 1.pridefine or primitive---->
 
 Reserved words for data types: (8)
1) byte      8 bit= 1byte -128 to +127	
2) short     16 bit= 2 byte	-32768 to 3276732 bit										|
3) int       32 bit =4 Byte  -2147483648 to 2147483647										Integer -->Natural number	74354,5511,545										
4) long      64 bit->  8 byte -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807   |
5) float     32 bit =4 Byte   --> Decimal no to point   | point value like 3.2,52.3
6) double
7) char  
8) boolean  -- > true false
 2.userdefine non primitive
 
 
 
 public 
 static
 void
 private
 class
 byte     
 short     
 int      
 long
 float
 double
 char
 boolean --> true false 
 
 Char
 it store onliy one char
 
 char ch;
 char ch='k';
 
 char ch='a';
 
 
 Literals
 
 
any constance value assigned in variacle is call literal.

int a;
a=10;              a=10
int a=10;
char ch='neeraj';// asked questions
float f=50;         f=50.0;
long l=8524l;
double d=1551.655255D;


5445.5455444444444444444444444444444






==========================================================================================================

08/11/2023

ARRAY===>

Array is the linear collection of datatype.
Arrey is Homogenious datatype.

int []a=10,20,30,50;  //incurrect
int[] a={10,20,30,50}; 

2D
int [][]a=new int[3][3];

1 2 3
4 5 6
7 8 9

int [][]a={{4,5,6,3,2,7,8,},{7,5,2,4,8,8},{7,5,2,4,8,8},{7,5,2,4,8,8},{7,5,2,4,8,8},{7,5,2,4,8,8}};


3D
int [][][]a={{4,5,6,3,2,7,8,},{7,5,2,4,8,8},{4,5,7,5,2}};



int a[5];likr 132,20,50,62,85,52,41;
int []a;
int a [];
int[55] a;


***************************************************************************************************************************
17/11/2023
Type of variable:-

Basicelly variable is two type:
1- primitive variable

Primitive variables can be used to represent primitive values(datatype).
Example: 

int x=10;
float f=20;
double k=254d;
 




2-referance  Variable

Reference variables can be used to refer objects. 
Example: Student s=new Student(); 
**********************************************************************************************************
-----------------------------------------------------------------------------------------------------

According to Bihaviour type of Variable
 three type
 1- local variable
 2-instance variable
 3-Static variable
 -----------------------------------------------------------------------------------------------------
 
 
 class Test{  
 int a=30; //Instance variable
 static int b=40; //Static variable

public static void main(String[] args){ 
       int a=10;  //Primitive VAriable 
     Test t=new Test(); //t is reference variable because t refer the object
        System.out.println(t.a);
		 System.out.println(b);
        ystem.out.println(Test.b);
   System.out.println(t.b);
         System.out.println("hdjsjdhi");
 

}

}
 
 23/11/2023
 
 --------------------------------------------Home/works---------------------------------------------------
 Q1-what is java and feature 
 Q2-what is identyfire and its rule 
 Q3-what is jvm,jre,jdk 
 Q4-what is variable and its all type  with example.
        Variable is the name of memory location which store any type of value .
        it is the basic unit of program.
 
 Q5- meaning of  println();
         it is  the method in java. it also used to dispaly the output (like text  or other mathmetic etc) on the console.
 
 
 Q6-meaning of main method (Public static void main(String [] args))///imporstant
 
 ---------------------------------------------------------------------------------------------------------
 
 METHOD===>
 Method is the block of code .which provid multiple task.
  example main method,println etc.
  
  ver arg method-->
   public void suhani(){ //Normal method
	   system.out.println("suhani");
	     
   }
   public void dheeraj( int a)//Argument method
   {
	     system.out.println("dheeraj");
   }
   public void dhruvika(int a,int b) //multiple argument method{
	     system.out.println("");
   }
   public void m1(int...x) //var args method 1.4 version{
	     system.out.println("ver args method");
   }
   
  

