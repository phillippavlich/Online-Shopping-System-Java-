/* Name: Phillip Pavlich, Matthew Shortt, Ivan Bauer
 * MacID: pavlicpm, shorttmk, bauerim
 * Student Number: 1414960, 1417616, 1418765
 * Description: Class called user to deal with any signing up users
 * that wish to be added to the system. 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter; 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter; 
import java.io.IOException; 
import java.util.Scanner; 

public class User{ 
	static Scanner choose=new Scanner(System.in); 
	private String username; 
	static Boolean dup;
	public String getUsername(){
		dup=true;
		System.out.println("Choose your username: "); 
		username= choose.next();
		try{
			FileReader duplicate = new FileReader("Users.txt");
			BufferedReader duplicate1 = new BufferedReader(duplicate);
			String stringread = duplicate1.readLine();
			while(stringread != null){
				if (username.equals(stringread)){
					dup=false;
				}
				stringread=duplicate1.readLine();
			}
		
			duplicate1.close();
		}
		catch( FileNotFoundException fnfe ){ 
			System.out.println( "Unable to find file!" );
		}
		catch (IOException ioe){
			System.out.println("There is a input/output error that was caught"); 
		}
		
		if (dup){
			try{
				FileWriter customer1 = new FileWriter("Users.txt", true);
				BufferedWriter cust1 = new BufferedWriter(customer1);
				cust1.newLine();
				cust1.write(username);
				cust1.close();
				System.out.println("Choose a password");
				String passw=choose.next();
				FileWriter pass = new FileWriter("password.txt", true);
				BufferedWriter pass1 = new BufferedWriter(pass);
				pass1.newLine();
				pass1.write(username+","+passw);
				pass1.close();
				System.out.println("Username succesfully added");
			}
			catch( FileNotFoundException fnfe ){ 
				System.out.println( "Unable to find file!" );
			} 
			catch (IOException ioe){
				System.out.println("There is a input/output error that was caught"); 
			}
		}
		else{
			System.out.println("That username already exists");
		}
	
		return username;
	}
		
} 
