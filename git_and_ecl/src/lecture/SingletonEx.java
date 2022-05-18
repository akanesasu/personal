package lecture;

public class SingletonEx {

	public static void main(String[] args) {	
		//MasterKey key = MasterKey.key; : static init보다 먼저 생성될 우려가 있음 
		MasterKey key = MasterKey.getInstance();
		System.out.println(key);
	} //main
	
} //end class

class MasterKey {
	private static MasterKey key; //공유를 위해 필드, 먼저 생성을 막기위해 private,
								  //static init를 사용하기 위해 static
		
	//JVM이 단 한번만 수행하는 블록을 보장
	static {
		key = new MasterKey(); //GC에 들어가지 않게 필드에 담아줌
	} //static initializer
	
	private MasterKey() {} //default constructor
	
	public static MasterKey getInstance() {
		return MasterKey.key;
	} //private를 입힌 내부 key를 외부에서 가져갈 수 있게끔
	  //그러나 main에서 객체를 만들 수 없기 때문에 static, this는 빼줌
	
} //end class