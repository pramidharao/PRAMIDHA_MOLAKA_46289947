package assignments;
import java.util.*;

public class IncomeTax {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double income = sc.nextDouble();
		double tax =0;
		if(income >=0 &&income <=180000)
		{
			tax = 0;
		}
		else if (income <= 300000) {
			tax = income *10/100;
		}
		else if (income <= 500000 ) {
			tax = income *20/100;
		}
		else if (income <=1000000) {
			tax = income* 30/100;
		}
		System.out.println("Salary" + income);
		System.out.println("Payable tax =" + tax );
		sc.close();

	}

}
