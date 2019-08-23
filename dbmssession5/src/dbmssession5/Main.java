package dbmssession5;

import java.sql.SQLException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws SQLException {
		StoreFront sf = new StoreFront();
		// query 1
		
		System.out.println("query 1");
		List<Orders> output_orders;
		
		output_orders = sf.getOrders(5);
		System.out.format("|%5s |%15s  | %15s| \n", "Order_id", "Order_date",
				"Örder_total");
		System.out.println("----------------------------------------------");
		for (Orders o : output_orders) {
			System.out.format("|%8s |%15s  | %15s| \n", o.getOrderId(), o
					.getDate().toString(), o.getOrder_total());
		}
		System.out.println();
		//query 2
		System.out.println("query 2");
		
		//query 3
		System.out.println("query 3");
		int output=sf.deleteProductsNotOrdered();
		System.out.println(output + " rows deleted\n");
	
		
		//query 4
		System.out.println("query 4");
		List<TopCategory> topCategories;
		topCategories = sf.getCategoryDetail();
		System.out.format("\n|%5s |%15s| \n", "Top_Categories", "Number_Of_Childs");
		System.out.println("----------------------------------");
		for (TopCategory c : topCategories) {
			System.out.format("|%14s |%16s| \n", c.getCategoryName(), c.getNumberOfChilds());
		}
	
		
	}

}
