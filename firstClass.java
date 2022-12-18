package session9;

public class firstClass extends Ticket {
	String drinkType;

	public firstClass(String name, int quantity, int seatNum, String drinkType) {
		super(name, quantity, seatNum);
		this.drinkType = drinkType;
	}

	public String getDrinkType() {
		return drinkType;
	}

	public void setDrinkType(String drinkType) {
		this.drinkType = drinkType;
	}

	@Override
	protected Object getdrinkType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Object getMeal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Object getfoodType() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
