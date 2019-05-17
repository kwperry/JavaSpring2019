package LAB5;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
public class LAB5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> stadiumNames = new LinkedList<String>();
		LinkedList<Double> gameRevenue = new LinkedList<Double>();
		Scanner keyboard = new Scanner(System.in);
		Iterator<String> namesItr;
		Iterator<Double> revItr;
		double total = 0;
		String stadiumName;
		
		String name = "";
		double rev;
		
		while(!name.equals("done"))
		{
			System.out.print("Enter the team name and their revenue for the game: ");
			name = keyboard.next();
			
			if(!name.equals("done"))
			{	
				rev = keyboard.nextDouble();
				stadiumNames.add(name);
				gameRevenue.add(rev);
			}
		}
		
		namesItr = stadiumNames.iterator();
		revItr = gameRevenue.iterator();
		while(namesItr.hasNext() && revItr.hasNext())
		{
			System.out.println(namesItr.next() + " $" + revItr.next());
			
		}
		System.out.print("What stadium would you like to see the total for? ");
		stadiumName = keyboard.next();
		
		namesItr = stadiumNames.iterator();
		revItr = gameRevenue.iterator();
		
		while(namesItr.hasNext() && revItr.hasNext())
		{
			String next = namesItr.next();
			if(next.equals(stadiumName))
			{
				total += revItr.next();
			}else {
				revItr.next();
			}
			
		}		
		System.out.println("The total is: $" + total);
	}

}
