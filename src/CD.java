/* Name: Phillip Pavlich, Matthew Shortt, Ivan Bauer
 * MacID: pavlicpm, shorttmk, bauerim
 * Student Number: 1414960, 1417616, 1418765
 * Description: Class called CD that extends Audio for Items that are 
 * of type CD and allowing new properties and methods to be implemented.
 */

public class CD extends Audio{ 
	protected double tax=0.02; 
	protected double HST=0.13; 
	protected double shipping=0.1; 
	protected double pricetotal; 
	protected double EnvironmentTaxprice; 
	protected double HSTprice; 
	protected double Shippingprice; 
	public CD(int sNo, String nameofitem, double price, int quantityinstore, String author, String type){
		super(sNo, nameofitem, price, quantityinstore, author, type);
	} 
	@Override 
	public double getPrice(){ 
		price=super.getPrice(); 
		return price; 
	} 
	@Override 
	public double getEnvironmentTaxprice(int quantitysold){ 
		EnvironmentTaxprice=quantitysold*price*tax; 
		return EnvironmentTaxprice; 
	} 
	@Override 
	public double getHSTprice(int quantitysold){ 
		HSTprice=quantitysold*price*HST; 
		return HSTprice; 
	} 
	@Override 
	public double getShippingprice(int quantitysold){ 
		Shippingprice=quantitysold*price*shipping; 
		return Shippingprice; 
	} 
	@Override 
	public double getTotalprice(int quantitysold){ 
		pricetotal=(price+price*tax+price*HST+price*shipping)*quantitysold; 
		return pricetotal; 
	} 
} 
