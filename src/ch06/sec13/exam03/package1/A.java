package ch06.sec13.exam03.package1;

public class A {
	//public 접근 제한을 갖는 필드
	public int field1;
	//default 접근 제한을 갖는 필드
	int field2;
	//private 접근 제한을 갖는 필드
	private int field3;
	
	//생성자 선언
	public A() {
		field1=1;	//O
		field2=1;	//O
		field3=1;	//O
		
		method1(); 	//O
		method2();	//O
		method3();	//O
	}
	
	//public 접근 제한을 갖는 메소드
	public void method1() {
		
	}
	
	//default 접근 제한을 갖는 메소드
	void method2() {
		
	}
	
	//private 접근 제한을 갖는 메소드
	private void method3() {
		
	}

}
