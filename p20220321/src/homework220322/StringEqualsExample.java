package homework220322;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("김주환");//"" 안에 본인이름 입력. 
		String strVar2 = "김주환";
		
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		}else{
			System.out.println("다른 String 객체를 참조");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐");
		}else {
			System.out.println("다른 문자열을 가짐");
		}
	}

}
//해당 코드 이용해서 Id 로 응용하게 되면 Scanner 사용해서 임의값 넣고 비교하게 해도 될듯함.