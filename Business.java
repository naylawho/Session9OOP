package session9;

public class Business extends Ticket{
	String meal;
	
	public Business(String name, int quantity, int seatNum, String meal) {
		super(name, quantity, seatNum);
		this.meal = meal;
	}

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	@Override
	protected Object getdrinkType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Object getfoodType() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
