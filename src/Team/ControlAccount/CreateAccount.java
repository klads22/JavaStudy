package Team.ControlAccount;

import java.util.Scanner;
//import controlAccount.AccountFormat.*;
//import bankApplication.BankApplication;

public class CreateAccount {

    Scanner in = new Scanner(System.in);

    public AccountFormat getAcc() {
        AccountFormat Acc = new AccountFormat();

        System.out.print("계좌번호: ");
        String AccountNumber = in.nextLine();
        Acc.setAccountNumber(AccountNumber);

        System.out.print("계좌주: ");
        String AccountName = in.nextLine();
        Acc.setAccountName(AccountName);

        System.out.print("초기입금액: ");
        String Money = in.nextLine();
        Acc.setMoney(Integer.parseInt(Money));

        System.out.println("결과: 계좌가 생성되었습니다.");
        return Acc;
    }

}
