
class Animal{
	void eat(){
		System.out.println("Animal : eat()");
	}
	void sleep(){
		System.out.println("Animal : sleep()");
	}
	
}

class Bird extends Animal{
	
	@Override
	void eat(){
		System.out.println("Bird : eat()");
	}
	@Override
	void sleep(){
		System.out.println("Bird : sleep()");
	}
	void fly(){
		System.out.println("Bird : fly()");
	}
}

class AnimalDemo{
	public static void main(String args[]){

		Animal a = new Animal();
		Bird b = new Bird();
		Animal a1 = new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();
		a1.eat();
		a1.sleep();
		//a1.fly();
	}
}