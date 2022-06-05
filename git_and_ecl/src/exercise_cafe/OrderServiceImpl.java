package exercise_cafe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

	private String orderMenu;
	private int orderCup;
	
	static Map<String, Integer> menuBoard = new TreeMap<String, Integer>();
	Map<String, Integer> orderList = new TreeMap<String, Integer>();
	
	@Override
	public void welcome() {}
	
	@Override
	public void order() throws IOException {
		System.out.println("============================================");
		System.out.printf("%12s %17s %s %s \n", "MENU", CupSize.TALL, CupSize.GRANDE, CupSize.VENTI);
		Iterator<String> iter = menuBoard.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.printf("[ %-10s ] \t %5d %5d %5d \n", key, 
					menuBoard.get(key), menuBoard.get(key)+500, menuBoard.get(key)+1000);
		}
		System.out.println("============================================");
		
		while(true) {
			try {
				BufferedReader om = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("주문하실 메뉴를 선택해주세요. (완료 시 0을 입력해주세요.) >> ");
				if(om.readLine()=="0") break;
				setOrderMenu(om.readLine());
				om.close();
			} catch (IOException e) {
				System.out.println("메뉴판에 있는 메뉴를 주문해주세요.");
			}
			
			System.out.println();
			System.out.print("몇 잔 드릴까요? >> ");
			
			try(BufferedReader oc = new BufferedReader(new InputStreamReader(System.in))) {
				setOrderCup(oc.read());
			} catch (IOException e) {
				System.out.println("올바른 값을 입력해주세요.");
			}
			
			orderList.put(getOrderMenu(), getOrderCup());
			
		} // while
		
	} // order
	
	@Override
	public void orderCheck() {
		DecimalFormat df = new DecimalFormat("###,###");
		int orderSum=0;
		
		System.out.println("주문 확인하겠습니다. ");
		Iterator<String> iter = orderList.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.print(key + " " + orderList.get(key) + "잔 ");
			orderSum += orderList.get(key);
		}
		System.out.println("주문받았습니다. 총 " + df.format(orderSum) + "원입니다.");
	} // orderCheck
	
	@Override
	public void pickup() {}
} // end Order