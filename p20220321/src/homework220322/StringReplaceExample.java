package homework220322;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바는 객체지향언어입니다. 자바는 풍부한 API를 지원합니다. 이것은 수많은 공돌이들이 흘린 피와 땀입니다.";
		String newStr = oldStr.replace("자바", "JAVA"); //replace:()안의 첫번째 자리(newStr)의 문자열과 두번째(oldStr) 문자열의 자리를 교환한다.
													  //Ex) newStr="자바", oldStr"JAVA" <-서로 교환.  //한 줄 입력으로 여러개 교환은 불가능한가?
		System.out.println(oldStr);					 //서로 바뀌기 전의 문장을 출력
		System.out.println(newStr);					//서로 바뀌고 난 후의 문장을 출력.
	}

}
