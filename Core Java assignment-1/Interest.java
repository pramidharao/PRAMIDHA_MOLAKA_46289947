package assignments;
import java.util.*;

public class Interest {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
	    double p = sc.nextDouble();
	    double r = sc.nextDouble();
	    double t = sc.nextDouble();
	    double simple,compound;
	    simple = (p*r*t)/100;
	    compound =  p* Math.pow(1.0+r/100.0,t) -p;
	    System.out.println(simple);
	    System.out.println(compound);
	    sc.close();

	}

}
