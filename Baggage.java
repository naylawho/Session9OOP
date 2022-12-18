package session9;

public class Baggage extends Ticket {
	private int bagAmount;
	private String bagType;
	
	public Baggage(String name, int quantity, int seatNum, int bagAmount, String bagType) {
		super(name, quantity, seatNum);
		this.bagAmount = bagAmount;
		this.bagType = bagType;
	}
	public int getBagAmount() {
		return bagAmount;
	}
	public void setBagAmount(int bagAmount) {
		this.bagAmount = bagAmount;
	}
	public String getBagType() {
		return bagType;
	}
	public void setBagType(String bagType) {
		this.bagType = bagType;
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
