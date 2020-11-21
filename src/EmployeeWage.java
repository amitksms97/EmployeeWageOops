
public class EmployeeWageBridgeLabs_UC8 {

		public static final int IS_PART_TIME=1;
		public static final int IS_FULL_TIME=2;

	public static int computeEmpWage(String company, int EMP_RATE_PER_HOUR, int  NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH ) {
		int empHrs=0, totalEmpHrs=0, totalWorkingDays=0;
		while (totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random()*10)%3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs=4;
				break;
			case IS_FULL_TIME:
				empHrs=8;
				break;
			default:
				empHrs=0;
			}
			totalEmpHrs+=empHrs;
			System.out.println("Day#: "+ totalWorkingDays + " EmpHrs: " +empHrs);
		}
		int totalEmpWage=totalEmpHrs*EMP_RATE_PER_HOUR;
		System.out.print("\nTotal Emp Wage for comapany: "+ company +" is "+totalEmpHrs+"\n");
		return totalEmpWage;
	}
	public static void main(String[] args) {
		computeEmpWage("Dmart", 20, 2, 10);
		computeEmpWage("Relaince", 10, 4, 20);
	}

}
