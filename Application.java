// Homework 3. Class Laptop, class User, class Application, sorting of laptops.   

import java.io.*;
import java.util.*;
import java.text.*;
import java.lang.*;


class Application {
	public static void main(String [] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input number of Laptops: ");
		int r = Integer.parseInt(reader.readLine());
				
		Laptop[] laps = new Laptop[r];
		
		for(int i=0; i < laps.length; i++) {// Filling array of users and laptops using 2 auto methods
			laps[i] = new Laptop();
			User user = new User();	
		
			laps[i].setSize(setRandom("size"));
			laps[i].setPrice(setRandom("price"));
			user.setName(setRandomHuman("name"));
			user.setLastName(setRandomHuman("lastName"));
			laps[i].setUser(user);
			
			if(i % 10 == 0){
				System.out.println("\nSize:\tPrice:\tName:\tLastname:");
			}
			System.out.println(laps[i].getSize() + "\t" + laps[i].getPrice() + "\t" + laps[i].getUser().getName() + "\t" + laps[i].getUser().getLastName());	
		}				
		System.out.print("Choose method of sorting by bubble for Laptops:\n(1) - Size\t(2) - Price\n");
		sortBubble(reader.readLine(), laps);				
	}
	
	static void sortBubble(String param, Laptop [] laps) {
		double val1=0, val2=0;
		String s = null;
		for(int i = laps.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(param.equals("1")) {
					val1 = laps[j].getSize();
					val2 = laps[j+1].getSize();
					s = "SIZE";
				}
					
				if(param.equals("2")) {
					val1 = laps[j].getPrice();
					val2 = laps[j+1].getPrice();
					s = "PRICE";
				}
					
				if(val1 < val2) {
					Laptop a = laps[j];
					laps[j] = laps[j+1];
					laps[j+1] = a;
				}
			}
				
			if(i % 10 == 0){				
				System.out.println("\nSORTED LIST BY " + s + " :\nSize:\tPrice:\tName:\tLastname:");
			}				
			System.out.println(laps[i].getSize() + "\t" + laps[i].getPrice() + "\t" + laps[i].user.getName() + "\t" + laps[i].user.getLastName());	
		}			
	}

	static double setRandom(String param) { // use this method (double) for automation in future
		double num = 0;
		if(param.equals("size")){
			num = Math.round((10 + (Math.random()*(18 - 10))) * 10) / 10;
		} 
		else if (param.equals("price")){
			num = Math.round((500.00 + (Math.random()*(3500.00 - 500.00))) * 100.0) / 100.0;		
		}				
		return num;
	}
		
	static String setRandomHuman(String param) { // use this method (String) for automation in future
		Random r = new Random();
		
		if (param.equals("name")) {
			String [] arrayOfNames = {"Ivan", "Olga", "John", "Mila", "Alex", "Katya", "Serj", "Teffi", "Jim", "Anna", "Jack",
									"Elza", "Boris", "Kendra", "Han", "Emma", "Igor'", "Julia", "Peter", "Kelly", "Grag"};
			param = arrayOfNames[r.nextInt(arrayOfNames.length)];
		} 
		else if(param.equals("lastName")){
			String [] arrayOfLastNames = {"Ivanov(a)", "Kim", "Kirk", "Smirnov(a)", "Backham", "Black", "Snow", "Strong", "Key",
										"Tramp", "Hall", "Lesin(a)", "Point", "Carter", "Durov(a)", "Hit", "Burg", "Valdau"};
			param = arrayOfLastNames[r.nextInt(arrayOfLastNames.length)];
		}			
		return param;
	}	
}

class Laptop {
	
	private double price;
	private double size;
	User user;
			
	Laptop () {
		price = 1000d;
		size = 15.4d;
	}	
	
	Laptop (double myPrice, double mySize) {
	price = myPrice;
	size = 	mySize;		
	}
	
	public User getUser () {
		return user;		
	}
	
	public void setUser (User userS) {
		user = userS;			
	}
	
	public double getPrice () {
		return price;		
	}
	
	public void setPrice (double myPrice) {
		price = myPrice;		
	}
	
	public double getSize () {
		return size;
	}
	
	public void setSize (double mySize) {
		size = mySize;
	}
}

class User {
	private String name;
	private String lastName;
	
	User () {
		name = "No name";
		lastName = "No lastname";
	}
	
	User (String myName, String myLastName) {
		name = myName;
		lastName = myLastName;		
	}
	
	public String getName () {
		return name;		
	}
	
	public void setName(String myName) {
		name = myName;	
	}
	
	public String getLastName () {
		return lastName;	
	}
	
	public void setLastName(String myLastName) {
		lastName = myLastName;
	}
}
