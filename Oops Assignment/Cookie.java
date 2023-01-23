package oops;

public class Cookie  extends DessertItem{

	private int quantity;
	private double pricePerEuro;
	public Cookie() {
		super();
		setQuantity(0);
		setPricePerEuro(0);
	}
	public Cookie (String name, int qty, double prc) {
		super();
		setQuantity(qty);
		setPricePerEuro(prc);
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getPricePerEuro() {
		return pricePerEuro;
	}
	public void setPricePerEuro(double pricePerEuro) {
		this.pricePerEuro = pricePerEuro;
	}
	@Override
	public double getCost() {
		double total = pricePerEuro/12*quantity;
		total = Math.round(total*100);
		return total;
	}
	public String toString() {
		String s = String.format("%-50s $%.2f\n\t %d cookies @ $%.2f perEuro", getName(),getCost()/100,quantity,pricePerEuro);
		return s;
	}
}
