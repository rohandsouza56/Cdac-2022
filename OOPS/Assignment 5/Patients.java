
class Patient{
	String patientName;
	double patientWeight;
	double patientHeight;
	static double BMIResult;
	
	Patient(String patientName, double patientHeight,double patientWeight){
		this.patientName = patientName;
		this.patientHeight = patientHeight;
		this.patientWeight = patientWeight;
	}
	
	double BMI(){
		BMIResult = (patientWeight/(patientHeight*patientHeight)) * 703;
		return BMIResult;
	}
}

class Patients{
	public static void main(String args[]){
			Patient p = new Patient("ABC",170,150);
			p.BMI();
			System.out.println("BMI: "+Patient.BMIResult);
	}
}