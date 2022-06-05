package exercise_cafe;

import java.util.TreeMap;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Starbucks extends OrderServiceImpl {

	private String nickname="";
	private int orderPrice = 0;
	
	public Starbucks(String nickname, String name, int cup, TreeMap<String, Integer> orderList) {
		super(name, cup, orderList);
		this.nickname = nickname;
	} // constructor

	public void menuSetting() {
		menuBoard.put("아메리카노", 4100);
		menuBoard.put("카페 라떼", 4600);
		menuBoard.put("자바 칩 프라푸치노", 6100);
		menuBoard.put("자몽 허니 블랙티", 5300);
	}
	
	@Override
	public void welcome() {
		System.out.println("안녕하세요! 스타벅스입니다!");
	} // end welcome
	
	@Override
	public void order() {

	} // end order
	
	@Override
	public void pickup() {
		//닉네임도 불러줌
		System.out.println(getNickname() + "님 주문하신 음료 나왔습니다. 맛있게 드세요!");
	} // end pickup
	
} // end Starbucks