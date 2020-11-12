import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("\nWelcome to Employee Wage Computation Program!\n");

		Employee emp = new Employee();
		emp.computeEmpWage();

	}

}

class Employee {
        Random random = new Random();

	private int wageHour = 20;
	private int fullDay = 8;
	private int halfDay = 4;
	private int totalWage = 0;
	private int dailyWage = 0;

        private boolean attendance() {
                int rand = random.nextInt(2);

                if(rand == 1)
                        return true;

                else
                        return false;
        }

	private void dailyEmpWage() {
		int t = random.nextInt(2);

		switch (t) {
		case 0:
			dailyWage = fullDay * wageHour;
			totalWage += dailyWage;
			break;

		case 1:
			dailyWage = halfDay * wageHour;
			totalWage += dailyWage;
			break;

		default:
			System.err.println("Invalid Operation!");
		}
	}

	protected void computeEmpWage() {
		System.out.println("Day N0." + "	" + "Status" + "	    " + "Daily Wage" + "	    " + "Total Wage");
		for (int i = 1; i <= 30; i++) {
			if (attendance()) {
				dailyEmpWage();
				System.out.println("Day " + i + "	" + "Present" + "		" + dailyWage + "		" + totalWage);

			} else {
				dailyWage = 0;
				System.out.println("Day " + i + "	" + "Absent" + "		" + dailyWage + "		" + totalWage);
			}
		}

		System.out.println("\nHence, Total employee wage for a month = " + totalWage);
	}
}