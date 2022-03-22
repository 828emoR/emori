package com.edu.nested;

public class Outer {
	//
	private String field1;
	private int field2;
	
	
	class Inner{//로컬클래스. 멤버 클래스.
		String field3;
		int field4;
		
		void method2() {
			System.out.println("Inner.method2()");
		}
	}
	
	//함수적 인터페이스:구현해야 할 메소드가 하나인 것.
    interface Runnable{
    	void run();
    }
	
    class Bus implements Runnable{

		@Override
		public void run() {
			System.out.println("하와와 버스쟝 달리는거시와요");
		}
    	
    }
    
	public String getField1() {
		return field1;
	}
	public void method1() {
		System.out.println("outer.method1()");
		Inner inner = new Inner();
		inner.method2();
	}
	
	public void method3() {
		System.out.println("outer.method3()");
		class Local{   //로컬클래스 
			
			void method4() {
				System.out.println("Local.method4()");
			}
		}
	
		Local local = new Local();
		local.method4();
	}
	public void method4() {
		Runnable runnable = new Bus();//인터페이스의 구현목적이기 때문에 가
		runnable.run();
		
		//익명구현객체.
		//Lambda 표현식
		//interface 안에 지정된 메소드가 하나일 경우에만 익명구현객체를 쓸 수 있다 게이야...
		//runnable = () -> System.out.println("임의의 객체를 실행합니다."); // function
		
		//
		
		runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("임의의 객체를 실행합니다.");
			}
			
		};
		runnable.run();
	}
}
/*한번 구현 후 쓰고 버려짐 불쌍한쉨...*/