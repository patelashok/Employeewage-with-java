public class EmpWageBuilder {
	public static void main (String[] args){
	//constant
	int IS_FULL_TIME =1;
	int EMP_RATE_PER_HOUR=20;
	//variable
	int emphrs=0;
	int empWage=0;
	//computation
	double empCheck = Math.floor(Math.random()*10)%2;
	System.out.println(empCheck);
	if (empCheck == IS_FULL_TIME){
		System.out.println("Employee is present");
		emphrs=8;}
	else{
		System.out.println("Employee is not present");
		emphrs=0;
	}
	empWage = emphrs * EMP_RATE_PER_HOUR;
	System.out.println("Emp Wage: " + empWage);

	}
}
