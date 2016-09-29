package shop;

import java.time.LocalDateTime;

public class Milk {
	protected int capacity;
	protected String manufacturer;
	protected LocalDateTime warranty;
	protected double fat;
	protected long price;
	
	public Milk(int capacity, String manufacturer, LocalDateTime warranty, double fat, long price) {
		this.capacity = capacity;
		this.manufacturer = manufacturer;
		this.warranty = warranty;
		this.fat = fat;
		this.price = price;
	}
	
		public int getCapacity() {
		return capacity;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public LocalDateTime getWarranty() {
		return warranty;
	}

	public double getFat() {
		return fat;
	}

	public long getPrice() {
		return price;
	}

	public boolean isGood(){
		return LocalDateTime.now().isBefore(getWarranty());
	}

	@Override
	public String toString() {
		return "Milk [capacity=" + capacity + ", manufacturer=" + manufacturer + ", warranty=" + warranty + ", fat="
				+ fat + ", price=" + price + "]";
	}
}