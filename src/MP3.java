/* Name: Phillip Pavlich, Matthew Shortt, Ivan Bauer
 * MacID: pavlicpm, shorttmk, bauerim
 * Student Number: 1414960, 1417616, 1418765
 * Description: Class called MP3 that extends Audio for Items that are 
 * of type MP3 and allowing new properties and methods to be implemented.
 */

public class MP3 extends Audio{ 
	protected double HST=0.13; 
	protected double pricetotal;
	protected double HSTprice; 
	protected double Shippingprice;
	protected double EnvironmentTaxprice;
	public MP3(int sNo, String nameofitem, double price, int quantityinstore, String author, String type){
		super(sNo, nameofitem, price, quantityinstore, author, type);
	}
	@Override 
	public double getPrice(){ 
		price=super.getPrice();
		return price;
	} 
	@Override 
	public double getHSTprice(int quantitysold){ 
		HSTprice=quantitysold*price*HST; 
		return HSTprice; 
	} 
	@Override 
	public double getEnvironmentTaxprice(int quantitysold){ 
		EnvironmentTaxprice=0; 
		return EnvironmentTaxprice; 
	} 
	@Override 
	public double getShippingprice(int quantitysold){ 
		Shippingprice=0; 
		return Shippingprice; 
	} 
	@Override 
	public double getTotalprice(int quantitysold){ 
		pricetotal=(price+price*HST)*quantitysold; 
		return pricetotal;
	} 
} 
