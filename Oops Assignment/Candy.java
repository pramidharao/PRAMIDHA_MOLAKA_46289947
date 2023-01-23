package oops;

public class Candy extends DessertItem{
	private double weight;
	private double pricePerDollar;
	public Candy() {
		super();
		weight = 0;
		pricePerDollar = 0;
	}
	public Candy(String name,double w ,double prc) {
		super(name);
		weight = w;
		pricePerDollar = prc;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight= weight;
	}
	public double getpricePerDollar() {
		return pricePerDollar;
	}
	public void setpricePerDollar(double pricePerDollar) {
		this.pricePerDollar= pricePerDollar;
	}
	@Override
	public double getCost() {
		double total = weight *pricePerDollar;
		total = Math.round(total *100);
		return total;
	}
	
	@Override
	public String toString() {
		String s = String .format("%-50s $%.2f\n\t%.2flbs @$.2f",getName(),getCost()/100,weight,pricePerDollar);
		return s;
	}
}
