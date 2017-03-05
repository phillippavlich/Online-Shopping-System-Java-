/* Name: Phillip Pavlich, Matthew Shortt, Ivan Bauer
 * MacID: pavlicpm, shorttmk, bauerim
 * Student Number: 1414960, 1417616, 1418765
 * Description: Class called UserInterface to deal with all of the redirection of
 * which page the system is on and sign up/sign in for our shopping cart program. 
 */

import java.util.Scanner; 
import java.io.BufferedReader; 
import java.io.BufferedWriter; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.FileWriter; 
import java.io.IOException;
import java.util.Arrays; 

public class UserInterface {
	static Scanner yourChoice=new Scanner(System.in); 
	static int confirmID;
	public String page1(){ 
		String choice="test";
		
		System.out.println("1.Sign in");
		System.out.println("2.Sign up"); 
		System.out.println("Choose your option: ");
		while (!(choice.equals("sign in"))&&!(choice.equals("sign up"))&&!(choice.equals("1"))&&!(choice.equals("2"))){ 																														
			choice=yourChoice.nextLine().trim();
			choice=choice.toLowerCase();
			if(!(choice.equals("sign in"))&&!(choice.equals("sign up"))&&!(choice.equals("1"))&&!(choice.equals("2"))){ 																														
				System.out.println("You did not enter one of the options"); 
				System.out.println("Please re-enter either \"1\" or \"2\"");
																			
			} 
			
		} 
		return choice;
	}
	
	public void page2(){
		User person= new User();
		person.getUsername(); 
	} 
	
	public void page3(String testingsignin) {
		System.out.println("Hello Mr. "+testingsignin);
	}
	
	public void page4(){
		System.out.println("No Access");
	}
	
	public String page5(){
		String p5choice =""; 
		System.out.println("1.View Items By Category"); 
		System.out.println("2.View Shopping Cart"); 
		System.out.println("3.Sign Out"); 
		System.out.println("4.View Previous Orders");
		System.out.println();
		System.out.println("Choose Your Option:");
		
		while (!(p5choice.equals("View Items By Category"))&&!(p5choice.equals("View Shopping Cart"))&&!(p5choice.equals("Sign Out"))&&!(p5choice.equals("1"))&&!(p5choice.equals("2"))&&!(p5choice.equals("3"))&&!(p5choice.equals("4"))&&!(p5choice.equals("View Previous Orders"))){  
			p5choice=yourChoice.nextLine().trim(); 
			p5choice=p5choice.toLowerCase();
			if(!(p5choice.equals("View Items By Category"))&&!(p5choice.equals("View Shopping Cart"))&&!(p5choice.equals("Sign Out"))&&!(p5choice.equals("1"))&&!(p5choice.equals("2"))&&!(p5choice.equals("3"))&&!(p5choice.equals("4"))&&!(p5choice.equals("View Previous Orders"))){ 
				System.out.println("You did not enter one of the options");
				System.out.println("Please re-enter either \"1\" or \"2\" or \"3\" or \"4\"");
			}
		
		}
		return p5choice; 
	}
	
	public String P6(){
		String p6choice="";
		
		System.out.println("1.Readables");
		System.out.println("2.Audio");
		System.out.println();
		System.out.println("Choose Your Option:");
		System.out.println();
		System.out.println();
		System.out.println("Press -1 to return to");
		System.out.println("the previous menu");
		
		while (!(p6choice.equals("Readables"))&&!(p6choice.equals("Audio"))&&!(p6choice.equals("-1"))&&!(p6choice.equals("1"))&&!(p6choice.equals("2"))){
			p6choice=yourChoice.nextLine().trim();
			p6choice=p6choice.toLowerCase();
			if(!(p6choice.equals("Readables"))&&!(p6choice.equals("Audio"))&&!(p6choice.equals("-1"))&&!(p6choice.equals("1"))&&!(p6choice.equals("2"))){
				System.out.println("You did not enter one of the options");
				System.out.println("Please re-enter either \"1\" or \"2\" or \"-1\"");
			}
		
		} 
		return p6choice;
	}
	static int longestString1 = 0;
	static int longestString2 = 0;
	static int longestString3 = 0;
	static int longestString4 = 0;
	static int longestString5 = 0;
	static int longestString6 = 0;
	static int k=0;
	static int m=0;
	static String [][] Audio;
	static char [] s1;
	static char [] s2;
	static char [] s3;
	static char [] s4;
	static char [] s5;
	static char [] spaces1;
	static char [] spaces2;
	static char [] spaces3;
	static char [] spaces4;
	static char [] spaces5;
		
	static int a = "S.No".length();
	static int b = "Name".length();
	static int c = "Artist".length();
	static int d = "Price($)".length();
	static int e = "Quantity in Store".length();
	static int f = "Type".length();
		
	static String nameOfPurchasedItem;
	static String nameOfPurchasedReadableItem;
	static int index;
	static int indexOfReadables;
	static int longestString11 = 0;
	static int longestString22 = 0;
	static int longestString33 = 0;
	static int longestString44 = 0;
	static int longestString55 = 0;
	static int longestString66 = 0;
	static int booksAmt=0;
	static int eBooksAmt=0;
	static String [][] Readables;
	static char [] s11;
	static char [] s22;
	static char [] s33;
	static char [] s44;
	static char [] s55;

	static char [] spaces11;
	static char [] spaces22;
	static char [] spaces33;
	static char [] spaces44;
	static char [] spaces55;

	static int bb = "Name of the Book".length();
	static int cc = "Author".length();
	
	static String nameOfFile;
	static String bookOrEbook;
	static Item BookBought;
	static Item eBookBought;
	
	static String nameOfAudioFile;
	static String CDorMP3;
	static Item CDBought;
	static Item MP3Bought;
	static String [][] billingInfo;
	
	static int longestPurchasedItemName=0; 
	static int qLength = "Quantity".length();
	static int pLength = "Price".length();
	static int longestQuantity = 0;
	static int longestPrice = 0;
	
	static int etaxLength = "Environment Tax".length();
	static int hstLength = "HST".length();
	static int shipLength = "Shipping".length();
	static int totalLength = "Total:".length(); 
	
	static char [] numSpaces1;
	static char [] numSpaces2;
	static char [] numSpaces3;
	
	static char [] numberSpace1;
	static char [] numberSpace2;
	static char [] numberSpace3;
	
	static char [] etaxSpace1;
	static char [] etaxSpace2;
	
	static char [] hstSpace1; 
	static char [] hstSpace2; 
	
	static char [] shipSpace1;
	static char [] shipSpace2;
	
	static String underlineSpace = "";
	static char [] underSpace1;
	static char [] underSpace2;
	
	static char [] totalSpace;
	static char [] totalSpace2;
	
	public void getReadables(){ 
		try{
			FileReader books_fr = new FileReader("Books.txt");
			BufferedReader books_br = new BufferedReader( books_fr );
			FileReader eBooks_fr = new FileReader("Ebooks.txt"); 
			BufferedReader eBooks_br = new BufferedReader( eBooks_fr );
			
			FileReader books1_fr = new FileReader("Books.txt"); 
			BufferedReader books1_br = new BufferedReader( books1_fr );
			FileReader eBooks1_fr = new FileReader("Ebooks.txt");
			BufferedReader eBooks1_br = new BufferedReader( eBooks1_fr );
			
			
			////// FINDING OUT HOW MANY LINES THERE ARE IN EACH .txt FILES ////// 
			
			String stringOfBooksRead = books_br.readLine( ); 
			booksAmt=0;
			while (stringOfBooksRead != null){
				stringOfBooksRead = books_br.readLine();
				booksAmt++;
			}
			
			String stringOfeBooksRead = eBooks_br.readLine();
			eBooksAmt=0;
			while (stringOfeBooksRead != null){
				stringOfeBooksRead = eBooks_br.readLine( );
				eBooksAmt++;
			} 
			
			////// ACTUALLY CREATING THE ARRAYS OF LINES OF THE .txt FILES //////
			String stringOfBooksRead1 = books1_br.readLine(); 
			int accum = 0;
			Readables = new String [booksAmt+eBooksAmt][6];
			while (stringOfBooksRead1 != null){
				String [] temporaryArray = stringOfBooksRead1.split(",");
				for (int i = 0; i<5; i++){
					Readables[accum][i] = temporaryArray[i].trim();
				} 
				Readables[accum][5]="Book";
				stringOfBooksRead1 = books1_br.readLine();
				accum++;
			}
			
			String stringOfeBooksRead1 = eBooks1_br.readLine();
			
			while (stringOfeBooksRead1 != null){
			
				String [] temporaryArray = stringOfeBooksRead1.split(",");
				for (int j = 0; j<5; j++){
					Readables[accum][j] = temporaryArray[j].trim();
				}
				Readables[accum][5]="eBook";
				stringOfeBooksRead1 = eBooks1_br.readLine(); 
				accum++;
			}

			for (int g=0; g< booksAmt+eBooksAmt; g++){
				for (int h=0; h<6;h++){
					if(Readables[g][0].length()>longestString11){
						longestString11 = Readables[g][0].length();
					}
					if(Readables[g][1].length()>longestString22){
						longestString22 = Readables[g][1].length();
					}
					if(Readables[g][2].length()>longestString33){
						longestString33 = Readables[g][2].length();
					}
					if(Readables[g][3].length()>longestString44){
						longestString44 = Readables[g][3].length();
					}
					if(Readables[g][4].length()>longestString55){
						longestString55 = Readables[g][4].length();
					}
					if(Readables[g][5].length()>longestString66){
						longestString66 = Readables[g][5].length();
					}
					
					
				}
			}
			books_br.close();
			eBooks_br.close();
			books1_br.close();
			eBooks1_br.close();
			}
			catch( FileNotFoundException fnfe ){
				System.out.println( "Unable to find file!" );
				}
			catch( IOException ioe ) {
				ioe.printStackTrace( );
				}
	}
	public void getAudioProducts() {
		try{
			FileReader cd_fr = new FileReader("CDs.txt");
			BufferedReader cd_br = new BufferedReader( cd_fr );
			FileReader mp3_fr = new FileReader("MP3.txt");
			BufferedReader mp3_br = new BufferedReader( mp3_fr );
			
			FileReader cd_1_fr = new FileReader("CDs.txt");
			BufferedReader cd_1_br = new BufferedReader( cd_1_fr );
			FileReader mp3_1_fr = new FileReader("MP3.txt");
			BufferedReader mp3_1_br = new BufferedReader(mp3_1_fr);
			
			////// FINDING OUT HOW MANY LINES THERE ARE IN EACH .txt FILES ////// 
			
			String stringOfCDsRead = cd_br.readLine( );
			k=0;
			while (stringOfCDsRead != null){
				stringOfCDsRead = cd_br.readLine();
				k++;
			}
			
			String stringOfMP3sRead = mp3_br.readLine();
			m=0;
			while (stringOfMP3sRead != null){
				stringOfMP3sRead = mp3_br.readLine( );
				m++;
			}
			
			////// ACTUALLY CREATING THE ARRAYS OF LINES OF THE .txt FILES //////
			String stringOfCDsRead1 = cd_1_br.readLine();
			int accumulator = 0;
			Audio = new String [k+m][6];
			while (stringOfCDsRead1 != null){
				String [] tempArray=stringOfCDsRead1.split(",");
				for (int i = 0; i<5; i++){
					Audio[accumulator][i] = tempArray[i].trim();
				}
				Audio[accumulator][5] = "CD";
				
				stringOfCDsRead1 = cd_1_br.readLine();
				accumulator++;
			}
			String stringOfMP3Read1 = mp3_1_br.readLine();
			while (stringOfMP3Read1 != null){
			
				String [] tempArray1=stringOfMP3Read1.split(",");
				for (int j=0; j<5; j++){
					Audio[accumulator][j] = tempArray1[j].trim();
				}
				Audio[accumulator][5] = "MP3";
				
				stringOfMP3Read1 = mp3_1_br.readLine();
				accumulator++;
			}
			
			for (int g=0; g< k+m; g++){
				for (int h=0; h<6;h++){
					if(Audio[g][0].length()>longestString1){
						longestString1 = Audio[g][0].length();
					}
					if(Audio[g][1].length()>longestString2){
						longestString2 = Audio[g][1].length();
					}
					if(Audio[g][2].length()>longestString3){
						longestString3 = Audio[g][2].length();
					}
					if(Audio[g][3].length()>longestString4){
						longestString4 = Audio[g][3].length(); 
					}
					if(Audio[g][4].length()>longestString5){
						longestString5 = Audio[g][4].length();
					} 
					if(Audio[g][5].length()>longestString6){
						longestString6 = Audio[g][5].length(); 
					} 
					
				} 
			}
			cd_br.close(); 
			mp3_br.close(); 
			cd_1_br.close();
			mp3_1_br.close();
			
		}
		
		catch( FileNotFoundException fnfe ){ 
			System.out.println( "Unable to find file!" );
		}
		catch( IOException ioe ) { 
			ioe.printStackTrace( );
		}
		
	} 
	public void showAudioProducts() {	
		if(a<longestString1){ 
			spaces1 = new char[Math.abs(a - longestString1)+3];
			Arrays.fill(spaces1, ' ');
		}
		else{
			spaces1 = new char[3]; 
			Arrays.fill(spaces1, ' ');
		}
		
	    if (b<longestString2){
	    	spaces2 = new char[Math.abs(b - longestString2)+3];
	    	Arrays.fill(spaces2, ' ');
	    }
	    
	    else{
	    	spaces2 = new char[3];
	    	Arrays.fill(spaces2, ' ');
	    }
		
	    if(c<longestString3){
	    	spaces3 = new char[Math.abs(c - longestString3)+3];
	    	Arrays.fill(spaces3, ' ');
	    }
	    else{
	    	spaces3 = new char[3];
	    	Arrays.fill(spaces3, ' ');
	    } 
		
		if(d<longestString4){
			spaces4 = new char[Math.abs(d - longestString4)+3];
			Arrays.fill(spaces4, ' ');
		}
		else{
			spaces4 = new char[3];
			Arrays.fill(spaces4, ' ');
		}
		
		if(e<longestString5){ 
			spaces5 = new char[Math.abs(e - longestString5)+3];
			Arrays.fill(spaces5, ' ');
		} 
		else{
			spaces5 = new char[3];
			Arrays.fill(spaces5, ' ');
		}
		
		System.out.println("Audio:");
		System.out.println();
		System.out.println();
		System.out.println("S.No"+new String(spaces1)+"Name"+new String(spaces2)+"Artist"+new String(spaces3)+"Price($)"+new String(spaces4)+"Quantity in Store"+new String(spaces5)+"Type");
		for (int w=0; w< k+m; w++){ 
			if (a>Audio[w][0].length()&&a>longestString1){
				s1 = new char[3+a-Audio[w][0].length()];
				Arrays.fill(s1, ' ');
			}
			else if (a>Audio[w][0].length()){
				s1 = new char[Math.abs(a - longestString1)+3+a-Audio[w][0].length()];
				Arrays.fill(s1, ' ');
			}
			else{
				s1 = new char[longestString1-Audio[w][0].length()+3];
				Arrays.fill(s1, ' ');
			}
			
			if (b>Audio[w][1].length()&&b>longestString2){
				s2 = new char[3+b-Audio[w][1].length()];
				Arrays.fill(s2, ' ');
			}
			else if (b>Audio[w][1].length()){
				s2 = new char[Math.abs(b - longestString2)+3+b-Audio[w][1].length()];
				Arrays.fill(s2, ' '); 
			}
			else{ 
				s2 = new char[longestString2-Audio[w][1].length()+3];
				Arrays.fill(s2, ' '); 
			}
			
			if(c>Audio[w][2].length()&&c>longestString3){
				s3 = new char[3+c-Audio[w][2].length()]; 
				Arrays.fill(s3, ' ');
			}
			else if(c>Audio[w][2].length()){
				s3 = new char[Math.abs(c - longestString3)+3+c-Audio[w][2].length()];
				Arrays.fill(s3, ' '); 
			} 
			else{
				s3 = new char[longestString3-Audio[w][2].length()+3];
				Arrays.fill(s3, ' ');
			} 
			
			if(d>Audio[w][3].length()&&d>longestString4){ 
				s4 = new char[3+d-Audio[w][3].length()];
				Arrays.fill(s4, ' ');
			} 
			else if(d>Audio[w][3].length()){ 
				s4 = new char[Math.abs(d - longestString4)+3+d-Audio[w][3].length()];
				Arrays.fill(s4, ' ');
			} 
			else{ 
				s4 = new char[longestString4-Audio[w][3].length()+3];
				Arrays.fill(s4, ' ');
			}
			
			if(e>Audio[w][4].length()&&e>longestString5){
				s5 = new char[3+e-Audio[w][4].length()];
				Arrays.fill(s5, ' ');
			}
			else if(e>Audio[w][4].length()){
				s5 = new char[Math.abs(e - longestString5)+3+e-Audio[w][4].length()];
				Arrays.fill(s5, ' ');
			} 
			else{
				s5 = new char[longestString5-Audio[w][4].length()+3];
				Arrays.fill(s5, ' ');
			} 
			if (!Audio[w][4].equals("0")){
				System.out.println(Audio[w][0]+new String(s1)+Audio[w][1]+new String(s2)+Audio[w][2]+new String(s3)+Audio[w][3]+new String(s4)+Audio[w][4]+new String(s5)+Audio[w][5]);
			}
			
		} 
		
		String option1 =""; 
		System.out.println(); 
		System.out.println("Choose Your Option:");
		System.out .println("Press -1 to return to previous menu.");
		String check ="";
		String stop = "";
		while(check!="found"){
			
			option1 = yourChoice.nextLine();
			String theOption1 = option1.trim(); 
			
		
			for (index=0; index<k+m;index++){ 
				if(theOption1.equals(Audio[index][0])){
					check="found";
					nameOfPurchasedItem = Audio[index][1];
					if(Audio[index][5]=="CD"){ 
						int serialNumber = Integer.parseInt(Audio[index][0]);
						double priceOfCD = Double.parseDouble(Audio[index][3]);
						int quantityOfCDInStore = Integer.parseInt(Audio[index][4]);
						CDBought = new CD(serialNumber, Audio[index][1], priceOfCD, quantityOfCDInStore,Audio[index][2],Audio[index][5]); 
						CDorMP3 = "CDs.txt";
					}	
					
					else if(Audio[index][5]=="MP3"){ 
						int serialNumber = Integer.parseInt(Audio[index][0]);
						double priceOfMP3 = Double.parseDouble(Audio[index][3]);
						int quantityOfMP3InStore = Integer.parseInt(Audio[index][4]);
						MP3Bought = new MP3(serialNumber, Audio[index][1], priceOfMP3, quantityOfMP3InStore,Audio[index][2],Audio[index][5]);
						CDorMP3 = "MP3.txt";
					} 
					
					break;
				} 
			} 
			
			if(theOption1.equals("-1")){
				// BRING THEM BACK TO THE PREVIOUS MENU //
				stop ="stopNow";
				check="found";
				System.out.println("Taking you back to the previous menu.");
			} 
			else if(check!="found"){
				check="";
				System.out.println("Please enter a correct S.No:");
			} 
		  	
		}
		String option2 ="";
		String check1 = "";
		String check2 = "";
		String option3 = "";
		if (stop.equals("stopNow")){
			check = ""; 
		}
		
		if (check=="found"){ 
			System.out.println("Enter quantity: ");
			while(check1!="found"){
				try{
				option2 = yourChoice.nextLine();
				String theOption2 = option2.trim();
				int number = Integer.parseInt(theOption2);
				int number1 = Integer.parseInt(Audio[index][4]);
				if(Math.signum(number)==-1.0){
					check1 = "";
					System.out.println("No negative quantities please, enter a valid quantity:");
				}
				else if(Math.signum(number)==0){
					check1 = "";
					System.out.println("You can't buy nothing, please enter a valid quantity:");
				}
				else if (number<=number1){
					check1 = "found";
					if(theOption2.equals("1")){
						if(CDorMP3=="CDs.txt"){
							CDBought.changeQuantity(-1);
							changeAudioTextFileContents(CDBought);
							HWK4_pavlicpm.shopcart.addItem(CDBought, 1);
							HWK4_pavlicpm.shopcart.addBilling(CDBought, 1);
						}
						else if(CDorMP3=="MP3.txt"){ 
							MP3Bought.changeQuantity(-1);
							changeAudioTextFileContents(MP3Bought);
							HWK4_pavlicpm.shopcart.addItem(MP3Bought, 1);
							HWK4_pavlicpm.shopcart.addBilling(MP3Bought, 1);
						}
						System.out.println("1 "+nameOfPurchasedItem+" "+Audio[index][5]+" successfully added to your cart.");
					}
				
					else if(!theOption2.equals("1")){
						if(CDorMP3=="CDs.txt"){
							CDBought.changeQuantity(-1*number);
							changeAudioTextFileContents(CDBought);
							HWK4_pavlicpm.shopcart.addItem(CDBought, number);
							HWK4_pavlicpm.shopcart.addBilling(CDBought, number);
						}
						else if(CDorMP3=="MP3.txt"){ 
							MP3Bought.changeQuantity(-1*number);
							changeAudioTextFileContents(MP3Bought);
							HWK4_pavlicpm.shopcart.addItem(MP3Bought, number);
							HWK4_pavlicpm.shopcart.addBilling(MP3Bought, number);
						}
						System.out.println(theOption2+" "+nameOfPurchasedItem+" "+Audio[index][5]+"s"+" successfully added to your cart."); 
					} 
				
				} 
			
				else if (number>number1){ 
					check1="";
					System.out.println("Sorry, we don't have that many in stock. Please select another quantity:"); 
				} 
				else  if(check1!="found"){
					check1="";
					System.out.println("Sorry, we don't have that many in stock. Please select another quantity:");
					
				}
				}
				catch(NumberFormatException nfe){
					System.out.println("Not valid input, please enter a valid quantity:");
				}
			}
			System.out.println();
			System.out.println();
			while(check2!="found"){
				System.out.println("Press -2 to Continue Shopping or Press 0 to Checkout:");
				option3 = yourChoice.nextLine();
				String theOption3  = option3.trim();
				if(theOption3.equals("-2")){
					check2 = "found"; 
					System.out.println("Taking you back to the shopping page");
					
				} 
				else if(theOption3.equals("0")){
					check2 = "found";
					System.out.println("Taking you to Checkout");
					System.out.println("");
					HWK4_pavlicpm.bool2=false;
					HWK4_pavlicpm.customer.showBillingInfo();
				}
			} 
		} 
	} 
	
	public void showReadables(){ 
		///// DETERMINING HOW MANY SPACES SHOULD BE PUT AFTER EACH HEADER //////
		
		if(a<longestString11){ 
			spaces11 = new char[Math.abs(a - longestString11)+3];
			Arrays.fill(spaces11, ' ');
		}
		else{
			spaces11 = new char[3];
			Arrays.fill(spaces11, ' '); 
		}
		
	    if (bb<longestString22){
	    	spaces22 = new char[Math.abs(bb - longestString22)+3];
	    	Arrays.fill(spaces22, ' ');
	    }
	    
	    else{
	    	spaces22 = new char[3];
	    	Arrays.fill(spaces22, ' ');
	    }
		
	    if(cc<longestString33){
	    	spaces33 = new char[Math.abs(cc - longestString33)+3];
	    	Arrays.fill(spaces33, ' ');
	    }
	    else{
	    	spaces33 = new char[3];
	    	Arrays.fill(spaces33, ' ');
	    } 
		
		if(d<longestString44){
			spaces44 = new char[Math.abs(d - longestString44)+3];
			Arrays.fill(spaces44, ' ');
		} 
		else{ 
			spaces44 = new char[3];
			Arrays.fill(spaces44, ' ');
		} 
		
		if(e<longestString55){
			spaces55 = new char[Math.abs(e - longestString55)+3];
			Arrays.fill(spaces55, ' ');
		} 
		else{
			spaces55 = new char[3];
			Arrays.fill(spaces55, ' ');
		}
		
		System.out.println("Readables:"); 
		System.out.println(); 
		System.out.println(); 
		System.out.println("S.No"+new String(spaces11)+"Name of the Book"+new String(spaces22)+"Author"+new String(spaces33)+"Price($)"+new String(spaces44)+"Quantity in Store"+new String(spaces55)+"Type"); 
		for (int w=0; w< booksAmt+eBooksAmt; w++){ 
			if (a>Readables[w][0].length()&&a>longestString11){
				s11 = new char[3+a-Readables[w][0].length()]; 
				Arrays.fill(s11, ' '); 
			} 
			else if (a>Readables[w][0].length()){ 
				s11 = new char[Math.abs(a - longestString11)+3+a-Readables[w][0].length()];
				Arrays.fill(s11, ' ');
			} 
			else{ 
				s11 = new char[longestString11-Readables[w][0].length()+3];
				Arrays.fill(s11, ' '); 
			} 
			
			if (bb>Readables[w][1].length()&&bb>longestString22){
				s22 = new char[3+bb-Readables[w][1].length()];
				Arrays.fill(s22, ' ');
			}
			else if (bb>Readables[w][1].length()){
				s22 = new char[Math.abs(bb - longestString22)+3+bb-Readables[w][1].length()];
				Arrays.fill(s22, ' '); 
			} 
			else{
				s22 = new char[longestString22-Readables[w][1].length()+3];
				Arrays.fill(s22, ' '); 
			} 
			
			if(cc>Readables[w][2].length()&&cc>longestString33){
				s33 = new char[3+cc-Readables[w][2].length()]; 
				Arrays.fill(s33, ' ');
			} 
			else if(cc>Readables[w][2].length()){ 
				s33 = new char[Math.abs(cc - longestString33)+3+cc-Readables[w][2].length()];
				Arrays.fill(s33, ' '); 
			} 
			else{ 
				s33 = new char[longestString33-Readables[w][2].length()+3];
				Arrays.fill(s33, ' '); 
			} 
			
			if(d>Readables[w][3].length()&&d>longestString44){ 
				s44 = new char[3+d-Readables[w][3].length()]; 
				Arrays.fill(s44, ' '); 
			} 
			else if(d>Readables[w][3].length()){ 
				s44 = new char[Math.abs(d - longestString44)+3+d-Readables[w][3].length()]; 
				Arrays.fill(s44, ' ');
			} 
			else{ 
				s44 = new char[longestString44-Readables[w][3].length()+3]; 
				Arrays.fill(s44, ' '); 
			} 
			
			if(e>Readables[w][4].length()&&e>longestString55){ 
				s55 = new char[3+e-Readables[w][4].length()]; 
				Arrays.fill(s55, ' '); 
			} 
			else if(e>Readables[w][4].length()){ 
				s55 = new char[Math.abs(e - longestString55)+3+e-Readables[w][4].length()]; 
				Arrays.fill(s55, ' ');
			} 
			else{ 
				s55 = new char[longestString55-Readables[w][4].length()+3];
				Arrays.fill(s55, ' ');	
			} 
			if (!Readables[w][4].equals("0")){
				System.out.println(Readables[w][0]+new String(s11)+Readables[w][1]+new String(s22)+Readables[w][2]+new String(s33)+Readables[w][3]+new String(s44)+Readables[w][4]+new String(s55)+Readables[w][5]);
			} 
			
		} 
		
		
		String option1 =""; 
		System.out.println();
		System.out.println("Choose Your Option:");
		System.out .println("Press -1 to return to previous menu.");
		String check =""; 
		String stop = ""; 
		while(check!="found"){ 
			
			option1 = yourChoice.nextLine(); 
			String theOption1 = option1.trim();
			
		
			for (indexOfReadables=0; indexOfReadables<booksAmt+eBooksAmt;indexOfReadables++){ 
				if(theOption1.equals(Readables[indexOfReadables][0])){ 
					check="found"; 
					nameOfPurchasedReadableItem = Readables[indexOfReadables][1]; 
					
					if(Readables[indexOfReadables][5]=="Book"){ 
						int serialNumber = Integer.parseInt(Readables[indexOfReadables][0]); 
						double priceOfBook = Double.parseDouble(Readables[indexOfReadables][3]); 
						int quantityOfBookInStore = Integer.parseInt(Readables[indexOfReadables][4]); 
						BookBought = new Book(serialNumber, Readables[indexOfReadables][1], priceOfBook, quantityOfBookInStore,Readables[indexOfReadables][2],Readables[indexOfReadables][5]); 
						
						bookOrEbook = "Books.txt"; 
					} 						
					
					else if(Readables[indexOfReadables][5]=="eBook"){ 
						int serialNumber = Integer.parseInt(Readables[indexOfReadables][0]); 
						double priceOfeBook = Double.parseDouble(Readables[indexOfReadables][3]);
						int quantityOfeBookInStore = Integer.parseInt(Readables[indexOfReadables][4]); 
						eBookBought = new eBook(serialNumber, Readables[indexOfReadables][1], priceOfeBook, quantityOfeBookInStore,Readables[indexOfReadables][2],Readables[indexOfReadables][5]); 
						
						bookOrEbook = "Ebooks.txt";
					} 
					
					break; 
				} 
			} 
			
			if(theOption1.equals("-1")){
				// BRING THEM BACK TO THE PREVIOUS MENU //
				stop ="stopNow"; 
				check="found"; 
				
				System.out.println("Taking you back to the previous menu."); 
			} 
			else  if(check!="found"){ 
				check=""; 
				System.out.println("Please enter a correct S.No:"); 
			} 
		  	
		} 
		String option2 =""; 
		String check1 = ""; 
		String check2 = ""; 
		String option3 = ""; 
		if (stop.equals("stopNow")){ 
			check = ""; 
		} 
		
		if (check=="found"){ 
			System.out.println("Enter quantity: ");
			while(check1!="found"){ 
				try{ 
				option2 = yourChoice.nextLine();
				String theOption2 = option2.trim(); 
				int number = Integer.parseInt(theOption2);
				int number1 = Integer.parseInt(Readables[indexOfReadables][4]); 
				if(Math.signum(number)==-1.0){ 
					check1 = "";
					System.out.println("No negative quantities please, enter a valid quantity:"); 
				} 
				else if(Math.signum(number)==0){ 
					check1 = ""; 
					System.out.println("You can't buy nothing, please enter a valid quantity:");
				}
				else if (number<=number1){ 
					check1 = "found"; 
					if(theOption2.equals("1")){ 
						if(bookOrEbook == "Books.txt"){ 
							BookBought.changeQuantity(-1);
							changeTextFileContents(BookBought); 
							HWK4_pavlicpm.shopcart.addItem(BookBought, 1); 
							HWK4_pavlicpm.shopcart.addBilling(BookBought, 1); 
						} 
						else if(bookOrEbook == "Ebooks.txt"){ 
							eBookBought.changeQuantity(-1); 
							changeTextFileContents(eBookBought); 
							HWK4_pavlicpm.shopcart.addItem(eBookBought, 1);
							HWK4_pavlicpm.shopcart.addBilling(eBookBought, 1); 
						} 
						System.out.println("1 "+nameOfPurchasedReadableItem+" "+Readables[indexOfReadables][5]+" successfully added to your cart."); 
					} 
				
					else if(!theOption2.equals("1")){ 
						if(bookOrEbook == "Books.txt"){ 
							BookBought.changeQuantity(-1*number); 
							changeTextFileContents(BookBought); 
							HWK4_pavlicpm.shopcart.addItem(BookBought, number);
							HWK4_pavlicpm.shopcart.addBilling(BookBought, number);
						} 
						else if(bookOrEbook == "Ebooks.txt"){ 
							eBookBought.changeQuantity(-1*number);
							changeTextFileContents(eBookBought); 
							HWK4_pavlicpm.shopcart.addItem(eBookBought, number);
							HWK4_pavlicpm.shopcart.addBilling(eBookBought, number);
						} 
						System.out.println(theOption2+" "+nameOfPurchasedReadableItem+" "+Readables[indexOfReadables][5]+"s"+" successfully added to your cart."); 
					} 
				
				} 
			
				else if (number>number1){ 
					check1=""; 
					System.out.println("Sorry, we don't have that many in stock. Please select another quantity:");
				} 
				else  if(check1!="found"){
					check1="";
					System.out.println("Sorry, we don't have that many in stock. Please select another quantity:"); 
					
				} 
				} 
				catch(NumberFormatException nfe){ 
					System.out.println("Not valid input, please enter a valid quantity:"); 
				} 
			} 
			System.out.println(); 
			System.out.println(); 
			while(check2!="found"){
				System.out.println("Press -2 to Continue Shopping or Press 0 to Checkout:"); 
				option3 = yourChoice.nextLine(); 
				String theOption3  = option3.trim(); 
				if(theOption3.equals("-2")){ 
					check2 = "found"; 
					System.out.println("Taking you back to the shopping page"); 
					
					
				} 
				else if(theOption3.equals("0")){ 
					check2 = "found"; 
					System.out.println("Taking you to Checkout"); 
					System.out.println("");
					HWK4_pavlicpm.bool2=false; 
					HWK4_pavlicpm.customer.showBillingInfo();
					
				} 
			} 
		} 
	} 
	public static void changeTextFileContents(Item objectremoved){ 
		String name1=objectremoved.getnameofitem(); 
		
		try{ 
			FileReader FR = new FileReader(bookOrEbook);
			BufferedReader BR = new BufferedReader(FR); 
			FileWriter addanitem = new FileWriter("temp.txt", true);
			BufferedWriter addanitem1 = new BufferedWriter(addanitem);
					
			String stringRead2="test";
			while (stringRead2!=null){ 
				stringRead2 = BR.readLine(); 
				if (stringRead2!=null){ 
					if (!stringRead2.contains(name1)){ 
						addanitem1.write(stringRead2); 
						addanitem1.newLine(); 
					} 
					else if(stringRead2.contains(name1)&&objectremoved.getquantity()!=0){ 
							addanitem1.write(objectremoved.getInfoWithoutType()); 
							addanitem1.newLine(); 
					} 
				} 
			} 
			addanitem1.close();
			BR.close(); 
					
			FileWriter empty = new FileWriter(bookOrEbook, false);
			BufferedWriter empty1 = new BufferedWriter(empty); 
			empty1.write(""); 
			empty1.close(); 
					
			FileReader FR1 = new FileReader("temp.txt"); 
			BufferedReader BR1 = new BufferedReader(FR1);
			FileWriter addanitem2 = new FileWriter(bookOrEbook, true);
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
					
			FileWriter empty2 = new FileWriter("temp.txt", false);
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
	
	public static void changeAudioTextFileContents(Item objectremoved){ 
		String name1=objectremoved.getnameofitem(); 
		
		try{ 
			FileReader FR = new FileReader(CDorMP3);
			BufferedReader BR = new BufferedReader(FR); 
			FileWriter addanitem = new FileWriter("temp1.txt", true);
			BufferedWriter addanitem1 = new BufferedWriter(addanitem);
					
			String stringRead2="test"; 
			while (stringRead2!=null){ 
				stringRead2 = BR.readLine(); 
				if (stringRead2!=null){ 
					if (!stringRead2.contains(name1)){ 
						addanitem1.write(stringRead2); 
						addanitem1.newLine(); 
					} 
					else if(stringRead2.contains(name1)&&objectremoved.getquantity()!=0){
							addanitem1.write(objectremoved.getInfoWithoutType()); 
							addanitem1.newLine(); 
					} 
				} 
			} 
			addanitem1.close(); 
			BR.close(); 
					
			FileWriter empty = new FileWriter(CDorMP3, false);
			BufferedWriter empty1 = new BufferedWriter(empty);
			empty1.write("");
			empty1.close(); 
					
			FileReader FR1 = new FileReader("temp1.txt");
			BufferedReader BR1 = new BufferedReader(FR1); 
			FileWriter addanitem2 = new FileWriter(CDorMP3, true);
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
					
			FileWriter empty2 = new FileWriter("temp1.txt", false);
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

	public void showBillingInfo(){
		longestPurchasedItemName=0;
		longestQuantity=0;
		longestPrice=0;
		HWK4_pavlicpm.shopcart.billingArray();
		System.out.println("Billing Information:");
		System.out.println();
		for (int i=0; i< ShoppingCart.numValues; i++){
			if((ShoppingCart.names[i]).length()>longestPurchasedItemName){
				longestPurchasedItemName = ShoppingCart.names[i].length();
			}
		}
		
		for(int x=0; x<ShoppingCart.numValues; x++){
			for(int y=0; y<2; y++){
				if (Double.toString(ShoppingCart.bill[x][0]).length()>longestQuantity){
					longestQuantity = Double.toString(ShoppingCart.bill[x][0]).length();
				}
				if (Double.toString(ShoppingCart.bill[x][1]).length()>longestPrice){
					longestPrice = Double.toString(ShoppingCart.bill[x][1]).length();
				}
			}
		}
		
		billingInfo = new String [ShoppingCart.numValues][3];
		for (int r=0; r<ShoppingCart.numValues; r++){
			for (int t=0; t<3; t++){
				if(t==0){
					billingInfo[r][t]=ShoppingCart.names[r];
				}
				else{
					billingInfo[r][t]=Double.toString(ShoppingCart.bill[r][t-1]);
				}
			
			}
		}
		
		if(etaxLength<longestPurchasedItemName){
			numSpaces1 = new char[longestPurchasedItemName-a+8];
			Arrays.fill(numSpaces1, ' ');
		}
		else{
			numSpaces1 = new char[etaxLength-a+8];
			Arrays.fill(numSpaces1, ' ');
		}
		
		if(qLength<longestQuantity){
			numSpaces2 = new char[longestQuantity-qLength+3];
			Arrays.fill(numSpaces2, ' ');
		}
		else{
			numSpaces2 = new char[3];
			Arrays.fill(numSpaces2, ' ');
		}
		if(pLength<longestPrice){
			numSpaces3 = new char[longestPrice-pLength+3];
			Arrays.fill(numSpaces3, ' ');
		}
		else{
			numSpaces3 = new char[3];
			Arrays.fill(numSpaces3, ' ');
		}
		System.out.println("Name"+new String(numSpaces1)+"Quantity"+new String(numSpaces2)+"Price"+new String(numSpaces3));
		System.out.println();
		for (int itemNum=0; itemNum< ShoppingCart.numValues; itemNum++){
			
			if (etaxLength>billingInfo[itemNum][0].length()&&etaxLength>longestPurchasedItemName){
				numberSpace1 = new char[8+etaxLength-billingInfo[itemNum][0].length()];
				Arrays.fill(numberSpace1, ' ');
			}
			else if(etaxLength>billingInfo[itemNum][0].length()){
				numberSpace1 = new char[Math.abs(etaxLength-longestPurchasedItemName)+8+etaxLength-billingInfo[itemNum][0].length()];
				Arrays.fill(numberSpace1, ' ');
			}
			else{
				numberSpace1 = new char[longestPurchasedItemName-billingInfo[itemNum][0].length()+8];
				Arrays.fill(numberSpace1, ' ');
			}
			
			
			if(qLength>billingInfo[itemNum][1].length()&&qLength>longestQuantity){
				numberSpace2 = new char[3+qLength-billingInfo[itemNum][1].length()];
				Arrays.fill(numberSpace2, ' ');
			}
			else if(qLength>billingInfo[itemNum][1].length()){
				numberSpace2 = new char[Math.abs(qLength-longestQuantity)+3+qLength-billingInfo[itemNum][1].length()];
				Arrays.fill(numberSpace2, ' ');
			}
			else{
				numberSpace2 = new char[longestQuantity-billingInfo[itemNum][1].length()+3];
				Arrays.fill(numberSpace2, ' ');
			}
			
			
			if(pLength>billingInfo[itemNum][2].length()&&pLength>longestPrice){
				numberSpace3 = new char[3+pLength-billingInfo[itemNum][2].length()];
				Arrays.fill(numberSpace3, ' ');
			}
			else if(pLength>billingInfo[itemNum][2].length()){
				numberSpace3 = new char[Math.abs(pLength-longestPrice)+3+pLength-billingInfo[itemNum][2].length()];
				Arrays.fill(numberSpace3, ' ');
			}
			else{
				numberSpace3 = new char[longestPrice-billingInfo[itemNum][2].length()+3];
				Arrays.fill(numberSpace3, ' ');
			}
			
			System.out.println(billingInfo[itemNum][0]+new String(numberSpace1)+billingInfo[itemNum][1]+new String(numberSpace2)+billingInfo[itemNum][2]+new String(numberSpace3));
		}
		
		System.out.println();
	
		if (longestPurchasedItemName>etaxLength){
			etaxSpace1=new char[longestPurchasedItemName-etaxLength+2];
			Arrays.fill(etaxSpace1, ' ');
		}
		else{
			etaxSpace1=new char[2];
			Arrays.fill(etaxSpace1, ' ');
		}
		
		if (longestQuantity>qLength){
			etaxSpace2=new char[4+longestQuantity+3];
			Arrays.fill(etaxSpace2, ' ');
		}
		else{
			etaxSpace2=new char[4+qLength+3];
			Arrays.fill(etaxSpace2, ' ');
		}
		System.out.println("Environment Tax"+new String(etaxSpace1)+"2%"+new String(etaxSpace2)+ShoppingCart.EnvironmentTaxTotal);
		
		if (longestPurchasedItemName>etaxLength){
			hstSpace1=new char[longestPurchasedItemName-hstLength+2];
			Arrays.fill(hstSpace1, ' ');
		}
		else{
			hstSpace1=new char[etaxLength-hstLength+2];
			Arrays.fill(hstSpace1, ' ');
		}
		
		if (longestQuantity>qLength){
			hstSpace2=new char[3+longestQuantity+3];
			Arrays.fill(hstSpace2, ' ');
		}
		else{
			hstSpace2=new char[3+qLength+3];
			Arrays.fill(hstSpace2, ' ');
		}
		
		System.out.println("HST"+new String(hstSpace1)+"13%"+new String(hstSpace2)+ShoppingCart.HSTTotal);
		
		if (longestPurchasedItemName>etaxLength){
			shipSpace1=new char[longestPurchasedItemName-shipLength+2];
			Arrays.fill(shipSpace1, ' ');
		}
		else{
			shipSpace1=new char[etaxLength-shipLength+2];
			Arrays.fill(shipSpace1, ' ');
		}
		
		if (longestQuantity>qLength){
			shipSpace2=new char[3+longestQuantity+3];
			Arrays.fill(shipSpace2, ' ');
		}
		else{
			shipSpace2=new char[3+qLength+3];
			Arrays.fill(shipSpace2, ' ');
		}
		
		System.out.println("Shipping"+new String(shipSpace1)+"10%"+new String(shipSpace2)+ShoppingCart.ShippingTotal); 
		
		//// Formating the underline before the total ///////
		
		if(longestPrice>pLength){
			for(int len=0; len<longestPrice; len++){
				underlineSpace += "_";
			}
		}
		else{
			for (int len=0; len<pLength; len++){
				underlineSpace += "_";
			}
		}
		
		underSpace1=new char[a];
		Arrays.fill(underSpace1, ' ');
		underSpace2=new char[qLength+3];
		Arrays.fill(underSpace2, ' ');
		
		System.out.println(new String(underSpace1)+new String(numSpaces1)+new String(underSpace2)+underlineSpace);
		
		///// Formating the Total Line //////
		
		if (longestPurchasedItemName>etaxLength){
			totalSpace=new char[longestPurchasedItemName-totalLength+8];
			Arrays.fill(totalSpace, ' ');
		}
		else{
			totalSpace=new char[etaxLength-totalLength+8];
			Arrays.fill(totalSpace, ' ');
		}
		if (longestQuantity>qLength){
			totalSpace2=new char[longestQuantity+3];
			Arrays.fill(totalSpace2, ' ');
		}
		else{
			totalSpace2=new char[qLength+3];
			Arrays.fill(totalSpace2, ' ');
		}
		System.out.println("Total:"+new String(totalSpace)+new String(totalSpace2)+ShoppingCart.Total);
		
		String check4 = "";
		System.out.println();
		System.out.println("Are you sure you want to pay? yes or no:");
		while(!check4.equals("found")){
			String choice = yourChoice.nextLine();
			choice = choice.trim();
			choice = choice.toLowerCase();
			if(choice.equals("yes")){
				check4="found";
				confirmID=1000;//
				try{
					FileReader FR1 = new FileReader("ItemsBought.txt");
					BufferedReader BR1 = new BufferedReader(FR1);
					String stringRead6=BR1.readLine();	
					while (stringRead6!=null){
							confirmID++;
							stringRead6 = BR1.readLine();
						
					}
					BR1.close();
				}
				catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				catch(IOException ioe){
					System.out.println("There is a input/output error that was caught");
				}
				System.out.println("Confirmation ID: U"+confirmID);
				System.out.println("Items shipped to: Mr."+HWK4_pavlicpm.nameofuser);
				System.out.println();
				try{
					FileWriter bonus1 = new FileWriter("ItemsBought.txt", true);
					BufferedWriter Bonus1 = new BufferedWriter(bonus1);
					for(int r=0;r<ShoppingCart.numValues;r++){
						double answer=ShoppingCart.bill[r][0]*ShoppingCart.bill[r][1]+ShoppingCart.bill[r][2]+ShoppingCart.bill[r][3]+ShoppingCart.bill[r][4];
						answer=Math.round(answer*100.0)/100.0;
						Bonus1.write("U"+confirmID+", "+ShoppingCart.names[r]+", "+answer);
						Bonus1.newLine();
					}
					Bonus1.close();
				}
				catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				catch(IOException ioe){
					System.out.println("There is a input/output error that was caught");
				}	
				FileWriter addanitem5;
				try {
					addanitem5 = new FileWriter(HWK4_pavlicpm.filename, false);
					BufferedWriter addanitem6 = new BufferedWriter(addanitem5);
					addanitem6.write("");
					addanitem6.close();
				} 
				catch (IOException e) {
					e.printStackTrace();
				}
				try{
					FileWriter addanitem7 = new FileWriter("temp_"+HWK4_pavlicpm.nameofuser+".txt", false);
					BufferedWriter addanitem8 = new BufferedWriter(addanitem7);
					addanitem8.write("");
					addanitem8.close();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			
				try{
					FileWriter file1 = new FileWriter("boughtinfo.txt", true);
					BufferedWriter file2 = new BufferedWriter(file1);
					file2.write(HWK4_pavlicpm.nameofuser+",U"+confirmID);
					file2.newLine();
					file2.close();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("Redirecting you back to Browse Item Page.");
				ShoppingCart.numValues=0;
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
			if(choice.equals("no")){
				check4="found";
				System.out.println("No transaction processed, payment cancelled. Taking you back to Browse Item Page.");
				System.out.println("");
			}
			else if(!(choice.equals("yes")||choice.equals("no"))){
				check4="";
				System.out.println("Please enter a valid response, yes or no:");
			}
			
		}
	} 
}