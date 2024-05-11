package practice;

public class InstanceFlow {
	int i = 10;   //2 //8
	{  //3
		m1(); //9
		System.out.println("first block");  //11
	}
	InstanceFlow() {  //4
		System.out.println("CONSTRUCTOR"); //14
	}
	public static void main(String[] args) { //a //d
		InstanceFlow i = new InstanceFlow(); //1
		System.out.println("main method");  
		InstanceFlow i2 = new InstanceFlow();
	}
	static { //b
		System.out.println("1st static block"); //c
	}
	public void m1() {  //5   
		System.out.println(j); //10
	}
	{  //6
		System.out.println("second block"); //12
	}
	int j = 20;  //7//13
}
//static flow:
//	ide: a,b
//	exe:c
//	main:d
//instance flow:
//	id:  1 to 7 
//	exe: 8 to13
//	constru: 
//		
//	
//	
//	
//	1st static block"
//	0
//	first block
//	second block
//	CONSTRUCTOR"
//	"main method"
//again repeat


//static flow first happens and only once
//
//1. identify the static members from top to bottom  
//2. execution of static variable assignments and static vblocks from top to bottom 
//3. main method execution 
//instance flow starts
///	1. identify the instance members from top to bottom 
//		2. execution of instance variable assignments and
//				instance blocks from top to bottom
//		3. constructor  execution
