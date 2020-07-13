package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date date;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList<>();

	public Order() {

	}

	public Order(Date date, OrderStatus status, Client client) {
		this.date = date;
		this.status = status;
		this.client = client;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public double total() {

		double sum = 0;
		for (OrderItem oi : items) {

			sum += oi.subTotal();

		}

		return sum;
	}

}
