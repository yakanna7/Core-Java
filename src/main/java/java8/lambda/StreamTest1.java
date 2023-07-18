// Java example program to implement stream operations
package java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Order {
	enum Side {
		BUY, SELL;
	}

	private final String symbol;
	private final int quantity;
	private double price;
	private final Side side;

	public Order(String symbol, int quantity, double price, Side side) {
		this.symbol = symbol;
		this.quantity = quantity;
		this.price = price;
		this.side = side;
	}

	public double price() {
		return price;
	}

	public void price(double price) {
		this.price = price;
	}

	public String symbol() {
		return symbol;
	}

	public int quantity() {
		return quantity;
	}

	public Side side() {
		return side;
	}
}

public class StreamTest1 {

	public static void main(String args[]) {
		// Initialization of Collection
		List<Order> orderBook = new ArrayList<>();
		Order buyGoogle = new Order("GOOG.NS", 300, 900.30, Order.Side.BUY);
		Order sellGoogle = new Order("GOOG.NS", 600, 890.30, Order.Side.SELL);
		Order buyApple = new Order("APPL.NS", 400, 552, Order.Side.BUY);
		Order sellApple = new Order("APPL.NS", 200, 550, Order.Side.SELL);
		Order buyGS = new Order("GS.NS", 300, 130, Order.Side.BUY);
		orderBook.add(buyGoogle);
		orderBook.add(sellGoogle);
		orderBook.add(buyApple);
		orderBook.add(sellApple);
		orderBook.add(buyGS);
		// Java 8 Streams Example 1 : Filtering Collection elements
		// Filtering buy and sell order using filter() method of
		// java.util.Stream class
		Stream<Order> stream = orderBook.stream();
		Stream buyOrders = stream.filter((Order o) -> o.side().equals(
				Order.Side.BUY));
		System.out.println("No of Buy Order Placed :" + buyOrders.count());
		Stream<Order> sellOrders = orderBook.stream().filter(
				(Order o) -> o.side() == Order.Side.SELL);
		System.out.println("No of Sell Order Placed : " + sellOrders.count());
		// Java 8 Streams Example 2 : Reduce or Fold operation
		// Calculating total value of all orders
		double value = orderBook.stream().mapToDouble((Order o) -> o.price())
				.sum();
		System.out.println("Total value of all orders : " + value);
		long quantity = orderBook.stream().mapToLong((Order o) -> o.quantity())
				.sum();
		System.out.println("Total quantity of all orders : " + quantity);
	}
}
