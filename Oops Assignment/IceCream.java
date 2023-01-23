package oops;

public class IceCream  extends DessertItem{

	private int numberOfScoops;
	private double pricePerScoop;
	private double toopingPrice;
	public IceCream() {
		super();
		setNumberOfScoops(0);
		setPricePerScoop(0);
		setToopingPrice(0);
	}
	public IceCream(String name, int scoops, double prcPerScoop, int toopings) {
		super(name);
		setNumberOfScoops(scoops);
		setPricePerScoop(prcPerScoop);
		setToopingPrice(toopings);
	}
	public int getNumberOfScoops() {
		return numberOfScoops;
	}
	public void setNumberOfScoops(int numberOfScoops) {
		this.numberOfScoops = numberOfScoops;
	}
	public double getPricePerScoop() {
		return pricePerScoop;
	}
	public void setPricePerScoop(double pricePerScoop) {
		this.pricePerScoop = pricePerScoop;
	}
	public double getToopingPrice() {
		return toopingPrice;
	}
	public void setToopingPrice(double toopingPrice) {
		this.toopingPrice = toopingPrice;
	}
	@Override
	public double getCost() {
		double total = (numberOfScoops * pricePerScoop + toopingPrice );
		return Math.round(total*100);
	}
	public String toString() {
		String s = String.format("%-50s $%.2f\n\t%d scoopes@$%.2f/scoop + $%.2f", 
				getName(),getCost()/100,numberOfScoops,pricePerScoop,toopingPrice);
		return s;
	}
}
