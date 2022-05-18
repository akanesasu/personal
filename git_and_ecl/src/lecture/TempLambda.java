package lecture;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TempLambda {
	public int outerField = 10;
	private MyFII outerFi;
	
	class Inner {
		int innerField = 20;
		
		void method(final String name) {
			//모든 지역변수와 매개변수는 JVM Stack Area에 보관되는데 
			//이걸 final을 붙여서 clazz객체 안의 상수 풀로 옮겨서 cycle을 늘림
			//람다식이 사용하는 변수에만 붙이면 됨(컴파일러가 알아서 붙여줌)
			int age = 23;
//			age = 25; 컴파일러가 알아서 final 붙였기 때문에 못바꿈
			
			//람다식이 생성한 익명구현객체 역시 Heap 영역에 생성됨(GC될 때 죽음)
			//Closure 문제 : 객체는 살아있지만 지역변수가 죽는 것(life cycle이 다름)
			MyFII fi = () -> {
				System.out.println(">>>> 2. this in a lambda expression : " + this);
				System.out.println("\t\t\t+ type : " + this.getClass().getName());
				
				//멤버클래스에 선언된 필드 이름 직접 사용
				System.out.println("innerField : " + innerField);
				//가장 바깥쪽 클래스에 선언된 필드를 이름으로 직접 사용
				System.out.println("outerField : " + outerField);
				// 메소드 블록 내에서 정의된 지역변수와 매개변수 사용(Closure 문제 발생)
				System.out.println("age : " + age);
				System.out.println("name : " + name);
				
			}; // 람다식을 이용한 타겟타입에 대한 익명구현객체 생성
			
			outerFi=fi;
			
			System.out.println(">>>> 1. fi : " + fi.getClass().getName());
			
			fi.method();
		} // end method
	} // end Inner

	public static void main(String[] args) {
		TempLambda tl = new TempLambda();
		TempLambda.Inner inner = tl.new Inner();
		inner.method("홍길동");
	} // main
} // end class

interface MyFII {
	public abstract void method();
} // end interface