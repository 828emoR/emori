package homework220322;

public class StringTrimExample {
	public static void main(String[] args) {
		String tel1 = " 02";
		String tel2 = "123  ";
		String tel3 = "  1234  ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim(); // trim 명령어의 효과가 공백 제거인듯 하다.
		System.out.println(tel);
	}

}
