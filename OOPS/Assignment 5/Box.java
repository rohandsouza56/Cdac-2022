
class Box{
	double width;
	double height;
	double depth;
	static double volume;
	
	Box(double width, double height, double depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	double calculateVolume(){
		volume = width * height * depth;
		return volume;
	}
	
	public static void main(String args[]){
		Box b1 = new Box(10,20,30);
		Box b2 = new Box(2,3,4);
		
		b1.calculateVolume();
		System.out.println("Volume: "+volume);
		b2.calculateVolume();
		System.out.println("Volume: "+volume);
		
	}
}
