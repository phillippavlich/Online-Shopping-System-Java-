/* Name: Phillip Pavlich, Matthew Shortt, Ivan Bauer
 * MacID: pavlicpm, shorttmk, bauerim
 * Student Number: 1414960, 1417616, 1418765
 * Description: class that contains our main method. This is
 * the function that implements our whole shopping cart system
 * by calling methods from other classes.
 */

//We chose to implement Bonus 1 as well for the extra credit
//for our code to run we simply need the 5 files given:
//Books.txt
//CDs.txt
//MP3.txt
//Ebooks.txt
//Users.txt

import java.util.Scanner;//import Scanner library
import java.io.FileReader;//import FileReader library
import java.io.FileWriter;//import FileWriter library
import java.io.BufferedReader;//import BufferedReader Library
import java.io.BufferedWriter;//import BufferedWriter Library
import java.io.FileNotFoundException;//import File not being found exceptions library
import java.io.IOException;//import IOException Library


public class HWK4_pavlicpm {
	static String nameofuser;
	static Scanner addinguser=new Scanner(System.in);
	static UserInterface customer=new UserInterface();
	static ShoppingCart shopcart=new ShoppingCart();
	static boolean bool=true;
	static boolean bool2=true;
	static String filename;
	static String [] myarray1;
	static String[] confirms;
	static int accum;
	public static void main(String[] args){
		while (bool==true){
			try{
				FileWriter empt = new FileWriter("Users.txt", true);
				BufferedWriter empt1 = new BufferedWriter(empt);
				empt1.write("");
				empt1.close();
				FileWriter Empt = new FileWriter("password.txt", true);
				BufferedWriter Empt1 = new BufferedWriter(Empt);
				Empt1.write("");
				Empt1.close();
			}
			catch(IOException ioe){
				System.out.println("There is a input/output error that was caught");
			}
			String signingin="test";
			String signout= "not signed out";
			while (!signout.equals("signin")){
				boolean valid=false;
				while (((!(signingin.equals("sign in"))|!(signingin.equals("1"))))&& !valid){
					signingin=customer.page1();
					if (signingin.equals("sign up")|signingin.equals("2")){
						User addname = new User();
						addname.getUsername();
					}
					else{
						try{
							System.out.println("Enter your username: ");
							String testingsignin = addinguser.next();
							System.out.println("Enter your password: ");
							String pass2=addinguser.next();
							FileReader fr = new FileReader("password.txt");
							BufferedReader br = new BufferedReader(fr);
							String stringRead = br.readLine();
							
							while(stringRead != null){
								String[] tempArray=stringRead.split(",");
								if (testingsignin.equals(tempArray[0])&&pass2.equals(tempArray[1])){
									valid=true;
								}
								stringRead=br.readLine();
							}
							br.close();
							if (valid==true){
								customer.page3(testingsignin);
								nameofuser=testingsignin; 
								filename="Cart_"+nameofuser+".txt";
								shopcart.createShoppingCart();
								FileWriter empty2 = new FileWriter("ItemsBought.txt", true);
								BufferedWriter empty3 = new BufferedWriter(empty2);								
								empty3.write("");
								empty3.close();
								FileWriter empty6 = new FileWriter("temp_"+nameofuser+".txt", true);
								BufferedWriter empty7 = new BufferedWriter(empty6);
								empty7.write("");
								empty7.close();
								FileWriter empty4 = new FileWriter("boughtinfo.txt", true);
								BufferedWriter empty5 = new BufferedWriter(empty4);
								empty5.write("");
								empty5.close();
								FileWriter empty9 = new FileWriter("numval_"+nameofuser+".txt", true);						BufferedWriter empty10 = new BufferedWriter(empty9);//initializing a buffered writer
								empty10.write("");
								empty10.close();
								FileReader R=new FileReader("numval_"+nameofuser+".txt"); 
								BufferedReader R1=new BufferedReader(R);
								String num=R1.readLine();
								if (num==null){
									ShoppingCart.numValues=0;
								}
								else{
									ShoppingCart.numValues=Integer.parseInt(num);
								}
								R1.close();
								
							}
							else{
								customer.page4();
							}
					
						}
						catch(IOException ioe){
							System.out.println("There is a input/output error that was caught");						}//closing catch
						
					}
				}
			
				boolean bool_01 = true;
				boolean bool1=true;
				String page5choice="";
				while (bool1 == true) { 
					if (bool_01 == true) {
						page5choice = customer.page5(); 
					}
			
					if (page5choice.equals("1")) {
						bool2=true;
						while(bool2){
							String page6choice = customer.P6(); 
					
							if (page6choice.equals("1")) {
								customer.getReadables();
								customer.showReadables();
		
							}
							else if (page6choice.equals("2")) {
								customer.getAudioProducts();
								customer.showAudioProducts();
					
							}
							else if (page6choice.equals("-1")) {
								bool_01 = true;
								bool2=false;
								continue;
							}
						}
					}
					
					else if (page5choice.equals("2")) {
						boolean x=false;
						if(shopcart.isempty()){
							System.out.println("Your shopping cart is empty.");
							System.out.println("Press -1 to go to Previous Page");
							x=true;
						}
						else{
							shopcart.getContent();
							System.out.println("\n");
							System.out.println("You can remove an item from your shopping cart by pressing -2");
							System.out.println("Press -1 to go to Previous Page or Press 0 to Checkout");
						}
						String newChoice="5";
						while((!newChoice.equals("-1")&&(!newChoice.equals("0")))&&(!newChoice.equals("-2"))){ 
							newChoice=addinguser.next();
							if (newChoice.equals("0")&&!shopcart.isempty()){
								customer.showBillingInfo();
								
							}
							else if(newChoice.equals("-2")&&!shopcart.isempty()){
								System.out.println("Enter the Serial Number you would like to remove");								System.out.println("");//print to screen
								String removeit = addinguser.next();
								try{
									FileReader FR = new FileReader("temp_"+HWK4_pavlicpm.nameofuser+".txt");
									BufferedReader BR = new BufferedReader(FR);
									String stringRead10="test";
									boolean bool4=false;
									while (stringRead10!=null){
										stringRead10 = BR.readLine();
										if (stringRead10!=null){
											String [] temporaryArray3=stringRead10.split(",");
											if (temporaryArray3[7].equals(removeit)){
												shopcart.removeitem(removeit);
												shopcart.removeBilling(removeit);
												shopcart.restoreItem();
												System.out.println("The item has been removed from your shopping cart");									bool4=true;//changing variable to true
											}
										}
									}
									BR.close();
		
									if(!bool4){ 
										System.out.println("There was no item with that serial number"); 
									}
								}
								catch (FileNotFoundException e) {
									e.printStackTrace();
								}
								catch(IOException ioe){
									System.out.println("There is a input/output error that was caught");
								}
								System.out.println("You will be redirected to your home menu");
								System.out.println("");		
							}
							else if(newChoice.equals("-1")){
								
							}
							else if(x){
								newChoice="5";
								System.out.println("Your request was invalid.");
								System.out.println("Press -1 to go to Previous Page");
							}
							else if(((!newChoice.equals("-1")&&(!newChoice.equals("0"))))){
								System.out.println("Your request was invalid.");
								System.out.println("You can remove an item from your shopping cart by pressing -2");
								System.out.println("Press -1 to go to Previous Page or Press 0 to Checkout");
							}
						}
						
					}
			
					else if (page5choice.equals("3")) {
						System.out.println("You have signed out of the system.");						System.out.println("You will be referred back to the main menu.");//print to screen
						bool=true;
						bool1=false;
						bool_01=false;
					}
					else if (page5choice.equals("4")) { 
						
						accum=0;
						try{
							FileReader FR6 = new FileReader("boughtinfo.txt");
							BufferedReader BR6 = new BufferedReader(FR6);
							String stringmyreading="4";
							while(stringmyreading!=null){
								stringmyreading=BR6.readLine();
								if(stringmyreading!=null){
									String[] myarray=stringmyreading.split(",");
									if(myarray[0].trim().equals(nameofuser.trim())){
										accum++;
									}
								}
							}	
							BR6.close();
						}	
						catch (FileNotFoundException e) {
							e.printStackTrace();
						}
						catch(IOException ioe){
							System.out.println("There is a input/output error that was caught");
						}
						confirms=new String[accum]; 
						int U=0;
						try{
							FileReader FR7 = new FileReader("boughtinfo.txt");
							BufferedReader BR7 = new BufferedReader(FR7);
							String stringmyreading1="4";
							while(stringmyreading1!=null){
								stringmyreading1=BR7.readLine();
								if (stringmyreading1!=null){
									myarray1=stringmyreading1.split(",");
									if(myarray1[0].trim().equals(nameofuser.trim())){										confirms[U]=myarray1[1];//assigning the confirmation ids to an array
										U++;
									}
								}
						
							}
							BR7.close();
						}
						catch (FileNotFoundException e) {
							e.printStackTrace();
						}
						catch(IOException ioe){
							System.out.println("There is a input/output error that was caught");
						}				
						try{
							FileReader FR1 = new FileReader("ItemsBought.txt");
							BufferedReader BR1 = new BufferedReader(FR1);
							String stringRead6=BR1.readLine();
							boolean A=false;
							if(stringRead6!=null){
								System.out.println("These are your previous purchases: ");
								System.out.println("");
								while (stringRead6!=null){
									String[] myarray2=stringRead6.split(",");									for(int V=0; V<accum;V++){//for loop to iterate through confirmation ids
										if(confirms[V].equals(myarray2[0])){
											A=true;
											System.out.println(stringRead6);
										}
									}
									
									stringRead6 = BR1.readLine();
								}
								System.out.println("");
							}
							BR1.close();
							if(!A){
								System.out.println("");
								System.out.println("You have no previous purchases");
							}
							
							
						}//closing try
						catch (FileNotFoundException e) {
							e.printStackTrace();
						}
						catch(IOException ioe){
							System.out.println("There is a input/output error that was caught");
						}
					}
				}
			}
			
		}
	
	}
	
}