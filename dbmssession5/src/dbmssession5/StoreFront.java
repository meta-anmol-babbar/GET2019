package dbmssession5;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class StoreFront {
	
	// Instance variables.
		protected MysqlConnection mysqlconn;
		protected Connection cn;
		protected Statement stmt;
		ResultSet rs;
		
		// Constructor.
		public StoreFront() {
			try {
				 mysqlconn = new MysqlConnection("Storefront","root","abc123");
				 cn = (Connection) mysqlconn.getConnection();
				 stmt = (Statement) cn.createStatement();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	/**
	 * Assignment 1
	 * 
	 * @return
	 */

	public List<Orders> getOrders(int id) {
		List<Orders> ordersList = new ArrayList<Orders>();
		String query = "SELECT o.order_id,o.date,SUM(p.product_price*c.product_qty) AS order_total "
				+ "FROM shopperorder AS o,cart_list AS c,products AS p "
				+ "WHERE o.cart_id = c.cart_id AND c.product_id = p.product_id And c.user_id = 5 "
				+ "GROUP BY order_id "
				+ "ORDER BY o.date;";
		
		try{
			rs=(ResultSet) stmt.executeQuery(query);
			while(rs.next()){
				Orders ord = new Orders();
				ord.setOrderId(rs.getInt(1));
				ord.setDate(rs.getDate(2));
				ord.setOrder_total(rs.getInt(3));
				ordersList.add(ord);
			}
		}
		catch(SQLException se){
			se.printStackTrace();
		}
	
		return ordersList;

	}

}
