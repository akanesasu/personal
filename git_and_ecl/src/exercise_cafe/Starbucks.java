package exercise_cafe;

import java.text.DecimalFormat;
import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Starbucks extends Order implements Orderable {
	
	//getter/setter 사용을 위한 접근제어자 설정, 상속받은 필드는 필요 없으니 제거
	private String nickname="";
	private int orderPrice = 0;
	
	//메뉴는 일단은 배열로
	String[] menu = {"아메리카노","카페 라떼","자바 칩 프라푸치노","자몽 허니 블랙티"};
	int[] price = {4500, 5000, 6000, 5500};
	
	public Starbucks(String nickname, String name, int cup) {
		super(name, cup);
		this.nickname = nickname;
	} // constructor
	
	@Override
	public void welcome() {
		System.out.println("안녕하세요! 스타벅스입니다!");
	} // end welcome
	
	@Override
	public void order() {
		//for문으로 메뉴판 호출
		System.out.println("----------MENU----------");
		for(int i=0;i<menu.length;i++) {
			System.out.println(menu[i] + " : " + price[i] + "원");
		} // for
		System.out.println("------------------------");
		
		//메뉴 선택(지금은 I/OStream 대신 scanner로 입력)
		System.out.print("주문하실 메뉴를 선택해주세요. >> ");
		Scanner om = new Scanner(System.in);
		setOrderMenu(om.nextLine());
		
		//while문으로 메뉴에 따른 가격 설정
		int i=0;
		while(i<menu.length) {
			if(menu[i].equals(getOrderMenu())) {
				setOrderPrice(price[i]);
			}
			i++;
		} // while
		
		//자바칩 프라푸치노 주문 시 휘핑크림 추가 여부
		Scanner wh = new Scanner(System.in);
		if(getOrderMenu().equals("자바 칩 프라푸치노")) {
			String whip;
			boolean isWhip = false;
			
			System.out.print("휘핑크림 올려드릴까요? (네/아니오) >> ");
			whip = wh.nextLine();
			
			//boolean 사용을 위한 불필요한... 변수설정
			if(whip.equals("네")) {
				isWhip = true;
			} else if(whip.equals("아니오")) {
				isWhip = false;
			}
			
			if(isWhip==true) {
				System.out.println("휘핑크림은 올리겠습니다.");
			} else {
				System.out.println("휘핑크림은 빼겠습니다.");
			}
		}
		
		//잔수 선택
		System.out.println();
		System.out.print("몇 잔 드릴까요? >> ");
		Scanner oc = new Scanner(System.in);
		setOrderCup(oc.nextInt());
		
		//천의자리 콤마
		DecimalFormat df = new DecimalFormat("###,###");
		
		//주문확인, 총 가격
		System.out.println();
		System.out.println(getOrderMenu() + " " + getOrderCup() + "잔 주문받았습니다. 총 "
				+ df.format(getOrderCup()*getOrderPrice()) + "원 입니다. 잠시만 기다려주세요!");
		System.out.println("");
		wh.close();
		om.close();
		oc.close();
	} // end order
	
	@Override
	public void pickup() {
		//닉네임도 불러줌
		System.out.println(getNickname() + "님 주문하신 " + getOrderMenu() + " " + getOrderCup() + "잔 나왔습니다. 맛있게 드세요!");
	} // end pickup
	
} // end Starbucks