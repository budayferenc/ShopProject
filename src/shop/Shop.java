package shop;

public class Shop {
	protected String name;
	protected String address;
	protected String owner;
	protected Milk[] milkBar;
	protected int flag;

	public Shop(String name, String address, String owner, Milk[] milkBar) {
		this.name = name;
		this.address = address;
		this.owner = owner;
		this.milkBar = milkBar;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getOwner() {
		return owner;
	}
	
	public boolean isHaveMilk() {
		return milkBar.length > 0;
	}
	
}
