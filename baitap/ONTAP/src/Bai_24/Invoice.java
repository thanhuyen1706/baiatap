package Bai_24;

public class Invoice {
	private int id;
	private Customer customer;
	private double amount;

	public Invoice(int id, Customer customer, double amount) {
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmout(double amount) {
		this.amount = amount;
	}

	public int getCustomerId() {
		return customer.getId();
	}

	public String getCustomerName() {
		return customer.getName();
	}

	public double getCustomerDiscount() {
		return customer.getDiscount();
	}

	public double getAmountAfterDiscount() {
		double discount = customer.getDiscount();
		amount -= amount * discount / 100;
		return amount;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", customer=" + getCustomerName() + "(" + getCustomerId() + ")" + "("
				+ getCustomerDiscount() + "%)" + ", amount=" + amount + "]";
	}
}
