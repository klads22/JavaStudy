package Team.bankApplication;

public class PrintApplicationFormat {
    void printFormat()
    {
        System.out.println("-----------------------------------");
        System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
        System.out.println("-----------------------------------");
        System.out.print("선택> ");
    }

    void printAccountCreateFormat()
    {
        System.out.println("------------");
        System.out.println("계좌생성");
        System.out.println("------------");
    }

    void printAccountListFormat()
    {
        System.out.println("------------");
        System.out.println("계좌목록");
        System.out.println("------------");
    }

    void printDepositFormat()
    {
        System.out.println("------------");
        System.out.println("예금");
        System.out.println("------------");
    }

    void printWithdrawalFormat()
    {
        System.out.println("------------");
        System.out.println("출금");
        System.out.println("------------");
    }
    void printExit()
    {
        System.out.println("프로그램 종료");
    }
}