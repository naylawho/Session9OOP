package session9;

public class Economy extends Ticket{
	String foodType;

	public Economy(String name, int quantity, int seatNum, String foodType) {
		super(name, quantity, seatNum);
		this.foodType = foodType;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
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
