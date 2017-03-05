/* Name: Phillip Pavlich, Matthew Shortt, Ivan Bauer
 * MacID: pavlicpm, shorttmk, bauerim
 * Student Number: 1414960, 1417616, 1418765
 * Description: Abstract Class called Item to initialize the information
 * that is common in all items offered in the system
 */

public abstract class Item {

		public abstract String getInfo();
		public abstract double getPrice();
		public abstract int getsNo();
		public abstract int getquantity(); 
		public abstract String getnameofitem();
		public abstract int getquantitywanted(int x);
		public abstract int changeQuantity(int x);
		public abstract String getInfoWithoutType();
		public abstract double getEnvironmentTaxprice(int x);
		public abstract double getShippingprice(int x);
		public abstract double getHSTprice(int x);
		public abstract double getTotalprice(int x);
		public abstract String getType();
		public abstract String getAuthor();
		//initiating variables that are required for an item
		protected double price;
		protected int sNo;
		protected String nameofitem;
		protected int quantityinstore;
		
		//declaring input that must be given and assigns it to declared variables
		public Item(int sNo, String nameofitem, double price, int quantityinstore){
			this.sNo=sNo;
			this.nameofitem=nameofitem;
			this.price=price;
			this.quantityinstore=quantityinstore;
			
		}
	
}
