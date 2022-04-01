class TestEmployee{
	public static void main(String args[]){
		//Person p = new Person();
		Employee e = new Employee("ABC",20000.0,2020,"ABC123");
		System.out.println("Name: "+e.getName());
		System.out.println("Annual Salary: "+e.getAnnualSalary());
		System.out.println("Start Year: "+e.getStartYear());
		System.out.println("National Insurance Number: "+e.getNationalInsuranceNumber());
		
		e.setName("EFG");
		e.setAnnualSalary(50000.0);
		e.setStartYear(2021);
		e.setNationalInsuranceNumber("EFG123");
		
		System.out.println();
		System.out.println("Name: "+e.getName());
		System.out.println("Annual Salary: "+e.getAnnualSalary());
		System.out.println("Start Year: "+e.getStartYear());
		System.out.println("National Insurance Number: "+e.getNationalInsuranceNumber());
	}
}