package exercise_cafe;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
	private String orderMenu;
	private int orderCup;
	
	public Order(String orderMenu, int orderCup) {
		this.orderMenu = orderMenu;
		this.orderCup = orderCup;
	} // constructor
} // end Order

interface Orderable {
	public void welcome();
	public void order();
	public void pickup();
} // end Orderable