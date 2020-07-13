package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Client date:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		
		Client client = new Client(name, email, sdf.parse(sc.next()));
		
		System.out.println("Enter order date: ");
		
		System.out.print("Status: ");
		String orderStatus = sc.next();
		System.out.print("How many items to this order? ");
		int item = sc.nextInt();
		
		for (int i = 1; i <=item; i++) {
			sc.nextLine();
			System.out.println("Enter #"+i+" item data:");
			System.out.print("Product name: ");
			String nameItem = sc.nextLine();
			System.out.print("Product price: ");
			double priceProduct = sc.nextDouble();
			System.out.print("Quantitys: ");
			int quantitys = sc.nextInt();
			Product product = new Product(nameItem, priceProduct);
			OrderItem item2 = new OrderItem(quantitys, priceProduct, product);
		}
		
		Order order = new Order(new Date(),OrderStatus.valueOf(orderStatus), client);
		
		
		
		
		System.out.println(order);
		
		
		
		
		sc.close();
	}

}
