/* Name: Phillip Pavlich, Matthew Shortt, Ivan Bauer
 * MacID: pavlicpm, shorttmk, bauerim
 * Student Number: 1414960, 1417616, 1418765
 * Description: Class called Audio that extends Item for Items that are 
 * of type CD or MP3 and adding new properties based on those types.
 */

public class Audio extends Item { 
	protected String artist; 
	protected String type; 
	protected int quantitywanted; 
	
	public Audio(int sNo, String nameofitem, double price, int quantityinstore, String artist, String type){
		super(sNo, nameofitem, price, quantityinstore);
		this.artist=artist;
		this.type=type;
	}
	
	public String getInfo(){ 
		String inf=""; 
		String one=Integer.toString(sNo); 
		String two=Double.toString(price); 
		String three=Integer.toString(quantityinstore); 
		inf=inf+one+", "+nameofitem+", "+artist+", "+two+", "+three+", "+type; 
		return inf; 
	} 
	public String getInfoWithoutType(){ 
		String inf=""; 
		String one=Integer.toString(sNo); 
		String two=Double.toString(price); 
		String three=Integer.toString(quantityinstore); 
		inf=inf+one+", "+nameofitem+", "+artist+", "+two+", "+three; 
		return inf; 
	} 
	public double getPrice(){ 
		return price;
	} 
	public int getsNo(){ 
		return sNo; 
	} 
	public int getquantity(){ 
		return quantityinstore; 
	} 
	public String getnameofitem(){ 
		return nameofitem; 
	} 
	public int changeQuantity(int j){ 
		quantityinstore+=j; 
		return quantityinstore; 
	} 
	public String getAuthor(){ 
		return artist; 
	} 
	public String getType(){ 
		return type; 
	} 
	public int getquantitywanted(int x){ 
		quantitywanted=x; 
		return quantitywanted; 
	} 
	public double getHSTprice(int quantitysold){ 
		return 0; 
	} 
	public double getEnvironmentTaxprice(int quantitysold){ 
		return 0; 
	} 
	public double getShippingprice(int quantitysold){ 
		return 0; 
	} 
	public double getTotalprice(int quantitysold){ 
		return 0; 
	} 
} 
