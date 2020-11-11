import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employeewage Computation Program");
		Random rnum = new Random();
		int random = rnum.nextInt(2);
		if(random==0)
		{
			System.out.println("Absent");
		}
		else
		{
			System.out.println("Present");
		}
	}

}
