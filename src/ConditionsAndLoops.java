
public class ConditionsAndLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create a variable named age and assign it a value of 14 
		int age = 14;
		
		//print the boolean expression >= 16 to the console adn not the results
		//change the value of the age to 18 and run again
		
		System.out.println( age >= 16);
		age = 18;
		System.out.println( age >= 16);
		
		// using a conditional, print "You can drive" if age is greater than or equal to 16
		// and "You cannot drive" otherwise
		// change the value of age and rerun to see the result 
		
		boolean hasLicense = true;
		
		if (age >= 16 && hasLicense) {
			System.out.println("You can drive");
		} else {
			System.out.println("You cannot drive");
		}
		
			
		//add a new variable called hasLicense before the conditional
		// change the boolean expression in the conditional to additionally include the need for hasLicense to be true
		// try to chaning the values of age and hasLicense and note the different results
		
	
		// create two new variables - costOfMilk and thirstLevel
		// create a new conditional that prints "Milk Please if the costOfMilk is less than 2.50
		// of it thristLevel is greater than 6 and prints "No Thanks" otherwise
		// change the values and note the different results
		
		double costOfMilk = 2.50;
		int thirstLevel = 5;
		
		if (costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk Please");
		} else {
			System.out.println("No Thanks");
		}
		
		// create two variables called numberOfCookies and numberOfChildren
		//you will evenly distribute all of the cookies to the children and as the adult
		//you get to keep the remaining cookies to yourself
		//use a conditional to print the following based on the following conditions:
		//if there are 0 cookies remaining print "Sad Face"
		//if there are less than 2 cookies, print "Yes!"
		//If there are less than 5 cookies, print "Whoohoo!"
		//if there are 5 or more cookies, print "Jackpot!"

	
		int numberOfCookies = 20;
		
		int numberOfChildren = 10;
		
		
		if (numberOfCookies % numberOfChildren >= 5) {
			System.out.println("Jackpot");
		} else if (numberOfCookies % numberOfChildren >= 2) {
			System.out.println("Woohoo!");
		} else if (numberOfCookies % numberOfChildren > 0) {
			System.out.println("Yes!");
		} else {
			System.out.println("Sad Face");
		}
		
		//or could have done it as 
		
		int remainingCookies = numberOfCookies % numberOfChildren;
		
		if (remainingCookies >= 5) {
			System.out.println("Jackpot");
		} else if (remainingCookies >= 2) {
			System.out.println("Woohoo!");
		} else if (remainingCookies > 0) {
			System.out.println("Yes!");
		} else {
			System.out.println("Sad Face");
		}
		
		//create a variable called loyaltyMemberStatus and assign the value "Silver"
		//create a variable called loyaltyMemberDiscount and assign the value 0.0
		//using a switch, set the value of the loyaltyMemberDiscount based on the following loyaltyMemberStauts scale
		//"SILVER" is 0.10, "GOLD" is 0.15, and "PLATINUM is 0.25
		
		String loyaltyMemberStatus = "GOLD";
		double loyaltyMemberDiscount = 0.0;
		
		switch (loyaltyMemberStatus) {
			case "SILVER":
				loyaltyMemberDiscount = .1; 
				break;
			case "GOLD":
				loyaltyMemberDiscount = .15; 
				break;
			case "PLATINUM":
				loyaltyMemberDiscount = .25; 
				break;
	
		}
		
		System.out.println(loyaltyMemberDiscount);	
	
		//create a variable called billTotal and assign a value
		//create a variable called adjustedTotal and assign it to the BillTotal minus the 
		//loyaltyMemberDiscount percent of the billTotal
		//if the adjustedBillTotal is greater than $500 upgrade the loyaltyMemberStatus from SILVER to GOLD 
		//or GOLD to PLatinum
		
		double billTotal = 610.43;
		double adjustedTotal = billTotal - loyaltyMemberDiscount*billTotal;
			System.out.println(adjustedTotal);	
			
			
		if (adjustedTotal > 500) {
			if (loyaltyMemberStatus == "SILVER") {
				loyaltyMemberStatus = "GOLD";
			}else if (loyaltyMemberStatus == "GOLD") {
				loyaltyMemberStatus = "PLATINUM";
			}
		}
	
		System.out.println(loyaltyMemberStatus);
	
		
		//create two variables, username and password
		//create a conditional that prints "login successful" if the username is "Tommy123" and 
		//the password is "12345"
		//otherwise, print "access denied" 
		
		String username = "Tommy123";
		String password = "1234";
		
		if (username.equals("Tommy123") && password.equals("12345")) {
			System.out.println( "login successful");
		} else {
			System.out.println("access denied");
		}
		
		
		//write a for loop that prints each number from 0 to 9
		
		for (int x = 0; x < 10; x++) {
			System.out.println(x);
		}
		
		//write a for loop that prints each number from 10 to 0 backwards
		
		for (int x = 10; x >= 0; x = x - 1) {
			System.out.println(x);
		}
		
		//rite a for loop that prints every other number from 0 to 100
		
		for (int x = 0; x <= 100; x = x + 2) {
			System.out.println(x);
		}
		
		//write a for loop that interates from 0 to 100 and prints "EVEM" if the number is evan
		//and "ODD" is it's odd 
		
		for (int x = 0; x <= 100; x++) {
			if (x % 2 == 0) {
				System.out.println("EVEN");
			} else {
				System.out.println("ODD");
			}
	
			
			
		}
		
		//write a while loop that start at 100 and iterates backwards by 1 until it reaches 0
		//divide each number by 3 and print the remainder to the console
		
		int k = 100;
		while (k > 0) {
			System.out.println(k + " " + (k % 3));
			k--;
			
	
			
		}
		
			
		
}
	

}
