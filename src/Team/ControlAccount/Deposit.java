package Team.ControlAccount;

import java.util.Scanner;

public class Deposit {

    Scanner in = new Scanner(System.in);

    public void MoneyDeposit(AccountFormat[] Account, int j)
    {
        System.out.print("계좌번호: ");
        String FindNumber = in.nextLine();
        for (int i = 0; i < j; i++)
        {
            if (FindNumber.equals(Account[i].getAccountNumber()))
            {
                System.out.print("예금액: ");
                String Money = in.nextLine();
                Account[i].setMoney(Integer.parseInt(Money));
                break;
            }
        }

    }
}