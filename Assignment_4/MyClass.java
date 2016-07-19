package OOPS_Part3.Assignment_4;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank sbi = new SBI_Bank();
		Bank icici = new ICICI_Bank();
		Bank axis = new AXIS_Bank();
		
		System.out.println("SBI: " + sbi.getRateOfInterest() + "%");
		System.out.println("ICICI: " + icici.getRateOfInterest() + "%");
		System.out.println("AXIS: " + axis.getRateOfInterest() + "%");

	}

}
