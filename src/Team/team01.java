package Team;

import java.util.Scanner;

public class team01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int bank = 0;
		int out_bank = 0;
		boolean ing = true;
		
		while(ing) {
			System.out.println("-------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------");
			System.out.println("선택: ");
			
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				System.out.println("예금액: ");
				bank = scanner.nextInt();
			} else if(strNum.equals("2")) {
				System.out.println("출금액: ");
				out_bank = scanner.nextInt();
				bank -= out_bank;
			} else if(strNum.equals("3")) {
				System.out.println("잔고 : "+bank);
			} else if(strNum.equals("4")) {
				System.out.println("프로그램 종료");
				break;
			}
		} 
	}
}
