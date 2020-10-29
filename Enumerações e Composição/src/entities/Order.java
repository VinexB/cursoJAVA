package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	
	private Integer ID;
	private Date moment;
	private OrderStatus status;
	
	public Order() {
		
	}

	public Order(Integer iD, Date moment, OrderStatus status) {
		ID = iD;
		this.moment = moment;
		this.status = status;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [ID=" + ID + ", moment=" + moment + ", status=" + status + "]";
	}

	
	
}
