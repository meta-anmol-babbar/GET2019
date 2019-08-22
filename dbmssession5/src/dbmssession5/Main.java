package dbmssession5;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Orders> output_orders;
		StoreFront sf = new StoreFront();
		output_orders=sf.getOrders(5);
		System.out.format("|%5s |%15s  | %15s| \n","Order_id","Order_date","Örder_total");
		System.out.println("----------------------------------------------");
		for (Orders o:output_orders ) {
			
			System.out.format("|%8s |%15s  | %15s| \n",o.getOrderId(),o.getDate().toString(),o.getOrder_total());
		
		}
	}

}
