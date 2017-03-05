/* Name: Phillip Pavlich, Matthew Shortt, Ivan Bauer
 * MacID: pavlicpm, shorttmk, bauerim
 * Student Number: 1414960, 1417616, 1418765
 * Description: class that contains deals with storing all items
 * that the user wants to put in their shopping cart.
 */
import java.io.BufferedReader; //importing buffered reader
import java.io.BufferedWriter; //importing buffered writer
import java.io.FileNotFoundException; //importing fnfe
import java.io.FileReader; //importing file reader
import java.io.FileWriter; //importing file writer
import java.io.IOException; //importing ioe
import java.text.SimpleDateFormat; // importing date format
import java.util.Date; // importing date lib

public class ShoppingCart { 
	
		static int numValues=0;
		static double Priceind;
		static double EnvironmentTaxTotal=0; 
		static double HSTTotal=0; 
		static double ShippingTotal=0;
		static double Total=0;
		static String[] names; 
		static double[][] bill; 
		static String addingback; 
		static String boughtType; 
		static String theCheck;  
		static String quantityLeft; 
		static String itemRestored;  
		static String priceBack;  
		static String itemWriter; 
		static String serialNumBought; 
		static String types;  
		static String quant;  
		static String checking; 
		int amtTheyHave; 
		int totalAmt; 
		static String checking1; 
		int amtTheyHave1;  
		int totalAmt1; 

		public void createShoppingCart(){ 
			try{ 
				FileWriter createfile = new FileWriter(HWK4_pavlicpm.filename, true);
				BufferedWriter createfile1 = new BufferedWriter(createfile); 
				createfile1.write(""); 
				createfile1.close(); 
			} 
			catch (IOException e) { 
				e.printStackTrace(); 
			}  
		}
		
		public boolean isempty(){ 
			boolean empty=false; 
			try{ 
				FileReader Fr = new FileReader(HWK4_pavlicpm.filename); 
				BufferedReader Br = new BufferedReader(Fr); 
				String stringRead1=Br.readLine(); 
				Br.close(); 
				if(stringRead1==null){ 
					empty=true; 
				} 
			}  
			catch (FileNotFoundException e) { 
				e.printStackTrace(); 
			}  
			catch(IOException ioe){ 
				System.out.println("There is a input/output error that was caught");
			}
			return empty;
		} 
		
		public void getContent(){ 
			try{
				FileReader Fr = new FileReader(HWK4_pavlicpm.filename);
				BufferedReader Br = new BufferedReader(Fr);
				String stringRead1="test";
				while (stringRead1!=null){
					stringRead1 = Br.readLine();
					if (stringRead1!=null){
						System.out.println(stringRead1);
					} 
				}
				Br.close();
			} 
			catch (FileNotFoundException e) {
				e.printStackTrace(); 
			}
			catch(IOException ioe){
				System.out.println("There is a input/output error that was caught");
			}
		}
		
		public void addItem(Item objectadded, int quantity){
			
			int addingsNo=objectadded.getsNo();
			String ser=Integer.toString(addingsNo);
			String addingname = objectadded.getnameofitem();
			int quantitywanted= objectadded.getquantitywanted(quantity);
			Date now = new Date(); 
			String date=new SimpleDateFormat("dd/MM/yyyy").format(now);
			
			try{
				FileReader user_fr = new FileReader(HWK4_pavlicpm.filename);
				BufferedReader user_br = new BufferedReader( user_fr);
				
				String isItThere = user_br.readLine(); 
				checking = ""; 
				amtTheyHave = 0;
				while(isItThere!=null){
					String [] myTempArr = isItThere.split(",");
					if(ser.equals(myTempArr[0].trim())&&date.equals(myTempArr[2].trim())){ 
						checking = "found";
						amtTheyHave = Integer.parseInt(myTempArr[3].trim());
						totalAmt = amtTheyHave + quantitywanted;
					}
					isItThere = user_br.readLine();
				}
				user_br.close(); 
				
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch(IOException ioe){
				System.out.println("There is a input/output error that was caught");
			} 
			
			
			///// this is if there are repeats ////// 
			if(checking.equals("found")){ 
				
				try{ 
					FileReader user_FR = new FileReader(HWK4_pavlicpm.filename); 
					BufferedReader user_BR = new BufferedReader(user_FR); 
					FileWriter changeItem_FR = new FileWriter("temp7.txt", true);
					BufferedWriter changeItem1 = new BufferedWriter(changeItem_FR);
							
					String stringRead7="test";
					while (stringRead7!=null){
						stringRead7 = user_BR.readLine();
						if (stringRead7!=null){
							if (!stringRead7.contains(addingname)){
								changeItem1.write(stringRead7);
								changeItem1.newLine();
							}
							else if(stringRead7.contains(addingname)){
								changeItem1.write(ser+","+addingname+","+date+","+totalAmt); 
								changeItem1.newLine();
							} 
						}
					} 
					changeItem1.close(); 
					user_BR.close();
							
					FileWriter clear = new FileWriter(HWK4_pavlicpm.filename, false);
					BufferedWriter clear1 = new BufferedWriter(clear);
					clear1.write("");
					clear1.close();
					
					//// Putting Back the contents from temp7.txt to the shopping cart ////////
					FileReader user_FR1 = new FileReader("temp7.txt");
					BufferedReader user_BR1 = new BufferedReader(user_FR1); 
					FileWriter putBack = new FileWriter(HWK4_pavlicpm.filename, true);
					BufferedWriter putBack1 = new BufferedWriter(putBack);
					String stringRead3="test"; 
					while (stringRead3!=null){
						stringRead3 = user_BR1.readLine();
						if (stringRead3!=null){
							putBack1.write(stringRead3);	
							putBack1.newLine();
						}
					}
					putBack1.close();
					user_BR1.close();
							
					FileWriter empty2 = new FileWriter("temp7.txt", false);
					BufferedWriter empty3 = new BufferedWriter(empty2);
					empty3.write("");
					empty3.close();	
				}
				catch (FileNotFoundException e) {
					e.printStackTrace();
				} 
				catch(IOException ioe){
					System.out.println("There is a input/output error that was caught");
				}
			} 
			
			
			//// if we're appanding a new item to the shopping cart. NOT A REPEAT, NEW /////////
			else if(!checking.equals("found")){
				try{
					FileWriter addanitem = new FileWriter(HWK4_pavlicpm.filename, true);
					BufferedWriter addanitem1 = new BufferedWriter(addanitem);
					addanitem1.write(ser);
					addanitem1.write(","+addingname); 
					addanitem1.write(","+date);
					addanitem1.write(","+quantitywanted); 
					addanitem1.newLine(); 
					addanitem1.close();
					numValues+=1; 
				} 
				catch (IOException e) {
					e.printStackTrace();
				} 	
			} 
			if ((Integer.toString(ShoppingCart.numValues)!=null)){
				try{
					FileWriter F=new FileWriter("numval_"+HWK4_pavlicpm.nameofuser+".txt",false);
					BufferedWriter B=new BufferedWriter(F);
					B.write(Integer.toString(ShoppingCart.numValues)); 
					B.close();
				}
				catch(IOException ioe){
					System.out.println("There is a input/output error that was caught");
				}
			
			}
		}  

		public void removeitem(String y){ 
			
			try{ 
				FileReader FR = new FileReader(HWK4_pavlicpm.filename);
				BufferedReader BR = new BufferedReader(FR);
				FileWriter addanitem = new FileWriter("temporary.txt", true);
				BufferedWriter addanitem1 = new BufferedWriter(addanitem); 
						
				String stringRead2="test"; 
				while (stringRead2!=null){
					stringRead2 = BR.readLine(); 
					if (stringRead2!=null){ 
						String [] temporaryArray=stringRead2.split(","); 
						if (!temporaryArray[0].equals(y)){ 
							addanitem1.write(stringRead2); 
							addanitem1.newLine(); 
						} 
						else if(temporaryArray[0].equals(y)){ 
							addingback=temporaryArray[1].trim();
							quant=temporaryArray[3].trim();  
							FileReader FR5 = new FileReader("temp_"+HWK4_pavlicpm.nameofuser+".txt");
							BufferedReader BR5 = new BufferedReader(FR5);
							String stringRead7="test"; 
							while (stringRead7!=null){
								stringRead7 = BR5.readLine(); 
								if (stringRead7!=null){
									String [] temporaryArray1=stringRead7.split(",");  
									if (temporaryArray1[0].equals(addingback)){
										priceBack = temporaryArray1[2].trim(); 
										itemWriter = temporaryArray1[9].trim();
										serialNumBought=temporaryArray1[7].trim();
										types=temporaryArray1[8].trim();
										if(types.equals("Book")){ 
											boughtType ="Books.txt";
										}
										if(types.equals("eBook")){ 
											boughtType ="Ebooks.txt";
										}
										if(types.equals("CD")){ 
											boughtType ="CDs.txt";
										}
										if(types.equals("MP3")){ 
											boughtType ="MP3.txt";
										}						
										
									}
								}
							}

							BR5.close();
						}
					} 
				} 

				addanitem1.close();
				BR.close();
						
				FileWriter empty = new FileWriter(HWK4_pavlicpm.filename, false);
				BufferedWriter empty1 = new BufferedWriter(empty);
				empty1.write("");
				empty1.close();
						
				FileReader FR1 = new FileReader("temporary.txt");
				BufferedReader BR1 = new BufferedReader(FR1); 
				FileWriter addanitem2 = new FileWriter(HWK4_pavlicpm.filename, true);
				BufferedWriter addanitem3 = new BufferedWriter(addanitem2); 
				String stringRead3="test"; 
				while (stringRead3!=null){
					stringRead3 = BR1.readLine(); 
					if (stringRead3!=null){ 
						addanitem3.write(stringRead3);
						addanitem3.newLine(); 
					} 
				}
				addanitem3.close();
				BR1.close();
						
				FileWriter empty2 = new FileWriter("temporary.txt", false);
				BufferedWriter empty3 = new BufferedWriter(empty2);
				empty3.write("");
				empty3.close();
				numValues-=1;
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
			catch(IOException ioe){
				System.out.println("There is a input/output error that was caught");
			} 
			if ((Integer.toString(ShoppingCart.numValues)!=null)){
				try{
					FileWriter F=new FileWriter("numval_"+HWK4_pavlicpm.nameofuser+".txt",false);
					BufferedWriter B=new BufferedWriter(F);
					B.write(Integer.toString(ShoppingCart.numValues)); 
					B.close();
				}
				catch(IOException ioe){
					System.out.println("There is a input/output error that was caught");
				}
			
			}
		} 
	
		////// if they remove an item, the items that they did not indeed purchase are now put back into the inventory of the store /////
		public void restoreItem(){ 
			
			try{
				
				FileReader fr111 = new FileReader(boughtType);
				BufferedReader br111 = new BufferedReader(fr111);

				String typeRead1 = br111.readLine(); 
				theCheck=""; 
				while (typeRead1!=null&&!(theCheck.equals("found"))){
					String [] temp5Array = typeRead1.split(",");
					theCheck = ""; 
					quantityLeft = "";
					if (addingback.equals(temp5Array[1].trim())){ 
						theCheck="found";
						quantityLeft = temp5Array[4].trim();						
					}
					
					typeRead1 = br111.readLine(); 
				}
				br111.close();
				
				/// if we found the item that means there are still some items left in store for sale ////////
				if(theCheck.equals("found")){
					int quantityRestored = Integer.parseInt(quantityLeft.trim())+ Integer.parseInt(quant.trim());
					itemRestored = serialNumBought + ", " + addingback + ", " + itemWriter + ", " + priceBack + ", " + quantityRestored; 
					
				} 
				
				///// if we don't find it that means they took the last quantity out of the store, so there are no more 
				else if(!theCheck.equals("found")){
					itemRestored = serialNumBought + ", " + addingback + ", " + itemWriter + ", " + priceBack + ", " + quant;
				} 
				
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
			catch(IOException ioe){
				System.out.println("There is a input/output error that was caught");
			} 
			
			//// writing the restoredItems back to their respective .txt files (ie Books.txt)
			try{ 
				FileReader filereader5 = new FileReader(boughtType);
				BufferedReader bufferedreader5 = new BufferedReader(filereader5);
				FileWriter addquantity = new FileWriter("temp5.txt", true);
				BufferedWriter addquantity1 = new BufferedWriter(addquantity); 
						
				String readingstring1="test"; 
				while (readingstring1!=null){
					readingstring1 = bufferedreader5.readLine();
					if (readingstring1!=null){
						if (!readingstring1.contains(addingback.trim())){ 
							addquantity1.write(readingstring1);
							addquantity1.newLine(); 
						} 
					}
				}
				
				addquantity1.close();
				bufferedreader5.close();
						
				FileWriter thisempty = new FileWriter(boughtType, false);
				BufferedWriter thisempty1 = new BufferedWriter(thisempty); 
				thisempty1.write("");
				thisempty1.close();
						
				FileReader FR_1 = new FileReader("temp5.txt");
				BufferedReader BR_1 = new BufferedReader(FR_1);
				FileWriter add22 = new FileWriter(boughtType, true);
				BufferedWriter add33 = new BufferedWriter(add22);
				String stringRead33="test"; 
				while (stringRead33!=null){
					stringRead33 = BR_1.readLine(); 
					if (stringRead33!=null){
						add33.write(stringRead33);
						add33.newLine(); 
					} 
				}
				
				add33.write(itemRestored); 
				add33.close();
				BR_1.close();
						
				FileWriter thisempty2 = new FileWriter("temp5.txt", false);
				BufferedWriter thisempty3 = new BufferedWriter(thisempty2);
				thisempty3.write("");
				thisempty3.close();
						
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
			catch(IOException ioe){
				System.out.println("There is a input/output error that was caught1");
			} 
		} 

		//////addBilling takes in an item and a quantity and is used to add to be billed to the customer///////
		public void addBilling(Item objectadded, int quantity){
			int addingsNo=objectadded.getsNo();
			String ser=Integer.toString(addingsNo); 
			String name2=objectadded.getnameofitem();  
			double price=objectadded.getPrice(); 
			double environmentTax=objectadded.getEnvironmentTaxprice(quantity);
			double HST=objectadded.getHSTprice(quantity);
			double shipping=objectadded.getShippingprice(quantity);
			double total=objectadded.getTotalprice(quantity);
			String types=objectadded.getType();
			String author1=objectadded.getAuthor();
		
			try{
				FileReader user_fr = new FileReader("temp_"+HWK4_pavlicpm.nameofuser+".txt");
				BufferedReader user_br = new BufferedReader( user_fr);
				String isItThere = user_br.readLine(); 
				checking1 = "";
				amtTheyHave1 = 0; 
				while(isItThere!=null){ 
					String [] myTempArr1 = isItThere.split(",");
					if(ser.equals(myTempArr1[7].trim())){
						checking1 = "found";
						amtTheyHave1 = Integer.parseInt(myTempArr1[1].trim());
						totalAmt1 = amtTheyHave1 + quantity;
					} 
					isItThere = user_br.readLine(); 
				}
				user_br.close();
				
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch(IOException ioe){
				System.out.println("There is a input/output error that was caught"); 
			} 
		
			////// if it is found we found a duplicate and are now taking care of it ///////
			if(checking.equals("found")){ 
				try{ 
					FileReader user_FR = new FileReader("temp_"+HWK4_pavlicpm.nameofuser+".txt");
					BufferedReader user_BR = new BufferedReader(user_FR);
					FileWriter changeItem_FR = new FileWriter("temp9.txt", true);
					BufferedWriter changeItem1 = new BufferedWriter(changeItem_FR); 
					
					environmentTax=objectadded.getEnvironmentTaxprice(totalAmt1);
					HST=objectadded.getHSTprice(totalAmt1);
					shipping=objectadded.getShippingprice(totalAmt1); 
					total=objectadded.getTotalprice(totalAmt1);		
					
					String stringRead7="test"; 
					while (stringRead7!=null){
						stringRead7 = user_BR.readLine();
						if (stringRead7!=null){
							if (!stringRead7.contains(name2)){
								changeItem1.write(stringRead7);
								changeItem1.newLine(); 
							} 
							else if(stringRead7.contains(name2)){
								changeItem1.write(name2+","+totalAmt1+","+price+","+environmentTax+","+HST+","+shipping+","+total+","+ser+","+types+","+author1); 
								changeItem1.newLine();
							} 
						} 
					}
					changeItem1.close();
					user_BR.close();
							
					FileWriter clear = new FileWriter("temp_"+HWK4_pavlicpm.nameofuser+".txt", false);
					BufferedWriter clear1 = new BufferedWriter(clear);
					clear1.write("");
					clear1.close();
							
					FileReader user_FR1 = new FileReader("temp9.txt");
					BufferedReader user_BR1 = new BufferedReader(user_FR1);
					FileWriter putBack = new FileWriter("temp_"+HWK4_pavlicpm.nameofuser+".txt", true);
					BufferedWriter putBack1 = new BufferedWriter(putBack); 
					String stringRead3="test"; 
					while (stringRead3!=null){
						stringRead3 = user_BR1.readLine(); 
						if (stringRead3!=null){
							putBack1.write(stringRead3);
							putBack1.newLine(); 
						} 
					} 
					putBack1.close();
					user_BR1.close();
							
					FileWriter empty2 = new FileWriter("temp9.txt", false);
					BufferedWriter empty3 = new BufferedWriter(empty2); 
					empty3.write("");
					empty3.close();
							
				} 
				catch (FileNotFoundException e) {
					e.printStackTrace();
				} 
				catch(IOException ioe){ 
					System.out.println("There is a input/output error that was caught");
				} 	
			} 
			
			//// if not found we say it is not a duplicate so we can just use what is given, no changes required //////
			else if(!checking.equals("found")){
				try{
					FileWriter addanitem = new FileWriter("temp_"+HWK4_pavlicpm.nameofuser+".txt", true);
					BufferedWriter addanitem1 = new BufferedWriter(addanitem);
					addanitem1.write(name2);
					addanitem1.write(","+quantity);
					addanitem1.write(","+price);
					addanitem1.write(","+environmentTax);
					addanitem1.write(","+HST);
					addanitem1.write(","+shipping);
					addanitem1.write(","+total); 
					addanitem1.write(","+ser);
					addanitem1.write(","+types); 
					addanitem1.write(","+author1);
					addanitem1.newLine(); 
					addanitem1.close();
				}  
				catch (IOException e) { 
					e.printStackTrace();
				} 
			} 
		}
		
		////// removes the Billing information if they choose to remove the item//////
		public void removeBilling(String ser){
			try{
				FileReader FR = new FileReader("temp_"+HWK4_pavlicpm.nameofuser+".txt");
				BufferedReader BR = new BufferedReader(FR);
				FileWriter addanitem = new FileWriter("temporary2.txt", true);
				BufferedWriter addanitem1 = new BufferedWriter(addanitem);
						
				String stringRead4="test"; 
				while (stringRead4!=null){
					stringRead4 = BR.readLine(); 
					if (stringRead4!=null){ 
						String [] temporaryArray1=stringRead4.split(",");
						if (!temporaryArray1[7].equals(ser)){
							addanitem1.write(stringRead4);
							addanitem1.newLine(); 
						} 
					} 
				} 
				addanitem1.close();
				BR.close();
						
				FileWriter empty = new FileWriter("temp_"+HWK4_pavlicpm.nameofuser+".txt", false);
				BufferedWriter empty1 = new BufferedWriter(empty);
				empty1.write("");
				empty1.close();
						
				FileReader FR1 = new FileReader("temporary2.txt");
				BufferedReader BR1 = new BufferedReader(FR1);
				FileWriter addanitem2 = new FileWriter("temp_"+HWK4_pavlicpm.nameofuser+".txt", true);
				BufferedWriter addanitem3 = new BufferedWriter(addanitem2);
				String stringRead5="test"; 
				while (stringRead5!=null){
					stringRead5 = BR1.readLine(); 
					if (stringRead5!=null){ 
						addanitem3.write(stringRead5);
						addanitem3.newLine(); 
					} 
				} 
				addanitem3.close();
				BR1.close();
						
				FileWriter empty2 = new FileWriter("temporary2.txt", false);
				BufferedWriter empty3 = new BufferedWriter(empty2); 
				empty3.write("");
				empty3.close();
						
			} 
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
			catch(IOException ioe){ 
				System.out.println("There is a input/output error that was caught");
			} 
		}
		
		
		//// billingArray is the method that is used to print to the screen the total values of each total/////
		public void billingArray(){ 
			names=new String[numValues];
			bill=new double[numValues][6]; 
			try{
				int i=0;
				FileReader Fr = new FileReader("temp_"+HWK4_pavlicpm.nameofuser+".txt");
				BufferedReader Br = new BufferedReader(Fr);
				String stringRead1="test"; 
				while (stringRead1!=null){
					stringRead1 = Br.readLine(); 
					if ((stringRead1!=null)&&(i<numValues)){
						String [] tempoArray = stringRead1.split(",");
						names[i]= tempoArray[0];
						for(int j=0;j<6;j++){
							
							bill[i][j]=Double.parseDouble(tempoArray[j+1].trim()); 
					
						} 
						i++;
					}
				}
				Br.close();
				EnvironmentTaxTotal=0;
				HSTTotal=0;
				ShippingTotal=0; 
				
				for(int h=0;h<numValues;h++){
					EnvironmentTaxTotal+=bill[h][2];
					HSTTotal+=bill[h][3];
					ShippingTotal+=bill[h][4]; 
				} 
				EnvironmentTaxTotal=Math.round(EnvironmentTaxTotal*100.0)/100.0;
				HSTTotal=Math.round(HSTTotal*100.0)/100.0;
				ShippingTotal=Math.round(ShippingTotal*100.0)/100.0;
				Total=EnvironmentTaxTotal+HSTTotal+ShippingTotal; 
				for(int y=0;y<numValues;y++){ 
					Total=Total+bill[y][0]*bill[y][1];
				} 
				Total=Math.round(Total*100.0)/100.0;
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
			catch(IOException ioe){
				System.out.println("There is a input/output error that was caught");
			}
		}
}	