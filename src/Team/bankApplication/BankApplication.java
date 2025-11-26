package Team.bankApplication;

import java.util.Scanner;
import Team.ControlAccount.*;

public class BankApplication {

    public static void main(String[] args) {
        PrintApplicationFormat format = new PrintApplicationFormat();
        Scanner scan = new Scanner(System.in);
        AccountFormat[] Account = new AccountFormat[100];
        CreateAccount CreateAccount = new CreateAccount();
        PrintAccountList PrintAccountList = new PrintAccountList();
        Deposit AddMoney = new Deposit();
        Withdrawal MinusMoney = new Withdrawal();

        for (int i = 0; i < 100; i++)
        {
            Account[i] = new AccountFormat();
        }
        int j = 0;
        quit:	while(true)
        {
            format.printFormat();
            String input = scan.nextLine();
            if (input.trim().isEmpty())
            {
                System.out.println("입력이 비었습니다. 다시 입력해주십시오.");
                continue;
            }

            int choice = Integer.parseInt(input);
            switch(choice) {
                case 1: //계좌생성
                    format.printAccountCreateFormat();
                    Account[j] = CreateAccount.getAcc();
                    j++;
                    break;
                case 2: // 목록출력
                    format.printAccountListFormat();
                    PrintAccountList.printList(Account, j);
                    break;
                case 3: //예금
                    format.printDepositFormat();
                    AddMoney.MoneyDeposit(Account, j);
                    break;
                case 4: //출금
                    format.printWithdrawalFormat();
                    MinusMoney.MoneyWithdrawal(Account, j);
                    break;
                case 5: //종료
                    format.printExit();
                    break quit;
                default:
                    System.out.println("목록에 없는 숫자입니다. 다시 입력해주십시오.");
                    continue;
            }
        }
        scan.close();
    }

}