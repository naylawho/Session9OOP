package session9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
	ArrayList<Ticket> ticketList = new ArrayList<>();

	public void addTicket() { // kita add tiket ke dlm arrayList
		String name;
		int quantity;
		int seatNum;
		int bagAmount;
		String bagType;
		String flightType;
		String drinkType;
		String meal;
		String foodType;

		do {
			System.out.print("Input your name [3-10]: ");
			name = scan.nextLine();
		} while (name.length() < 3 || name.length() > 10);

		do {
			System.out.print("Input the quantity of the ticket: ");
			quantity = scan.nextInt();
			scan.nextLine();
		} while (quantity < 0);

		do {
			System.out.print("Input your seat number [1-50]: ");
			seatNum = scan.nextInt();
			scan.nextLine();
		} while (seatNum < 1 || seatNum > 50);

		do {
			System.out.print("Input your bag amount: ");
			bagAmount = scan.nextInt();
			scan.nextLine();
		} while (bagAmount < 0);

		do {
			System.out.print("Input your bag type [Luggage | Backpack]: ");
			flightType = scan.nextLine();
		} while (!(flightType.equals("Luggage") || flightType.equals("Backpack")));

		do {
			System.out.print("Input your flight class type [First Class | Business | Economy]: ");
			flightType = scan.nextLine();
		} while (!(flightType.equals("First Class") || flightType.equals("Business") || flightType.equals("Economy")));

		if (flightType.equals("First Class")) {
			do {
				System.out.print("Input your drink type [Wine | Tea | Coffee]: ");
				drinkType = scan.nextLine();
			} while (!(drinkType.equals("Wine") || drinkType.equals("Tea") || drinkType.equals("Coffee")));

			// menambahkan ticket tipe first class ke dalam arraylist
			ticketList.add(new firstClass(name, quantity, seatNum, drinkType));

		} else if (flightType.equals("Business")) {
			do {
				System.out.print("Input your meal [Main Course | Dessert Only]: ");
				meal = scan.nextLine();
			} while (!(meal.equals("Main Course") || meal.equals("Dessert Only")));
			ticketList.add(new Business(name, quantity, seatNum, meal));

		} else if (flightType.equals("Economy")) {
			do {
				System.out.print("Input your food type [Noodle | Pudding | Bread]: ");
				foodType = scan.nextLine();
			} while (!(foodType.equals("Noodle") || foodType.equals("Pudding") || foodType.equals("Bread")));
			ticketList.add(new Economy(name, quantity, seatNum, foodType));
		}

		System.out.println("");
		System.out.println("Your flight ticket was succesful!");
		System.out.println("Enter to continue");
		scan.nextLine();

	}

	public void viewTicket() {
		int count = 0;
		if (ticketList.isEmpty()) {
			System.out.println("There is no Ticket for your flight!");
			System.out.println("Please enter to continue");
			scan.nextLine();
		} else {
			System.out.println(
					"==================================================================================================================");
			System.out.printf("| %-3s | %-20s | %-15s | %-7s | %-8s | %-12s | %-7s | %-10s | %-10s | %-10s |\n", "No", "Name",
					"Quantity", "Seat Number", "Bag Amount", "Bag Type", "Flight Type", "Drink Type", "Meal",
					"Food Type");
			System.out.println(
					"==================================================================================================================");
			for (Ticket ticket : ticketList) {
				count++;
				if (ticket instanceof firstClass) {
					System.out.printf("| %-3s | %-20s | %-15s | %-7s | %-8s | %-12s | %-7s | %-10s |%-10s |\n",
							count, ticket.getName(), ticket.getQuantity(), ticket.getSeatNum(), ((Baggage)ticket).getBagAmount(), 
							((Baggage)ticket).getBagType(), ticket.getFlightType(), ticket.getDrinkType());
				} else if (ticket instanceof Business) {
					System.out.printf("| %-3s | %-20s | %-15s | %-7s | %-8s | %-12s | %-7s | %-10s |%-10s |\n",
							count, ticket.getName(), ticket.getQuantity(), ticket.getSeatNum(), ((Baggage)ticket).getBagAmount(), 
							((Baggage)ticket).getBagType(), ticket.getFlightType(), ticket.getMeal());
				} else if (ticket instanceof Economy) {
					System.out.printf("| %-3s | %-20s | %-15s | %-7s | %-8s | %-12s | %-7s | %-10s |%-10s |\n",
							count, ticket.getName(), ticket.getQuantity(), ticket.getSeatNum(), ((Baggage)ticket).getBagAmount(), 
							((Baggage)ticket).getBagType(), ticket.getFlightType(), ticket.getFoodType());
				}
			}
			System.out.println(
					"==================================================================================================================");
			System.out.println("");
			System.out.println("Press enter to continue");
			scan.nextLine();

		}

	}

	public void buyTicket() {

	}

	public Main() {
		// TODO Auto-generated constructor stub
		int input;
		do {
			System.out.println("Flights");
			System.out.println("=================");
			System.out.println("1. View Ticket");
			System.out.println("2. Add Ticket");
			System.out.println("3. Buy Ticket");
			System.out.println("4. Exit");
			System.out.print("Choose >> ");

			input = scan.nextInt();
			scan.nextLine();

			if (input == 1) {
				viewTicket();
			} else if (input == 2) {
				addTicket();
			} else if (input == 3) {
				buyTicket();
			}

		} while (input != 4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
