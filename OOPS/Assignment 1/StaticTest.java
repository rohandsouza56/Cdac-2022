class Static1{
	static int x = 10;
	static int y = 20;
	
	static void show(){
		System.out.println("Inside Show Block");
	}
	
}

class StaticTest{
	static int a=10;
	static float b;
	
	static{
		System.out.println("Inside Static Block");
	}
	StaticTest(){
		System.out.println("Inside Constructor");
	}
	
	static void display(){
		System.out.println("Inside Static Method");
	}
	public static void main(String args[]){
		StaticTest t1 = new StaticTest();
		Static1 sta = new Static1();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(Static1.x);
		System.out.println(Static1.y);
		display();
		Static1.show();
		
		
	}
}