package free;

public class ExecuteClass {
	public static void main(String[] args) {
		//생성자에 들어갈 초기값
		String userOrderMenu = null;
		int userOrderCup = 0;
		
		//다형성 사용을 위한 억지 객체생성
		Order order = new Starbucks("", userOrderMenu, userOrderCup);
		
		//getter/setter 사용
		((Starbucks) order).setNickname("바둑이");
		userOrderMenu=order.getOrderMenu();
		userOrderCup=order.getOrderCup();
		
		//다형성이 적용되어 캐스팅을 통해 메소드 호출
		((Starbucks) order).welcome();
		((Starbucks) order).order();
		((Starbucks) order).pickup();
	} // end main
} // end ExecuteClass