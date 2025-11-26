package Team.ControlAccount;

import java.util.Scanner;

public class Withdrawal {

    Scanner in = new Scanner(System.in);

    public void MoneyWithdrawal(AccountFormat[] Account, int j)
    {
        System.out.print("계좌번호: ");
        String FindNumber = in.nextLine();
        for (int i = 0; i < j; i++)
        {
            if (FindNumber.equals(Account[i].getAccountNumber()))
            {
                System.out.print("출금액: ");
                String Money = in.nextLine();
                if (Integer.parseInt(Money) <= Account[i].getMoney())
                {
                    Account[i].set2Money(Integer.parseInt(Money));
                    System.out.println("결과: 출금이 성공되었습니다.");
                    break;
                }
                else
                {
                    System.out.println("결과: 잔액이 부족합니다.");
                    break;
                }

            }
        }
    }
}