package homework220322;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "자바 코딩노예 1호'코드몽키' 프로그래밍";//자바-프로그래밍 사이 문자열이 얼마나 있는지 확인하는 듯 하다.

		int location = subject.indexOf("프로그래밍");//위치를 먼저 찾는다. 1번째 찾는 문자는 "프로그래밍"
		System.out.println(location);//"해당 문자를 찾은 후 location 을 출력한다. /? location이 int 정의 되어있으므로 1번 문자열부터 찾은 문자열까지의 거리를 수로 나타낸다.

		if (subject.indexOf("자바") != -1) {//만약 어느 문자열 바로 이전칸에 "자바" 가 있을경우
			System.out.println("쌉노예쉨ㅋㅋㅋ");//출력한다 "쌉노예쉨ㅋㅋㅋ" 
		} else {//아닐경우
			System.out.println("부럽다..");//출력한다 "부럽다.."
		}
	}

}
