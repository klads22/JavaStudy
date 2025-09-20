package ch02.sec07;

public class PromotionExample {
	public static void main(String[] args) {
		//자동 타입변환 예시
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		//int형을 char으로 변환
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		//int형을 long으로 변환
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		//long을 float로 변환, 실수타입으로 변환
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		//float를 double로 변환
		floatValue =100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
	}
}
