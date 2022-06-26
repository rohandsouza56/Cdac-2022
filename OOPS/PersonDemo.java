class Person{

	private String name;
	private Integer age;
	private String gender;
	private Integer aadharCardNo;
	private String city;
	private String state;
	private Integer pincode;
	
	public Person(String name,Integer age, String gender, Integer aadharCardNo, String city, String state, Integer pincode){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.aadharCardNo = aadharCardNo;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAadharCardNo() {
		return aadharCardNo;
	}
	public void setAadharCardNo(Integer aadharCardNo) {
		this.aadharCardNo = aadharCardNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString(){
		return this.name+", "+this.age+", "+this.gender+", "+this.aadharCardNo+", "+this.city+", "+this.state+", "+this.pincode;
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Person){ 
			Person temp = (Person)o; 
			
			if(this.name.equals(temp.name) &&
				this.age.equals(temp.age) &&
				this.gender.equals(temp.gender)&&
				this.aadharCardNo.equals(temp.aadharCardNo) &&
				this.city.equals(temp.city) &&
				this.state.equals(temp.state) &&
				this.pincode.equals(temp.pincode)){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		int prime = 17;
		prime = prime + prime*this.name.hashCode();
		prime = prime + prime*this.age.hashCode();
		prime = prime + prime*this.gender.hashCode();
		prime = prime + prime*this.aadharCardNo.hashCode();
		prime = prime + prime*this.city.hashCode();
		prime = prime + prime*this.state.hashCode();
		prime = prime + prime*this.pincode.hashCode();
		
		return prime;
	}
	
}

class PersonDemo{
	public static void main(String[] args){
		Person p1 = new Person("A",25,"Male",1234,"Mumbai","Maharahstra",400034);
		Person p2 = new Person("B",26,"Female",5678,"Mumbai","Maharashtra",400076);
		Person p3 = new Person("A",25,"Male",1234,"Mumbai","Maharahstra",400034);
		
		System.out.println(p1); 
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println("p1 == p3: "+(p1 == p3));
		System.out.println("p1 equals p3: "+p1.equals(p3));
		
		System.out.println(p1.hashCode());
		System.out.println(p3.hashCode());
		
	}
}
