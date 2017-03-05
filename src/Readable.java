/* Name: Phillip Pavlich, Matthew Shortt, Ivan Bauer
 * MacID: pavlicpm, shorttmk, bauerim
 * Student Number: 1414960, 1417616, 1418765
 * Description: Class called Readable that extends Item for Items that are 
 * of type Book or ebook and adding new properties based on those types.
 */
public class Readable extends Item{  
	protected String author; 
	protected String type; 
	protected int quantitywanted; 
	
	public Readable(int sNo, String nameofitem, double price, int quantityinstore, String author, String type){
		super(sNo, nameofitem, price, quantityinstore);
		this.author=author;
		this.type=type;
	} 
	
	public String getInfo(){ 
		String inf=""; 
		String one=Integer.toString(sNo); 
		String two=Double.toString(price);
		String three=Integer.toString(quantityinstore); 
		inf=inf+one+", "+nameofitem+", "+author+", "+two+", "+three+", "+type; 
		return inf;
	} 
	public String getInfoWithoutType(){ 
		String inf=""; 
		String one=Integer.toString(sNo); 
		String two=Double.toString(price);
		String three=Integer.toString(quantityinstore); 
		inf=inf+one+", "+nameofitem+", "+author+", "+two+", "+three; 
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
		return author; 
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