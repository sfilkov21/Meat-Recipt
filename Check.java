import java.util.Scanner;

public class Check 
{

	public static void main(String[] args) 
	{
		String appetizer; 
		double priceAppetizer;
		Scanner myScan = new Scanner(System.in);
		System.out.print("Please enter the name of your appetizer: ");
		appetizer = myScan.nextLine();
		System.out.print("Please enter the price of your appetizer: ");
		String str = myScan.nextLine();
		priceAppetizer = Double.parseDouble(str);
		
		String entree;
		double priceEntree;
		System.out.print("Please enter the name of your entree: ");
		entree = myScan.nextLine();
		System.out.print("Please enter the price of your entree: ");
		str = myScan.nextLine();
		priceEntree = Double.parseDouble(str);
		
		String dessert; 
		double priceDessert;
		System.out.print("Please enter the name of your dessert: ");
		dessert = myScan.nextLine();
		System.out.print("Please enter the price of your dessert: ");
		str= myScan.nextLine();
		priceDessert = Double.parseDouble(str);
		
		String drink;
		double priceDrink;
		System.out.print("Please enter the name of your drink: ");
		drink = myScan.nextLine();
		System.out.print("Please enter the price of your drink: ");
		str = myScan.nextLine();
		priceDrink = Double.parseDouble(str);
		
		double tip; 
		System.out.print("Please enter what percentage would you like to tip as a decimal: ");
		str = myScan.nextLine();
		tip = Double.parseDouble(str);
		
		double subtotal = priceAppetizer + priceEntree + priceDessert + priceDrink ;
		double tax = subtotal * 0.06;
		double endtip = subtotal*tip;
		double total = subtotal + tax + endtip;
		
		System.out.println("\n\n\nItem			Price");
		System.out.println(appetizer + "		$" + priceAppetizer);
		System.out.println(entree + "        $" + priceEntree);
		System.out.println(dessert + "			$" + priceDessert);
		System.out.println(drink + "		$" + priceDrink);
		System.out.println("\nSubtotal		$" + Math.round(subtotal * 100.0)/100.0);
		System.out.println("Tax             $" + Math.round(tax * 100.0)/100.0);
		System.out.println("Tip @" + (int)(tip*100) +"%        $" + Math.round(endtip * 100.0)/100.0);
		System.out.println("Total           $" + Math.round(total * 100.0)/100.0);
		
		
	}

}
